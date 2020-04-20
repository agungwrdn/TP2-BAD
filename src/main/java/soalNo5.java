
import com.rocketfuel.sdbc.base.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahardian
 */
public class soalNo5 {
    public static void main(String []args) throws SQLException {
        String url = "jdbc:postgresql://18.139.225.232:5432/ebookshop";
        Properties props = new Properties();
        props.setProperty("user","rawon");
        props.setProperty("password","1234567890");
        props.setProperty("ssl","false");
        java.sql.Connection conn = DriverManager.getConnection(url, props);
        
        //Membuat Table Books
        createTableBooks(conn);
        
        //Menambah Data Books
        addDataBooks(conn);
        
        //Get Data Books
        getDataBooks(conn);
        
    }

    private static void createTableBooks(java.sql.Connection conn) throws SQLException {
        System.out.println("---------Do Create Table---------");
        Statement stmt = conn.createStatement();
        String query = "CREATE TABLE IF NOT EXISTS books ("
                + "id int primary key,"
                + "title varchar(50),"
                + "author varchar(50),"
                + "price float,"
                + "qty int);";
        
        boolean create = stmt.execute(query);
        if (!create) {
            System.out.println("Create Table Berhasil \n");
        } else {
            System.out.println("Create Table Gagal \n");
        }
    }

    private static void addDataBooks(java.sql.Connection conn) throws SQLException {
        System.out.println("----Do Insert Data----");
        Statement stmt = conn.createStatement();
        String query = "INSERT INTO books(id, title, author, price, qty) VALUES"
                + "(1001, 'Java for dummies', 'Tah Ah Teck', 11.11, 11),"
                + "(1002, 'More Java for dummies', 'Tah ah Teck', 22.22, 22),"
                + "(1003, 'More Java for more dummies', 'Mohammad Ali', 33.33, 33),"
                + "(1004, 'A Cup of Java', 'Kumar', 44.44, 44),"
                + "(1005, 'A Teaspoon of Java', 'Kevin Jones', 55.55, 55)"
                + "ON CONFLICT (id) DO UPDATE SET title = EXCLUDED.title, author = EXCLUDED.author, price = EXCLUDED.price, qty = EXCLUDED.qty;";
        
        boolean add = stmt.execute(query);
        if (!add) {
            System.out.println("Tambah Data Berhasil \n");
        } else {
            System.out.println("Tambah Data Gagal \n");
        }
    }

    private static void getDataBooks(java.sql.Connection conn) throws SQLException {
        System.out.println("---------------Do Get Data books----------------");
        Statement stmt = conn.createStatement();
        String query = "SELECT * FROM books";
        ResultSet result = stmt.executeQuery(query);
        System.out.println("id | title | author | price | qty");
        while (result.next()) {
            int id = result.getInt("id");
            String title = result.getString("title");
            String author = result.getString("author");
            Float price = result.getFloat("price");
            int qty = result.getInt("qty");
            System.out.println(id+" | "+title+" | "+author+" | "+price+" | "+qty);
        }
    }
}
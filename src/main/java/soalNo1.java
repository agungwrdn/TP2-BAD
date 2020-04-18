
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahardian
 */
public class soalNo1 {
    public static void main(String []args) throws Exception {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Masukan Panjang");
        int panjang = scan.nextInt();

        if (panjang < 0) {
           throw new Exception("Negative number entered");
        }

        System.out.println("Masukan lebar");
        int lebar = scan.nextInt();

        if (lebar < 0) {
           throw new Exception("Negative number entered");
        }

        System.out.println("Masukan Tinggi");
        int tinggi = scan.nextInt();

        if (tinggi < 0) {
           throw new Exception("Negative number entered");
        }
    }
}

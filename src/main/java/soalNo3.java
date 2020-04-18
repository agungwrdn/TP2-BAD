
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
public class soalNo3 {
    public static void main(String []args) {
        int angka1, angka2, angka3;
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan Angka Pertama:");
        angka1 = s.nextInt();
        System.out.print("Masukan Angka Kedua:");
        angka2 = s.nextInt();
        System.out.print("Masukan Angka Ketiga:");
        angka3 = s.nextInt();
        if(angka1 > angka2 && angka1 > angka3)
        {
            System.out.println("Angka Terbedsar Adalah:"+angka1);
        }
        else if(angka2 > angka3)
        {
            System.out.println("Angka Terbedsar Adalah:"+angka2);
        }
        else
        {
            System.out.println("Angka Terbedsar Adalah:"+angka3);
        }
    }
}

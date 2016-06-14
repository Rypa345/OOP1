/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalifelse;
import java.util.Scanner;
/**
 *
 * @author RYPA345
 */
public class SoalIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlah = 0;
        int input = 0;
        String ab = "y";
        int poin = 0;
        String jawab;
        int salah = 50;
     do {
    Scanner scan = new Scanner(System.in);
            System.out.println("1.Berikut adalah fasilitas Windows yang dapat digunakan untuk membantu melakukan manajemen file adalah ….");
            System.out.println(" a. web browser");
            System.out.println("b. Windows Explorer ");
            System.out.println("c. filling cabinet ");
            System.out.println("d. search engine");
             System.out.println("e. Internet Explorer");
              System.out.print("Jawaban Anda :");
            jawab = scan.next();
            if ("b".equals(jawab)) {
                System.out.println("jawaban anda benar");
                System.out.print("poin anda adalah : ");
                System.out.println(poin += 1);
                ;
            } else {
                System.out.println("jawaban anda salah");
                System.out.println("jawaban yang benar adalah B");
                System.out.print("poin anda adalah : ");
                System.out.println(poin += 0);
                System.out.println("");

            }
            jumlah = poin * 2;
            if (jumlah >= 80) {
                System.out.println("Jumlah nilai anda adalah : " + jumlah);
                System.out.println("Ranking anda adalah : A");
                System.out.print("Jumlah jawaban salah :");
                System.out.print(salah - jumlah);
            } else if (jumlah >= 70) {
                System.out.println("Jumlah nilai anda adalah : " + jumlah);
                System.out.println("Ranking anda adalah : B");
                System.out.print("Jumlah jawaban salah :");
                System.out.print(salah - jumlah);
            } else if (jumlah >= 60) {
                System.out.println("Jumlah nilai anda adalah : " + jumlah);
                System.out.println("Ranking anda adalah : C");
                System.out.print("Jumlah jawaban salah :");
                System.out.print(salah - jumlah);
            } else if (jumlah >= 40) {
                System.out.println("Jumlah nilai anda adalah : " + jumlah);
                System.out.println("Ranking anda adalah : D");
                System.out.print("Jumlah jawaban salah :");
                System.out.print(salah - jumlah);
            } else {
                System.out.println("Jumlah nilai anda adalah : " + jumlah);
                System.out.println("Ranking anda adalah : E");
                System.out.print("Jumlah jawaban salah :");
                System.out.println(salah - jumlah);
            }

            System.out.println("apakah anda ingin mengulang ? y/t");
            ab = scan.next();
        } while ("y".equals(ab));
     }
}

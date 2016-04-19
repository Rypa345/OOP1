/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip;
import java.util.Scanner;
/**
 *
 * @author RYPA
 */
public class IP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float ip;
        int lulus, tdklulus, valid = 0, jumlah, bil = 0, rata, NilaiMin = 1000;
        IP ukuran = new IP();

        System.err.println(range.isWithinRange(2, 0, 4));
        ip = input.nextFloat();
        while (ip != -999) {
            ip = input.nextFloat();
            if (isWithinRange(ip, 0, 4) == 1) {
                valid++;
            }
            if (ip == -999) {
                System.out.println("Masukan jumlah mahasiswa !");
                jumlah = input.nextInt();
                if (ip <= 2.75) {
                    bil = input.nextInt();
                    if (bil <= 2.75) {
                        jumlah++;
                    }
                    NilaiMin = bil;
                }
                System.out.println("Nilai Minimalnya : " + NilaiMin);
            }
        }
    }
}
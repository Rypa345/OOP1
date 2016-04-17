/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitungnilai;
import java.util.Scanner;
/**
 *
 * @author hady
 */
public class MenghitungNilai {
    public static void main (String [] hady){
        String nama , nim ;
        final double n_tugas , n_uts , n_kuis , n_uas , n_akhir;
        Scanner input = new Scanner (System.in);
  System.out.println("===== Menghitung Nilai Mahasiswa=====\n");
        System.out.print("Masukan nama : ");
        nama = input.nextLine();
        System.out.print("Masukan NIM : ");
        nim = input.nextLine();
        System.out.print("Nilai tugas : ");
        n_tugas = input.nextInt();
        System.out.print("Nilai kuis : ");
        n_kuis = input.nextInt();
        System.out.print("Nilai uts : ");
        n_uts = input.nextInt();
        System.out.print("Nilai uas : ");
        n_uas = input.nextInt();
        n_akhir = (0.15 * n_tugas + 0.20 * n_kuis + 0.30 * n_uts + 0.35 * n_uas);
        System.out.println(nama+" dengan NIM "+nim+" memiliki nilai akhir "+n_akhir);
    }
}
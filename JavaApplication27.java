/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;
import java.util.Scanner;
/**
 *
 * @author RYPA
 */
public class JavaApplication27 {

    public static void main(String[] args) {
        int Nilai, bil1, i, NilaiMin = 1000, jml = 1, NilaiMax = 1;
        char pil;

        Scanner input = new Scanner(System.in);
        System.out.println(":");
        Nilai = input.nextInt();
        System.out.println(":");
        pil = input.next().charAt(0);

        if (pil == 'A') {
            for (i = 0; i < Nilai; i++) {
                bil1 = input.nextInt();
                if (bil1 <= NilaiMin) {
                    if (bil1 == NilaiMin) {
                        jml++;
                    }
                    NilaiMin = bil1;
                }
            }

            System.out.println( " "+ NilaiMin);
            System.out.println(" " + jml);

        } else if (pil == 'B') {
            for (i = 0; i < Nilai; i++) {
                bil1 = input.nextInt();
                if (bil1 >= NilaiMax) {
                    if (bil1 == NilaiMax) {
                        jml++;
                    }
                    NilaiMax = bil1;
                }

            }
            System.out.println("min : " + NilaiMin);
            System.out.println("J : " + jml);
        }
    }
}


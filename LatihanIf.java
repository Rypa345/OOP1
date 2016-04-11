/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanif;
  import java.util.Scanner;

/**
 *
 * @author RYPA
 */
public class LatihanIf {


    public static void main(String[] args) {

        //membuat scanner baru
        Scanner x = new Scanner(System.in);
        System.out.println("Program Konversi Nilai");
        System.out.println("Masukkan nilai (0-100) : ");
        //membuat variabel untuk menampung nilai scanner
        int a = x.nextInt();
        
        //pengondisian dan memunculkan nilai dalam bentuk huruf
        if(a>=80 && a<=100){
            System.out.println("Nilai Anda A");
        }
        else if(a<80 && a>=70){
            System.out.println("Nilai Anda B");
        }
        else if(a<70 && a>=60){
            System.out.println("Nilai Anda C");
        }
        else if(a<60 && a>=45){
            System.out.println("Nilai Anda D");
        }
        else if(a<45 && a>=0){
            System.out.println("Nilai Anda E");
        }
        else{
            System.out.println("Nilai yang Anda masukkan salah");
        }
    } 
}

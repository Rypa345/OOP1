/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar4;

import java.util.Scanner;

public class PersegiPanjang implements BangunDatar4 {
    int luas, panjang, lebar, keliling;

    public PersegiPanjang(int luas, int panjang, int lebar, int keliling) {
        this.luas = luas;
        this.panjang = panjang;
        this.lebar = lebar;
        this.keliling = keliling;
    }

    PersegiPanjang() {
        
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getKeliling() {
        return keliling;
    }

    public void setKeliling(int keliling) {
        this.keliling = keliling;
    }

    @Override
    public void hitungLuas() {
       System.out.println("Masukkan nilai panjang: ");
       Scanner sc = new Scanner(System.in);
       int panjang = sc.nextInt();
       
       System.out.println("Masukkan nilai lebar: ");
       Scanner ss = new Scanner(System.in);
       int lebar = sc.nextInt();
       luas = panjang * lebar;
       System.out.println("Luas Persegi Panjang adalah " +luas);
    }

    @Override
    public void hitungKeliling() {
       System.out.println("Masukkan nilai panjang: ");
       Scanner sc = new Scanner(System.in);
       int panjang = sc.nextInt();
       
       System.out.println("Masukkan nilai lebar: ");
       Scanner ss = new Scanner(System.in);
       int lebar = sc.nextInt();
       keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang adalah " +keliling);
    }

    @Override
    public void volume() {
        
    }
}
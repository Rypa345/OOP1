/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar4;

/**
 *
 * @author RYPA345
 */
import java.util.Scanner;

public class Persegi implements BangunDatar4{
    int luas, keliling, sisi;

    public Persegi(int luas, int keliling, int sisi) {
        this.luas = luas;
        this.keliling = keliling;
        this.sisi = sisi;
    }

    Persegi() {
        
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public int getKeliling() {
        return keliling;
    }

    public void setKeliling(int keliling) {
        this.keliling = keliling;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        
        System.out.println("Masukkan nilai sisi1: ");
        Scanner sc = new Scanner(System.in);
        int sisi = sc.nextInt();
        luas = sisi * sisi;
        System.out.println("Luas Persegi:" + " " +luas);
    }

    @Override
    public void hitungKeliling() {
        System.out.println("Masukkan nilai sisi: ");
        Scanner sc = new Scanner(System.in);
        int sisi = sc.nextInt();
        keliling = 4 * sisi;
        System.out.println("Keliling Persegi:" + " " +keliling); 
    }

    @Override
    public void volume() {
        
    }
    
    
}
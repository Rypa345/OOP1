/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar4;
import java.util.Scanner;

public class Segitiga implements BangunDatar4 {
    int alas, ab, ac, bc, keliling, tinggi;
    float luas;

    public Segitiga(int alas, int ab, int ac, int bc, int keliling, int tinggi, float luas) {
        this.alas = alas;
        this.ab = ab;
        this.ac = ac;
        this.bc = bc;
        this.keliling = keliling;
        this.tinggi = tinggi;
        this.luas = luas;
    }

    Segitiga() {
        
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getAb() {
        return ab;
    }

    public void setAb(int ab) {
        this.ab = ab;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getBc() {
        return bc;
    }

    public void setBc(int bc) {
        this.bc = bc;
    }

    public int getKeliling() {
        return keliling;
    }

    public void setKeliling(int keliling) {
        this.keliling = keliling;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public float getLuas() {
        return luas;
    }

    public void setLuas(float luas) {
        this.luas = luas;
    }

    @Override
    public void hitungLuas() {
        System.out.println("Masukkan nilai bc: ");
        Scanner sc = new Scanner(System.in);
        int bc = sc.nextInt();
        
        System.out.println("Masukkan nilai tinggi: ");
        Scanner ss = new Scanner(System.in);
        int tinggi = ss.nextInt();
        
        luas = (float) (0.5 * bc * tinggi);
        System.out.println("Luas Segitiga adalah " +luas);
    }

    @Override
    public void hitungKeliling() {
        System.out.println("Masukkan nilai ab: ");
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        
        System.out.println("Masukkan nilai ab: ");
        Scanner ss = new Scanner(System.in);
        int ac = ss.nextInt();
        
        System.out.println("Masukkan nilai ab: ");
        Scanner sd = new Scanner(System.in);
        int bc = sd.nextInt();
        
        keliling = ab + ac + bc;
        System.out.println("Keliling Segitiga adalah " +keliling);
    }

    @Override
    public void volume() {
        
    }
}
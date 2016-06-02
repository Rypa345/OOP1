package com.bangundatar.abstrak;

public class Segitiga extends BangunDatar {
    int alas, ab, ac, bc, keliling, tinggi;
    float luas;

    public Segitiga(float luas, int alas, int ab, int ac, int bc, int keliling, int tinggi) {
        this.luas = luas;
        this.alas = alas;
        this.ab = ab;
        this.ac = ac;
        this.bc = bc;
        this.keliling = keliling;
        this.tinggi = tinggi;
    }

    Segitiga() {
        
    }

    public float getLuas() {
        return luas;
    }

    public void setLuas(float luas) {
        this.luas = luas;
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
    
    
    
    @Override
    void hitungLuas() {
        bc = 5;
        tinggi = 3;
        luas = (float) (0.5 * bc * tinggi);
        System.out.println("Luas Segitiga:" + " " +luas);
    }

    @Override
    void hitungKeliling() {
        ab = 5;
        ac = 4;
        bc = 6;
        keliling = ab + ac + bc;
        System.out.println("Keliling Segitiga:" + " " +keliling);
    }
}

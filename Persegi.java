package com.bangundatar.abstrak;

public class Persegi extends BangunDatar {
    int luas, sisi, keliling;

    public Persegi(int luas, int sisi, int keliling) {
        this.luas = luas;
        this.sisi = sisi;
        this.keliling = keliling;
    }

    Persegi() {
        
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getKeliling() {
        return keliling;
    }

    public void setKeliling(int keliling) {
        this.keliling = keliling;
    }
    
    

    @Override
    void hitungLuas() {
        sisi = 5;
        luas = sisi * sisi;
        System.out.println("Luas Persegi:" + " " +luas);
    }
    

    @Override
    void hitungKeliling() {
        sisi = 6;
        keliling = 4 * sisi;
        System.out.println("Keliling Persegi:" + " " +keliling);
    
    }
    
}

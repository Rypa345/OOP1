package com.bangundatar.abstrak;

public class PersegiPanjang extends BangunDatar{
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
    void hitungLuas() {
        panjang = 6;
        lebar = 4;
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang:" + " " +luas);
    }

    @Override
    void hitungKeliling() {
        panjang = 6;
        lebar = 5;
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang" + " " +keliling);
    }
    
}

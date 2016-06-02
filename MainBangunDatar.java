package com.bangundatar.abstrak;

public class MainBangunDatar {
    public static void main(String[] args) {
        Polymorp poly = new Polymorp();
        poly.poly(new Persegi());
        poly.poly(new PersegiPanjang());
        poly.poly(new Segitiga());
    }
}
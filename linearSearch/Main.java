package com.linearSearch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main lineer = new Main();

        int dizi[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner klavye = new Scanner(System.in);
        System.out.print("Rakam Giriniz : ");

        int aranan = klavye.nextInt();
        int sonuc = lineer.dogrusal(dizi, 0, aranan);

        if (sonuc != -1)
            System.out.println("Aradığınız Değerin Index' i : " + sonuc);

        else
            System.out.println("Değer Listede Yok");
    }


    int dogrusal (int dizi[], int baslangıc, int aranan) {
        if (baslangıc > dizi.length)
            return -1;

        if (aranan == dizi[baslangıc])
            return baslangıc;

        return dogrusal(dizi, baslangıc + 1, aranan);
    }
}
package com.binarySearch;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Main binary = new Main();

        int dizi[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int diziuzunluk = dizi.length;

        System.out.print("Sayı Giriniz : ");
        Scanner klavye = new Scanner(System.in);

        int sayı = klavye.nextInt();
        int sonuc = binary.ikili(dizi, 0, diziuzunluk, sayı);

        if (sonuc != -1)
            System.out.println("Aranan Değerin index i : " + sonuc);

        else
            System.out.println("Aranan Değer Listede Yok");

    }

    int ikili(int dizi[], int l, int diziuzunluk, int sayı) {
        if (diziuzunluk >= l) {
            int orta = diziuzunluk / 2;

            if (dizi[orta] == sayı)
                return orta;

            if (dizi[orta] > sayı)
                return ikili(dizi, l, orta - 1, sayı);

            return ikili(dizi, orta + 1, diziuzunluk, sayı);
        }
        return -1;
    }
}
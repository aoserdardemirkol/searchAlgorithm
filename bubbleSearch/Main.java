package com.bubbleSearch;

public class Main {

    public static void main(String[] args) {
        int dizi[] = {3, 1, 2, 5, 8, 7, 4, 6, 9};
        System.out.print("Düzenlenmemiş Dizi : ");

        for (int i=0; i < dizi.length; i++)
            System.out.print(dizi[i] + " ");

        System.out.println(" ");

        Main bubble = new Main();
        bubble.kabarcık(dizi);

        System.out.print("Düzenlenmiş Dizi   : ");

        for (int j=0; j < dizi.length; j++)
            System.out.print(dizi[j] + " ");

    }

    void kabarcık(int dizi[]){
        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = 0; j < dizi.length - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    int degertut = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = degertut;
                }
            }
        }
    }
}
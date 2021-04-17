package com.example;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas_modul4 {
    static int belanjaan;
    static double lumyar, diskon, dahyar;
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static void showMenu() throws IOException {
        System.out.println("===Menu===");
        System.out.println("[1] Punya kartu member");
        System.out.println("[2] Tidak punya kartu member");
        System.out.println("[3] Keluar");
        System.out.print("Pilih Menu> ");

        int selectedMenu = Integer.parseInt(input.readLine());

        switch (selectedMenu) {
            case 1:
                yesmember();
                break;
            case 2:
                nomember();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
        }
    }

    static void yesmember() {
        if (belanjaan > 500000) {
            diskon = 0.5;
        } else if (belanjaan > 100000) {
            diskon = 0.25;
        } else {
            diskon = 0;
        }
        lumyar = belanjaan * diskon;
        dahyar = belanjaan - lumyar;
        System.out.println("Total Bayar: Rp " + dahyar);
    }

    static void nomember() {
        if (belanjaan > 250000) {
            diskon = 0.1;
        } else {
            diskon = 0;
        }
        lumyar = belanjaan * diskon;
        dahyar = belanjaan - lumyar;
        System.out.println("Total Bayar: Rp " + dahyar);
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tolong masukkan total belanja anda: ");
        belanjaan = scan.nextInt();
        do {
            showMenu();
        } while (isRunning);
    }
}
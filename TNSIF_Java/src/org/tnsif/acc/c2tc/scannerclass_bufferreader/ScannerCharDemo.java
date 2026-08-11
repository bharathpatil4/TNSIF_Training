package org.tnsif.acc.c2tc.scannerclass_bufferreader;

import java.util.Scanner;

public class ScannerCharDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.next();
        System.out.println("Name: " + name);

        System.out.println("Enter the required character:");
        char ch = scan.next().charAt(0);
        System.out.println("Character: " + ch);

        scan.close();
    }
}

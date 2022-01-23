package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var h = scanner.nextInt();
        if ((a == b && a > h) || (a > b && a > h)) {
            int total = 1;
            System.out.println(total);
        } else if (a > b && a < h) {
            int days = (1 + (h - b - 1)) / (a - b);
            System.out.println(days);
        } else {
            System.out.println("Impossible");
        }

    }
}
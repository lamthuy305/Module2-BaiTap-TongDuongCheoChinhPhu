package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn muốn nhập vào mảng vuông có độ dài là:\t");
        int length = scanner.nextInt();
        int[][] arr = new int[length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Nhập arr[%s][%s] = ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        int totalChinh = 0;
        int totalPhu = 0;
        for (int i = 0; i < arr.length; i++) {
            totalChinh += arr[i][i];
        }

        for (int i = 0; i < arr.length; i++) {
            totalPhu += arr[i][arr.length - 1 - i];
        }

        System.out.println("Mảng sau khi nhập là:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Tổng của đường chéo chính là " + totalChinh);
        System.out.println("Tổng của đường chéo phụ là " + totalPhu);
    }
}

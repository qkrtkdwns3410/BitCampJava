package javaBasic.ch6;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[0] >>arr[1]);
        System.out.println(arr[0] <<arr[1]);
    }
}

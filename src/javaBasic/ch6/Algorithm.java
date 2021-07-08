package javaBasic.ch6;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                Sum += i;
            }
        }
        System.out.println(Sum);
    }

}

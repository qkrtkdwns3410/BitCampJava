package javaBasic.ch6;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        float sum = 0;


        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.printf("%.2f ",sum/3);

        if ( sum / 3 >= 90) {
            System.out.print("A");
        } else if (sum / 3 >= 80) {
            System.out.print("B");
        } else if(sum/3 >=70){
            System.out.print("C");
        } else if (sum / 3 >= 60) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }

    }
}

package javaBasic.ch6.javaBasic.ch6;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        //문자를 하나씩 ..확인해서 박수
        for (int i = 1; i < num; i++) {
            if (i < 10) {
                if (i % 3 == 0) {
                    count++;
                }
            } else { //10이상이라면
                String a = Integer.toString(i); //숫자를 스트링으로 받아 분리해서 String형 배열 numa에 넣고
                String[] numa = a.split("");

//                for (int k = 0; k < numa.length; k++) {
//                    System.out.println(numa[k]);
//                }

                for (int j = 0; j < numa.length; j++) {
                    if (numa[j].contains("3") || numa[j].contains("6") || numa[j].contains("9")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);


    }
}


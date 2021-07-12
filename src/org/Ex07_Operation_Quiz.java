package org;

import java.util.Scanner;

/*
간단한 사칙 연산기 (+ , - , * , /)
입력값 3개 (입력값은 nextLine() 받아서 필요하다면 숫자 변환)
목적 : Integer.parseInt() ,  **equals() 활용**
화면
>입력값:숫자
>입력값(기호): +
>입력값:숫자
>연산결과 :200

-------------
>입력값:100
>입력값(기호): -
>입력값:100
>연산결과 :0s

예외 처리는 하지 마세요 (정상 값만 처리하는 것으로 합니다)

*/
public class Ex07_Operation_Quiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("(1/2) 숫자입력: ");
        int num1 = sc.nextInt();
        System.out.printf("연산자 입력: ");
        String str = sc.next();
        System.out.printf("(2/2) 숫자입력: ");
        int num2 = sc.nextInt();

//        if (str.equals("+")) {
//            System.out.println(num1 + num2);
//
//        } else if (str.equals("-")) {
//            System.out.println(num1 - num2);
//
//        } else if (str.equals("*")) {
//            System.out.println(num1 * num2);
//
//        } else {
//             System.out.printf("%.2f",(float) num1 / num2);
//        }
        switch (str) {
            case "+":
                System.out.println(num1 + num2);
                break;

            case "-":
                System.out.println(num1 - num2);
                break;

            case "*":
                System.out.println(num1 * num2);
                break;

            case "/":
                System.out.printf("%.2f",(float) num1 / num2);
                break;
            default:

        }

//문자열의 비교는 equals라는 것 안에서 처리하자.

    }
}














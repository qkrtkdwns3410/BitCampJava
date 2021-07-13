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
>연산결과 :0

예외 처리는 하지 마세요 (정상 값만 처리하는 것으로 합니다)

*/
public class Ex07_Operation_Quiz {
    public static void main(String[] args) {
        int result = 0;
        String str = "";
        int num1 = 0;
        int num2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.printf("(1/2) 숫자입력: ");
        num1 = Integer.parseInt(sc.nextLine());

        System.out.printf("연산자 입력: ");
        str = sc.nextLine();

        System.out.printf("(2/2) 숫자입력: ");
        num2 = Integer.parseInt(sc.nextLine());

        if (str.equals("+")) {
            result = num1 + num2;
            System.out.println(result);

        } else if (str.equals("-")) {
            result = num1 - num2;
            System.out.println(result);

        } else if (str.equals("*")) {
            result = num1 * num2;
            System.out.println(result);

        } else if (str.equals("/")) {
            result =num1/num2;
            System.out.printf("%d\n", result);

        } else {

            System.out.println("지원하지 않는 연산자 입니다.");
            //return >> 메인 함수안에서 실행중인데..[함수단위]]종결자 > main함수 탈출 > 종료
            return;

        }//System.exit(0); >>강제적인 프로그램 종료

        System.out.printf("[%d %s %d = %d]\n",num1,str,num2,result);



//        switch (str) {
//            case "+":
//                System.out.println(num1 + num2);
//                break;
//
//            case "-":
//                System.out.println(num1 - num2);
//                break;
//
//            case "*":
//                System.out.println(num1 * num2);
//                break;
//
//            case "/":
//                System.out.printf("%.2f",(float) num1 / num2);
//                break;
//            default:
//                System.out.println("지원하지 않는 연산자입니다.");
//        }


        /*

        1.    switch 조건 ********************(char ,String)********************
            Scanner sc = new Scanner(sys.in)
            char ch = sc.nextLine().charAt(0); //첫번째 값으로 ch초기화 //charAt은 몰랐음 >> charAt

            switch(ch){
            case '+' : ~~~
            *****************************

         */
//문자열의 비교는 equals라는 것 안에서 처리하자.

    }
}














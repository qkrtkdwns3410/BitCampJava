package org.bitcamp;

import java.util.Scanner;

public class Ex09_statement {
    public static void main(String[] args) {
        //while do~while
//        while (true) {
//            System.out.println("바보");
//        }
        //증가감 논리를 반드시 명시 하자
        int i = 10;
        while (i >= 10) { //10들어가고 true
            i--;//9
            System.out.println("i : " + i);//9출력~
        }

        //while 1~100까지의 합
        int sum = 0;
        int j = 1;
        while (j <= 100) {
            sum += j;
            j++;
        }
        System.out.println("sum:" + sum);
        System.out.println("*******************************************");

        int k = 2;
        int p = 1;
        while (k <= 9) {
            p = 1;
            while (p <= 9) {
                System.out.printf("[%d]*[%d]=[%d]\t", k, p, k * p);
                p++;
            }
            System.out.println();
            k++;
        }

        //위 같은 상황이라면 for문이 편하다.
        //while문은 실수할 수 있는 상황이 많습니다.
        //강제로 프로그램 유지 (while(true) {if(true) break;)}

        //do { 실행문 } while( 조건 )
        //강제적 한번 수행해야합니다. 그 다음 조건을 보겠습니다.

        //메뉴 구성
        //1.    인사
        //2.    회계
        //선택.......
        //당신이 원하는 업무 번호를 선택하세요... >> do{강제 코드}  while(조건문){}
        //입력값 : 3번 >> while에서 판단합니다 >>




        Scanner sc = new Scanner(System.in);
        int inputdata = 0;
        do {
            System.out.println("숫자 : 0~9 ");
            inputdata = Integer.parseInt(sc.nextLine());
        } while (inputdata >= 10); //조건이 true이면 do 문을 계속 실행합니다.
        //조건이 false일때 탈출합니다.
        System.out.println("당신이 입력한 숫자는 : " + inputdata);
    }
}



















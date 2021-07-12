package org.bitcamp;

public class Ex08_statement {
    public static void main(String[] args) {
       /*
       암기

       조건문 : if 3가지 , switch (조건){case 값 ...break}
       반복문 : for (반복횟수 명확) , while(조건 true ,false){}, do{} ~while()
       분기문 : break (블럭 탈출) , continue ( 아래 구문을 스킵하겠다)
        */

        int count = 0;
        if (count < 1) System.out.println("true"); //단일 if는 실행블록을 생략할 수 있습니다.

        if (count < 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        char data = 'A';
        switch (data) {

            case 'A':
                System.out.println("문자비교");
                break;

            default:
                System.out.println("나머지 모든 것");
        }

        //for (1~ 100까지의 합을 구하시오)
        //그 합을 sum 변수에 담아서 출력하시오
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1부터 100까지의 합은 :" + sum + "입니다.");


        int result = 5 * (1 + 5) / 2;

        //단 for문 사용
        //for문 안에 (if switch금지)

        sum = 0;
        for (int i = 1; i <= 10; i += 2) {
            sum += i;
        }
        System.out.println(sum);


        //1~100 까지의 짝수의 합
        int sum3 = 0;
//        for (int i = 2; i <= 100; i += 2) {
//            sum += i;
//        }


        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum3 += i;
            }
        }
        System.out.println(sum3);

        //입사시험 (중첩 for문)
        //
        //구구단 출력
        for (int i = 2; i < 10; i++) {
            System.out.printf("%d단 출력\n", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\t", i, j, i * j);
            }
            System.out.println();
            System.out.println();
        }

        //1~5 까지의 합구하기
        //문제) 수학 공식
        //등차수열 >> Sn = n(a+l)/2 Å (n:개수 a:초항 ㅣ:마지막)
        //

        //공식이 계산상 시간이 적게 걸립니다. >>그거뿐임 >>알고리즘 문제풀때 가끔 쓰임
        //>>시간복잡도 검색.

        //for (1~10 홀수의 합)

        //분기문 (continue , break)
        //Today Point : continue (skip 아래 구문) , break (for 블럭 or while 블럭 탈출)

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == j) {
                    continue;
                }
                System.out.printf("%S","*");
            }
            System.out.println();
        }

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j < i; j++) { //조건식 : j<i
                System.out.print("*");
            }
            System.out.println();
        }

        //피보나치 수열 (알고리즘)

        /*
        1
        1
        2
        3
        5
        8
        13....

         */
        int a=0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < 10; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.printf("a[%d] , b[%d] ,  c[%d]", a, b, c);
            System.out.println(a+b+c);
        }
    }
}




package org.bitcamp;

import java.util.Scanner;

public class Ex06_Printf_format {
    public static void main(String[] args) {
//        System.out.println(); // ln 의 의미 : 줄바꿈
        //C# 언어 : Console.writeLine();

        System.out.println("A");        //줄바꿈 ( newline )
        System.out.println("B");        //값을 주지않아도 출력됩니다.

        System.out.print("C\n");       //그냥 출력 내부적으로 기본값이 없습니다.
        System.out.print("D\n");      //엔터가 없어서 커서가 D뒤에서 깜빡입니다 >> 그래서 println 이 D 옆에 붙어나옵니다.

        int num = 100;
        System.out.println("\t" + num);

        //형식 (format) >>화폐단위로   >> 1000000 >> $1,000,000
        System.out.printf("num 값은 :  %d 입니다\n", num);

        //형식 문자
        // %d (10진수 형식의 정수)  >> d 자리에
        // %f (실수표기방법)            >>
        // %s (문자표기방법)             >>
        // %c(한문자)
        // /t  >> tab   ,       \n      >> 줄바꿈
        System.out.printf("num 값은 [%d]  입니다. 그리고 [%d] 도 있어요. \n", num, 12345);

        float f = 3.14f;
        System.out.println(f);
        System.out.printf("%.3f", f); //소수점 3자리 까지.

        System.out.printf("f 변수 값 :  %f 입니다 \n", f); //printf로 출력하면 뒤의 빈자리를 0으로 채웁니다.

        //입력 (콘솔창에 사용자가 입력한 값을 받을 수 있습니다)

        Scanner sc = new Scanner(System.in); //스캐너가 클래스라서 메모리에 올려야합니다.
        //생성자를 통해서 입력한 값을 읽습니다.

        //여러분이 사용하는 모든 자원은 package 안에 있습니다.
        //반드시 사용전에 박스를 열고 사용하려는 자원을 꺼내 놓아야합니다.
        // >> import라는 행위...

        //default : java.lang.*  >> import >> lang안에 있는 자원 그냥 사용가능합니다.


//        System.out.println();
//
//
//        System.out.println("값을 입력하세요: ");
//
//        String result = sc.nextLine(); //( ) 매개값을 쓰는곳 >> 비어있다는 의미 >> 인자 인수 .. 매개변수.. 파라미터 값을 넣지않아도
//        //>>실행됩니다. >> nextLine >>
//        //값을 입력되지 않으면 영원히 대기합니다.
//        System.out.println("result : " + result);
//
//        int number2 = sc.nextInt(); //정수값만 받을 수 있습니다.
//        System.out.println("정수값 number : " + number2);
//
//        float fnumber = sc.nextFloat();
//        System.out.println("실수값 number :" + fnumber);
//
//
//        /*주의 사항
//        //이클립스에서 입출력 작업을 할 때 ..... nextInt , nextFloat 보다는 nextLine을 사용해서 읽는 것이 좋습니다.
//          nextLine의경우 String으로 받기때문에 .. int의 경우 Integer.parseint 를 사용해야합니다.
//
//
//          Today Point
//          [문자열] -> [숫자] (정수 , 실수)
//
//
//         */
//
//        Integer.parseInt("1000"); //>> 1000
//        Float.parseFloat("3.14"); //>> 3.14 라는 숫자 실수로 변환. (기본 double형이기에)
//
//        //웹화면에서 보면 사용자가 입력하는 모든 값은 문자열 >> 결합 , 연산( 문자열 > 숫자)

        System.out.println();
        System.out.println("숫자를 입력하세요");
        int number = Integer.parseInt(sc.nextLine()); //String >> int로 변환해서 number에 담깁니다.

        int result = number + 1000;

        System.out.printf("number > %d  :  result > %d", number, result);


    }
}





















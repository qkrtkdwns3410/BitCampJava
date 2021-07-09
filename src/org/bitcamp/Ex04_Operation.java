package org.bitcamp;

/*
연산자...




 */
public class Ex04_Operation {
    public static void main(String[] args) {
        int result = 100 / 100; //1
        System.out.println("나누기 : " + result);

        result = 13 / 2;//몫
        System.out.println("몫 : " + result);

        //나머지를 구하는 연산자 ( %)
        result = 13 % 2; //나머지 //1
        System.out.println("나머지: " + result);


        //증가감 연산자 (증가 , 감소 : 1씩 증가 ,1씩 감소)
        //++ , --
        int i = 10;
        ++i; //전치증가. 1더해진 값이 i에 담깁니다. 혼자 독자적으로 노는건 상관없습니다. i=1+i
        i++; //후치 증가 . i = i+1
        System.out.println(i);

        //위 단독 사용 변수는 전치 , 후지 증가... 똑같습니다.

        //POINT     (연산자 결합 : 전치, 후치)

        int i2 = 5;
        int j2 = 4;

        result = i2 + ++j2; //전치증가가 +연산보다 먼저 작동합니다. ..10
        System.out.println("result : " + result + " j2 : " + j2);//10

        result = i2 + j2++; //후치는 연산하고나서 증가하기에 +연산에 영향을 미치지 않습니다..
        System.out.println("result : " + result + " j2 : " + j2);//10   //j2: 6
        //OK!


        byte b = 100;
        byte c = 1;
        int d = b + c;
//        byte d = (byte)b + c; //제공된 타입 : INT //필요 타입 BYTE //큰 값이 바이트에 들어감.. 데이터손실이 발생할 위험이 있습니다.

        System.out.println("d : " + d);

        //Today Point
        /*
        자바의 연산 규칙
        정수의 모든 [연산]은 내부적으로 컴파일러가 [int] 라고 하는 타입으로 변환한 다음에 처리합니다.
        >>byte+byte를 한다고 하더라도 int안에 넣고 연산합니다.
        그냥 [int]사용해도 ㄱㅊ


        ************************************************
        byte + short >> 컴파일러가 >>int + int
        char + char >> 컴파일러가 >> int + int
        [정수연산]에서 처리시 [int] 보다 [작은 타입]은 [int]로 변환해서 처리한다.
        long 제외
        /////////////////////////////////////////////////////////////////////////////
        byte , char , short 전부 그냥 연산지 [int]로 변환시켜서 연산합니다.

        int + long >> 큰거 따라갑니다 .>> long +long

        정수 + 실수 >>  타입 크기와 상관없이 실수가 승자입니다.
         */
        long ln = 1000000000L; //1000000000>>정수형은 기본으로 int형으로 인식 별도의 접미사 >> [L]로 long타입이라는 것을 인식을 시켜줘야함
        float fl = 1.2f; //실수형은 기본으로 double 형으로 인식하기에 >> 접미사로 [f]
        float lnresult = fl + ln; //실수 우선이기에 result 를 float으로 ...........
        System.out.println(lnresult);

        float num2 = 10.34f;
        int num = 20;
        float result5 = num2 + num; //float + int >>손실 x 4바이트 4바이트
        System.out.println(result5);
        //받는 쪽을 큰 타입으로 손실이 발생하지 않습니다.

        char c2 = '!'; //! 아스키 코드.. (char 정수 호환 : 10진수)
        char c3 = '!'; //

        result = c2 + c3;
        System.out.println(result); //아스키코드 33+ 33 ==66
        System.out.println((char) result); //B

        //제어문 (중소기업 시험문제) : 구구단 출력   >   별찍기     >   삼각형
//        int sum = 0;
////        for ( i = 1; i <= 9; i++) {
////            System.out.println(i+"단");
////            for (int j = 1; j <= 9; j++) {
////                System.out.printf("%d * %d = %d\n",i,j,i*j);
////            }
////            System.out.println();
////        }


//        int sum = 0;
//        for (int j = 1; j <= 100; j++) {
////            sum += j;   //sum = sum + j;
//            //+= , -=
//
//            if (j % 2 == 0) {
//                sum += j; //2의 배수를 sum에 담습니다.
//            }
//
//        }
//        System.out.println("sum: "+sum); //sum : 5050 //짝수 2550

        //== 연산자 (값을 비교하는 연산자)
        if (10 == 10.0f) { //==은 타입을 비교하지 않고 값만을 비교합니다.
            System.out.println("둘이 똑같음."); //true
        } else {
            System.out.println("아님 다름");
        }

        //! 부정 연산자
        if ('A' != 65) {    //같지않니..? //'A' 는 ASCII  아스키코드 65의 값임.
            System.out.println("같지 않음");
        } else {
            System.out.println("같음");
        }


        //Today Point
        //연산자 (제어문 비슷 (if))
        //삼항 연산자
        int p = 10;
        int k = -10;
        int result8 = (p == k) ? p : k; //같으면 p출력  아니면 k값을 출력합니다.

        if (p == k) {
            result8 = p;
        } else {
            result8 = k;
        }


        //진리표
        //논리 연산 (and ..or)
        //0 >>  false
        //1   >> true

        //0 , 1  조합 (순서가 다름을 인정합니다)

        /*

                        OR              AND
        0   0           0               0
        0   1           1                   0
        1   0           1                   0
        1   1           1                   1


        Oracle (Software >> 데이터를 영속적으로 저장할 수 있는 Software...)    :   CRUD (create read update delete) >> insert , select , update , delete
        언어  :    SQL  (자연어)

        select *
        from emp
        where job = 'IT' and sal >2000 ; >> //그리고 둘다 참의 값...


        select *
        from emp
        where job = 'IT' and sal >2000 ; >> //또는 이거나 (둘중에 하나만 참이어도 만족합니다)

        연산자 (비트)

        |                   or 연산자
        &                  and 연산자

        연산자 (논리)
        ||                   논리연산 (or)
        &&                논리연산(and)
         */

        int x = 3;
        int y = 5;
        System.out.println("x | y : " + (x | y)); //2진연산.. >> 2진값으로 나타냈을때 각 자리수 마다
        System.out.println("x & y : " + (x & y)); //2진연산.. >> 2진값으로 나타냈을때 각 자리수 마다

        /*
        3 십진수
        5 십진수
        ->  3   >   2진수
        -> 5 >2진수

        128 64 32 16 8 4 2 1
                                      1  1      :0011
                                   1    1       :0101
           4 2 1 더한 값이  print됩니다 ""7""!!!!

        ※ ※ ※ ※ Today Point( &&  (and)   ,      ||  (or))※ ※ ※ ※

        if(10 >0 && -1 >1 && 100>2 && 1>-1 .....){
        //false
        //0을 반환함.
        }else{}

        if(10 >0 || -1 >1 || 100>2 || 1>-1 .....){
        //true
        }else{}


        //short curcit -숏서킷 연산
        &&의 경우에는 모든 조건을 다 확인해야합니다 >> 중간에 거짓되는 조건문이 존재한다면  >> 연산을 생략
        ||의 경우에는  참인 조건 하나만 확인합니다       >> 참이되는 조건문이 존재하면다면          >> 연산을 생략합니다.




         */

        int data = 80;

        switch (data) {

            case 100:
                System.out.println("100 입니다");
                break;

            case 90:
                System.out.println("90 입니다");
                break; //탈출

            case 80:
                System.out.println("80 입니다");
                break;

            default://안적어도 ㄱㅊ
        }
        //switch 에서 break 는 문법적으로 강제하지는 않는다 (선택적으로)

        System.out.println("*********************************************************************************************");
        data = 90;

        switch (data) {

            case 100:
                System.out.println("100 입니다");

            case 90:
                System.out.println("90 입니다"); //break없으니까 어쩔줄 모름.. 다음 실행블록으로 가버림... >> 90부터 밑의 모든 값이 나옵니다... .> 컴퓨터 걍 개병신임 ㅇㅇ;

            case 80:
                System.out.println("80 입니다");

            default://안적어도 ㄱㅊ
        }
        //switch 에서 break 는 문법적으로 강제하지는 않는다 (선택적으로)
        System.out.println("*********************************************************************************************");

        int month = 5;
        String res = ""; //빈값으로 초기화.

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                res = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                res = "30";
                break;
            case 2:
                res = "29";
                break;
            default:
                res = "월 데이터가 아닙니다.";

        }
        System.out.println(month + " 달의 일수는 : " + res);
        System.out.println("*********************************************************************************************");

    }

}






























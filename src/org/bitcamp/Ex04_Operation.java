package org.bitcamp;

import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;

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
        ||의 경우에는  참인 조건 하나만 확인합니다    >> 참이되는 조건문이 존재하면다면          >> 연산을 생략합니다.




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
                System.out.println("90 입니다"); //break없으니까 어쩔줄 모름.. 다음 실행블록으로 가버림... >> 90부터 밑의 모든 값이 나옵니다... .>

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


        //난수 (랜덤값 : 임의의 추출값) //자바 api에서 이미 설계되어 있습니다. ㅇㅇ
        //
        result = (int) (Math.random() * 45) + 1;
        //구조 (의미있는 폴더 구조 : package)
        // 어떤 자원을 사용하려면 폴더를 열어서 :import
        //ex ) java.lang.System >> import java.lang.System 사용가능
        //어..java.lang 을 쓴적이 없는데?
        //java언어의 제일 큰 상자는 java입니다. ..
        /*
        [java.lang] 이 생략되어 있는거임 ㅇㅇ Object..
        객체지향언어는 명백은 이유가 존재....


        Math클래스 ( 수학 관련된 여러가지 자원 : static ) >> new 하지 않고도 사용 가능합니다.(new안해도 메모리에 올라갑니다 )

        //Math.Random()

     */

        System.out.println("Math.random() : " + Math.random());
        //로또가 아님.. 같은 값이 나올 수도 있습니다.;;
        //경품 or 로또 프로그램을 만들 수 있습니다...

        System.out.println("Math.random() * 10: " + (int) (Math.random() * 10 + 1)); //1부터 10미만까지..랜덤입니다.

        /*
        문제를 풀어 보세요
	  		--3분 또는 2분이 같이 풀어보세요
	  		--문제를 푸시면 지금까지 배운 것 이해 하고 있으신 거죠
	  		우리는 백화점 경품 시스템을 만들려고 한다
	  		경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다

	  		경품 추첨시 1000 점수가 나오면
	  		경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지

	  		경품 추첨시 900 점수가 나오면
	  		경품으로  NoteBook , 냉장고 , 한우세트 , 휴지

	  		경품 추첨시 800 점수가 나오면
	  		경품으로  냉장고 , 한우세트 , 휴지

	  		경품 추첨시 700 점수가 나오면
	  		경품으로  한우세트 , 휴지

	  		경품 추첨시 600 점수가 나오면
	  		경품으로  휴지

	  		그외 점수는 100 ~ 500 까지는 칫솔

	  		경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다
	  		사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
         */


        int randomNum = (int) ((Math.random() * 10) + 1) * 100; //최대값 100 ~ 1100 미만 라서
        //1000까지만 출력됩니다.

        System.out.println("랜덤값은 : " + randomNum + "입니다");

//
//        if (randomNum == 1000) {
//            System.out.println("경품 : TV , NoteBook , 냉장고. , 한우세트 , 휴지 ");
//        } else if (randomNum == 900) {
//            System.out.println("경품 : NoteBook , 냉장고 , 한우세트 , 휴지 ");
//        } else if (randomNum == 800) {
//            System.out.println("경품 : 냉장고 , 한우세트 , 휴지 ");
//        } else if (randomNum == 700) {
//            System.out.println("경품 : 한우세트 , 휴지 ");
//        } else if (randomNum == 600) {
//            System.out.println("경품 : 휴지");
//        } else if (randomNum >= 100 && randomNum <= 500) {
//            System.out.println("경품 : 칫솔");
//        } else {
//            System.out.println("꽝입니다.");
//        }




        String msg = "고객님의 점수는 :" + randomNum + " 이고 상품은: ";
        System.out.println("추첨번호: " + randomNum);

        switch (randomNum) {
            case 1000:
                msg += "Tv ";
            case 900:
                msg += "NoteBook ";
            case 800:
                msg += "냉장고 ";
            case 700:
                msg += "한우 ";
            case 600:
                msg += "휴지 ";
                break;
            default:
                msg += "칫솔 ";
        }
        System.out.println(msg);

        //if문은 조건없이 boolean 형, switch 문은 정수형 (byte ,short,  int) 과 [문자형(char)]  , [문자열(String)].... 사용가능

        //switch 문은 long  boolean , float , double  형 사용 불가능합니다.

        String m = "F";
        String r = "";
        switch (m) {
            case "A" :
            case "B" :
            case "C" :
            case "D" :
            case "E" :
            case "F" :
            case "G" :
                r = "ok";
                break;
            case "H":
                r = "ro";
                break;
            case "K":
                r = "no";
                break;
            default:
                r = "no data";
        }
        System.out.println(r);

    }

}






























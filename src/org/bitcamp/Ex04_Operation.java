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


    }

}






























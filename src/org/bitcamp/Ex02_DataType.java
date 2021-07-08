package org.bitcamp;

/*
1.자바가 제공하는 기본타입 (시스템 타입) : 자료형 >>8가지
2. 8가지 기본 타입 : 값을 저장합니다.
3.숫자    >       정수  (음의정수 , 0 , 양의정수)      >>byte (1 byte) (-128 ~ 127) >>-2^7 ~ 2^7 -1
                                                                        >>char (한 문자를 표현) >>'A'        '가'           'AB(X)' >> 싱글 쿼테이션(single quotation)
                                                                           >> 영문자 , 특수문자    (공백 , ? ,)  :1 byte
                                                                           >> 한글 1자 : 2byte ...필요합니다. (문제 발생)
                                                                           >> 합의..char ( 2byte )  한 글자(한 문자) 만 사용하기로 합의!
                                                                           >> 국가간 협의 (unicode) : 2, 3 Byte >> ASCII 코드표까지 연관되어 있습니다.
                                                                           >> ASCII  'A'--Oct 65        'a' --Oct 97    >>      소문자를 대문자로 변환하는 과정 >> 아스키값 (-)32
                                                                       >>short (c언어 호환성 2Byte) >>사용 X
                                                                       >>int (4byte :   -21억    ~   21억) ***java 정수 연산의 기본 타입입니다.
                                                                       >>long (8Byte)

              >       실수                                            >>float (4byte)
                                                                          >>double (8byte)  :   정밀도 (표현 범위가 크다) ***실수의 연산의 기본 타입입니다.
    논리     >       참, 거짓 (true, false)                  >>boolean   (프로그램의 논리적인 흐름제어) 판단의 조건

---------------------------------------------------------------------------------------------------------------------------
    ***문자열 표현("  ") >> "홍길동" , "HELLO"
    String 홍길동;
    >>String 은 기본 타입이 아님.. 값을 저장하지 않습니다..
    String은 엄격히 따지면 클래스 타입입니다..

    그럼에도 불구하고
    별도의 이야기를 하기 전까지 String은 9가지 기본타입으로 포함시키도록!!!!!!!!!!!!!!!!
    int, double 과 동일하게 사용하십쇼

    자바는 크게 2개의 타입으로 나뉩니다.
    1. 값 타입                             : 8가지 기본 타입 : int i =100; + String
    2. 주소 타입(객체의 주소)      : 클래스 , 배열 등등 ..... 변수에 값이 저장되는 것이 아니고 주소값이 저장되는 참조타입니다.
 */

import java.util.zip.DeflaterOutputStream;

class Car {
    String color;
    int window;
}

public class Ex02_DataType {
    public static void main(String[] args) {
        //primative type >> 8개
        //class type >> string, integer 등등..
        //refer type ( 참조타입 ) >> 주소를 가진 타입..
        int age = 100;
        System.out.println("age : " + age);  //변수가 값을 가지고 있다.

        Car c = new Car();
        c.color = "blue";
        c.window = 2;
        System.out.println("c 라는 Car타입 변수를 출력하면 : " + c); //Car타입의 주소값이 출력됩니다.
        System.out.println("c.window 개수: " + c.window); //참조타입..

        //변수
        //선언과 초기화
        //선언과 초기화 분리
        int i = 10; //선언과 초기화

        int j; //<<선언 <<메인함수안의 지역변수는 무조건 초기화해야합니다!!!!!!!!
        j = 100; //초기화

//        System.out.println(j);//variable j might not have been initialized:Error

        int k;
        k = j; //POINT (j안에는 """""값 할당"""""이 되어 있습니다. >>
        System.out.println("k : " + k); //100
        k = 300;
        System.out.println("k :" + k);//300
        System.out.println("j :" + j);//100

        int p = 1, g = 2, q = 3; //여러개의 선언은 가능합니다.. 근데 초기화를 못함>>엥 되는데>
        //같은 타입의 변수 3개를 만드시고 값을 넣으세요
        int[] arr = new int[3]; //배열을 사용해야합니다. //연속적으로 같은 타입은 배열을 사용해야합니다.

        //int (-21 ~21)...
        //literal >> (사전적 의미) 있는 그대로의 문자 >> 소스 코드에서 개발자가 직접 입력한 값
        //정수 리터럴 [*****  정수를 표현하는 기본 값 (default) : int  범위 ]
        int a = 100000;
        long l = 100000; //정수 값은 4바이트 그릇(int)에 담겨있는 건데.... >> 8바이트에 담겨있는 모양새(long)를 하고있는거임 >> **암묵적 형변환** 입니다.
        //long l =10000000000; //long형이라면 담을 수 있을텐데...
        //에러 발생. . 당신의 입력한 정수 리터럴은 .. out of range .. >> """""""""""""정수는 기본적으로 int로 담기기때문입니다"""""""""""""

        long b = 10000000000L; //강제로 그릇의 크기를 늘립니다. >> 4바이트 >>8바이트로  //

        int p2 = (int) 10000L; //>>타입 문제가 발생합니다. ! 8바이트의 값을 4바이트의 변수에 담으려고 하니까 에러가 발생하는거임 ! >> 작은 그릇에 큰 그릇을 넣을 수 없습니다. >>(int)로 형변환 하면 사용은 할 수 있습니다.
        //해당 코드가 문제가 있는가??? >> 문제 없지 않을까? >>큰수의 경우는 문제가 없지
        System.out.println(p2);

        int p3 = (int) 100000000000000L; //큰수이기때문에 8바이트 데이터가 4바이트 데이터로 변환되면서 ********* 쓰레기값 ********** 이 발생합니다..
        System.out.println(p3);

        //결론 : 작은 값을 큰 그릇에 담는건 문제 X 그릇보다 큰 값을 변환해서 넣는다면 문제가 발생합니다 !!
        long p4 = 100000000000000L;
        System.out.println(p4);

        //사용자가 입력하는 정수값은 무조건 : 리터럴값이 됩니다 >>int 그릇에 담기게 되는 것입니다.


        //char : 2Byte : 한 문자를 저장 할 수 있는 타입 : 내부적으로는 정수값을 가지고 있습니다.
        //한 문자 :    'A',   '가'  :   char ch = 'A' ;  char ch2 = '가';
        //문자열   :   "홍길동"   ,   "ABC"   :   String str = "홍길동"; , String str2 = "ABC";

        char single = 'a';
        System.out.println(single);
        String name = "홍길동";
        System.out.println(name);

        int intch = 'A'; //char값. 2바이트 >> 정수로 자동으로 형변환 정수값보다 작은 형태이기때문에 출력이 됩니다.
        System.out.println(intch); //ASCII 값이 출력됩니다. >> 65출력  >> 소문자 'a' 의 경우는 97이 출력됩니다.
        System.out.println("intch : " + (char) intch);

        //char 와 정수 (int) 서로 호환가능하다.
        //문자 >> 숫자  ,   숫자(char) >> 문자

        char ch2 = 'a';
        System.out.println(ch2);
        int intch2 = ch2; //char >> int 암시적 형변환됩니다.. 뭐 강제적으로 형변환도 가능은 합니다.

        System.out.println(intch2);

        int intch3 = 65;
//        char ch3 =  intch3; //int 형을 char형에 넣으면 4바이트 >> 2바이트
        //속지말자 : 값을 보지말고 값이 가지는 타입을 보자
        //정답>> 명시적 형변환을 해야합니다.
        char ch3 = (char) intch3;
        System.out.println("ch3 : " + ch3);

        //발생할 수 있는 문제점 : 65라는  숫자가 char 타입에 속하는 경우는 (데이터 손실없이)
        //int  intch3 = 10000000; 인 경우 char로 명시적 형변환을 하는 경우 >> 큰 값을 강제로 작은 것에 구겨넣으면 >> 데이터의 손실이 발생 (Overflow)

        int intch4 = ch3; //>> 아마 """"암시적 형변환""""이 발생 할 것입니다
        //내부적으로 컴파일러는
        //코드를 다시 만듭니다.
        //int intch4 = (int)ch3; 코드 재생산 실행 합니다.

        /*
       Today Point
       1.   할당에서 변수가 가지고 있는 값을 보지말고 변수의 타입을 보자
       1.1 정수 리터럴의 기본 타입은 int
       2.   변수가 가지는 타입을 확인하자
       3.   큰 타입에는 작은 타입을 넣을 수 있다 (자동 형변환)
       4. 작은 타입에는 큰 타입을 넣을 수 없다. (하고 싶다면 """강제적 형변환""" 필수!)

       ex)
       char <-- int >>>>        char <-- (char)int : 데이터손실 발생 가능성있음.
       int     <--  char >>>>       컴파일러가 int <---- (int)char   :작은 값을 큰 그릇에 넣는 거니까 >> 문제 없습니다.
         */

        int intvalue = 12938901;
        byte bytevalue = (byte) intvalue; //데이터 손실 발생
        System.out.println(bytevalue); //쓰레기 값이 나옵니다..

        //String (문자열)
        name = "박상준";
        System.out.println(name);

        String name2 = name + " 하이";
        System.out.println(name2); //문자열 + 문자열 (결합)

        //자바 : + (산술 , 결합)
        //Oracle > +산술      , || 결합연산자  >> '안녕' || '방가' >> '안녕방가'
        //Tip ) java에서는 특수문자의 사용 ?
        //이스케이프 문자 >> 특정한 문자 앞에 \
        char sing = '\'';
        System.out.println(sing);

        //역슬러시(\) 결합하면 문자로 인정
        //홍"길"동 string 변수에 담아서 출력해보세요
        String result = "홍\"길\"동";
        System.out.println(result);

        String str3 = "1000";
        String str4 = "10";
        result = str3 + str4;
        System.out.println(result); //100010

        //형변환 (+ 산술 , 결합)
        System.out.println("100" + 100);//100100
        System.out.println(100 + "100");//100100
        System.out.println(100 + 100 + "100");//200100
        System.out.println(100 + (100 + "100"));//100100100
        System.out.println(100 + "100" + 100);//100100100

        //C:\temp >>String
        String str = "C:\\temp";
        System.out.println(str); // '\t' 는 특수문자처리가 됩니다.. >>tab이 됩니다.        \n  >>  new line

        String path2 = "\ta\ta\ta";
        System.out.println(path2); //	a	a	a 가 출력됨.


        //실수형 (부동소수점)
        /*
        float ( 4byte )
        double ( 8byte ) ***실수 리터럴의 기본 타입 : double ***



         */
//        float f = 3.14; //?? 안됨 >> 왜 안들어감???
        //실수 리터럴의 기본 타입은 double형 이기때문에 f형으로 형변환을 해주어야합니다.

        float f = 3.14F; //접미사
        float f1 = (float) 3.14; //캐스팅

        //방식은 두개입니다.
        //1.접미사(f, F) float
        System.out.println("f   :   " + f);
        System.out.printf("%.4f\n", f);

        float f2 = 1.123456789f;
        System.out.println(f2); //1.1234568 >>float타입은 소수를 대략 7자리까지는 가능합니다
        //소수이하 대략 7자리
        //default 반올림

        double d = 1.123456789123456789; //기본형이 double이라 담김.. ㅇㅇ
        System.out.println(d); //1.1234567891234568 >>16자리 까지 표현됩니다.
        //default 반올림

        //float 추후에 2진 등등에 대해 배울거임 ㅇㅇㅇ
        System.out.println((byte) 128);
        //byte 8bit>> -128 ~ 127 >>
        // overflow 가 발생하면 (그릇이 넘침) -128로 돌아옵니다 (순환)

        byte by = (byte) 129;
        System.out.println("순환 : overflow : " + by); //-127 2만큼 over되어서 -127이 출력됩니다..

        double d2 = 100; //int랑 double이랑 싸우면 double이 이김.. double이 8바이트임. (암시적 형변환이 발생했습니다.)
        System.out.println(d2); //100.0




        //Quiz
        double d3 = 100; //100.0
        int i5 = 100;//100

        //데이터 절삭의 문제 발생때문에
        double result2 = d3 + i5;//100.0+100 ->200.0
        System.out.println(result2);

        //Today Point
        //작은 타입 + 큰 타입 >> 큰 타입
        //명시적 형변환을 항상 고민을 해보자 (캐스팅에 대한 고민>> 손실분에 대한 고민)

        int i6 = 100;
        byte b2 = (byte) i6; //명시적 형변환 >> 데이터 손실에 대한 고민을 항상 해야합니다.
        System.out.println(b2);



    }

}



















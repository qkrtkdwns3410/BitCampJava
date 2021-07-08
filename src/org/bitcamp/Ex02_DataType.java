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

        int p2 = (int) 1000L; //>>타입 문제가 발생합니다. ! 8바이트의 값을 4바이트의 변수에 담으려고 하니까 에러가 발생하는거임 ! >> 작은 그릇에 큰 그릇을 넣을 수 없습니다. >>(int)로 형변환 하면 사용은 할 수 있습니다.


    }


}



















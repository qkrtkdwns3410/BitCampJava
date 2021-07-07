package bitcamp;

//라인 주석
/*
블록주석 (해석되지 않는 자원)
일반적으로 만든날짜 : 2021 - 7 - 개더운 여름에...
만든이 : 박상준
목적 : class 사용방법

public class Ex01 >>Ex01 클래스 >> 설계도 >> 데이터 타입..(숫자, 문자, 날짜 etc) :사용자가 만드는 데이터 타입입니다.
클래스 == 설계도 == 타입(여러개의 작은 타입을 모아놓은 것입니다)

종류 :
1.class Test { } >> 독자적인 실행이 불가능한 설계도 입니다. >> 다른 클래스를 도와주는 클래스를 만드는 것입니다.
					>>메인 함수가 없습니다. >> lirary라고 합니다. (줄여서 lib ...)

2.class Test{ public static void main(String[] args{})      >>   독자적인 실행이 가능한 클래스입니다.

2.1  static void main(String[] args) >> main 이라는 이름을 가지고 함수 ,static >>
        >>프로그램 시작점 , 진입점 >> 실행가능합니다. >> 약속입니다!!!!!!


Tip >
C#> static void Main(){}
-- 한달 동안 배우고 서점에서 C#책을 열어보면 대부분 비슷.

변수 : variable
데이터(자료) 담을 수 있는 공간에 이름을...
변수는 공간의 크기를 가져야합니다.(데이터 타입으로 정의합니다)
데이터 타입      변수명     >> int i =100; (4바이트 공간에 이름을 i로 하며, 데이터를 100을 채우겠다)





**1.메모리 (현실 세계의 땅) 구조
JVM의 메모리 구조 (자바 버츄얼 머신) -> 자체 메모리를 가지고 있지는 않습니다. >> OS (RAM-휘발성) 에서 일정 메모리를 할당받습니다.
>> 자바가 메모리 "구획 정리"를 실시합니다. >> 나눠진 각각의 땅에 필요한 데이터를 올림. >>  근데 휘발성이라 디스크에 파일로 저장해야합니다.

https://dthumb-phinf.pstatic.net/?src=%22http%3A%2F%2Fcafeptthumb4.phinf.naver.net%2F20150730_104%2Fi7027_1438241496039U946G_PNG%2F%25B8%25DE%25B8%25F0%25B8%25AE%25B1%25B8%25C1%25B6.PNG%3Ftype%3Dw740%22&type=cafe_wa740

1)Stack
    ->메서드가 호출될 떄 '스택프레임'이 생성됨 (프로그램 수행 기록)
    >>스택(stack)이란 쌓아 올린다는 것을 의미한다.

따라서 스택 자료구조라는 것은 책을 쌓는 것처럼 차곡차곡 쌓아 올린 형태의 자료구조를 말한다.

📌 스택의 활용 예시

    스택의 특징인  후입선출(LIFO)을 활용하여 여러 분야에서 활용 가능하다.

    웹 브라우저 방문기록 (뒤로 가기) : 가장 나중에 열린 페이지부터 다시 보여준다.
    역순 문자열 만들기 : 가장 나중에 입력된 문자부터 출력한다.
    실행 취소 (undo) : 가장 나중에 실행된 것부터 실행을 취소한다.
    후위 표기법 계산
    수식의 괄호 검사 (연산자 우선순위 표현을 위한 괄호 검사)

https://devuna.tistory.com/22


변수가 선언되는 위치 (scope : 유효범위 오름차순)
    1. instance variable    :   객체변수    >>  class Person{  int(타입) age(변수); } //클래스 안에 들어가는 변수를 ""객체변수""라고 일컫습니다.
    2. local variable   :   지역변수    (   지역: 함수 내부   )   >> class Person {   void run(){  int speed;   }    } >함수 내부에 존재하고 함수를 벗어나면 없어지는 변수입니다.
    3. 함수 안에 제어블록 (if , for) 안에 있는 변수  ( 블럭 변수 )
    class Person {   void run() {       for (int  i=0;....   } int i >> 블록 변수 ㅇㅇ ㅋㅋ
    4. static variable : 공유자원 (객체 간 공유자원 )


 */
//하나의 물리적인 자바파일은 여러개의 클래스를 가질 수 있습니다. but public 제어자는 하나의 클래스만 사용할 수 있습니다.


import javax.swing.table.AbstractTableModel;

class Apt { // 독자적인 실행이 불가능한 함수입니다.
    int iv = 100;
    // 객체 변수 ( local variable )
    // 초기화 ( 변수에 처음으로 값을 넣는 행위 )
    // 객체 변수 ( 내부적으로 default 값을 가집니다 )
    int window; // 내부적으로 기본값(default) INT >> 0의 값을 가집니다. ** String >null ** char> null **

    //초기화 : 변수가 처음으로 값을 갖는 것 ( 할당을 통해서 )
    //질문 : why window 변수는 초기화를 하지 않아도 사용가능 할까요??

}

public class Ex01 { //독자적인 실행이 가능한 함수입니다 (psvm이 존재하기에)

    public static void main(String[] args) {

//        Test test = new Test(); //설계도(new 연산자)를 구체화하는 과정입니다. 구체화(땅위에 아파트를 짓는다) >> 프로그램 (메모리를 통해서 구현합니다.)
//
//        //new 가 만든것은 "객체"입니다. test를 찾아갈 수 있는 주소값을 test에 할당합니다. 그리고 그걸 불러오는 거임 ㅇㅇ
//
//        test.iv = 200;
//        System.out.println(test.iv);

        int i = 100; //지역변수 (local variable)
        System.out.println("i 지역변수 : " + i); //실행 버튼 (실행의 의미 : 컴파일(javac명령) + 실행(java명령)) >>인텔리제이 이클립스 내장 창을 가지고 보여주는거임

        Apt apt1 = new Apt(); // 집을 짓는 행위 ( 메모리에 올리는 행위입니다 )

    }

}























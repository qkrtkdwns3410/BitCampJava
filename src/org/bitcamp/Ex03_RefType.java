package org.bitcamp;

/*

클래스는 설계도이다  ,   클래스는 타입이다
클래스  ==     설계도       ==    타입
클래스(설계도) 구체화를 통해서 사용 (집을 짓는 행위)
프로그램 세계에서는 메모리에 올리는 행위

(new 연산자를 통해서 memory를 생성... >> 만들어 진 것을  (객체:instance))

●설계도 종류 2가지

1.독자적인 클래스 (main이 없음) >>도와주는 역할 >>라이브러리(lib)
class Atp { } //조력자

2.main 함수 (메서드) >>
class Program{psvm} //혼자서도 잘해요

 */

class Apt2 { //같은 폴더 안에 같은 이름 클래스는 안됨미더
    int door = 10; //instance variable //범용 적 : member field ...
    int window = 20;

}

public class Ex03_RefType {
    public static void main(String[] args) {

//Apt2 설계도 >> 구체화 >>메모리에 올려야함 >> new 연산자
        Apt2 lgapt = new Apt2();

        //lgapt 에는 (참조변수, 객체변수 : 주소를 가지는 변수(참조값))

        System.out.println(lgapt);//Atp2@1b6d3586 주소값

        Apt2 ssapt; //객체를 참조 .. new말고도 할당이 있음.
        ssapt = lgapt; //할당을 통해서 주소를 넘겨받을 수 있습니다. //
        ssapt.door = 100;
        System.out.println(lgapt.door == ssapt.door); //값이 같습니다.
    }
}

package javaBasic.ch6;

/*
1.객체의 생성
    클래스명 변수명;
    변수명  = new 클래스명();

    생성 과정
    1. 클래스 작성 (설계도)
    2. 객체 생성    (제품)
    3.객체 사용     (제품)

 */
public class ch6_6_instance {
    public static void main(String[] args) {
        Tv tv;              //Tv클래스 타입의 참조변수 tv를 선언합니다.  // Tv는 참조형 타입이고 tv라는 변수 생성
        tv = new Tv(); //Tv인스턴스(객체)를 생성한 후 ,  생성된 Tv인스턴스(객체)의 주소를 t에 저장합니다.

        tv.channel = 7; //Tv인스턴스의 멤버변수 channel의 값은 7로
        tv.channelDown();   //Tv인스턴스의 메서드 channelDown()을 호출한다. (메서드 호출)
        System.out.println("현재 채널은 " + tv.channel + " 입니다.");

    }

}

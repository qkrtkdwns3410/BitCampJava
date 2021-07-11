package javaBasic.ch6.javaBasic.ch6;

//변수 3개 메서드 3개 =6개의 멤버 입니다.
//
public class Tv {
    //클래스는 Tv의 설계입니다.
    String color; //색깔
    boolean power; //전원 상태
    int channel; //채널

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }


}

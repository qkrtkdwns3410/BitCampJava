package javaBasic.ch6;

/*
선언위치
영역에 따라 다름
1.클래스 영역  : iv,cv
2.메서드 영역 : lv (지역변수)


ex)포커 카드 카드 객체마다 다르게 유지되어야 하는 값이 다릅니다.

속성 : 무늬 숫자 (카드마다 개별적으로 달라야합니다) >>iv(객체 변수)  //폭 높이 (모든 객체가 공통적으로 가져야하는 속성입니다.) >> cv(static을 붙여서 공통 변수로 합니다)

기능 :
 */

class Card {
    String kind;
    int number;

    static int width = 100;
    static int height = 250;
}

public class ch6_12_classValueAndInstanceValue {
    public static void main(String[] args) {
        Card c = new Card();//객체 생성
        //객체의 사용
        //객체 변수 ( 각각의 객체마다 다른값을 의미합니다)
        c.kind = "HEART";
        c.number = 5;
        //클래스 변수 (static)
        c.width = 200;
        c.height = 300;
    }
}



















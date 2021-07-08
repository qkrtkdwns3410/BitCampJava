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

        //cv는 객체의 생성없이 호출가능합니다. (전역임)
        System.out.println("Card.width = "+ Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        //iv 선언 c1 c2 ,..
        c1.width = 50;
        c1.height = 80;
        //iv변경이 아니라 cv의 변경입니다...
        //Card 객체 자체의 width 와 height 가 50 과 80으로 변경됩니디ㅏ.
        //결국 c2의 값도 바뀌게 됩니다. cv이니까~



    }
}



















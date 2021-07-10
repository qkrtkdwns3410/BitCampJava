package javaBasic.ch7;

/*
>포함이란?? (Composite)
-클래스 멤버로 참조변수를 선언하는 것


클래스의 관계
1.상속
2.포함

상속관계 '~은 ~이다' A is B
포함관계 '~은 ~을 가지고 있다' A has B

Circle has a point. >>자연스러움. ㅇㅇ
>>포함관계로 개별 point 객체를 생성해주어야합니다.

일반적인 경우 90% 이상은 포함(Composite)
그 외의 경우는 상속 (inheritance) ..

상속은 꼭 필요한 경우에만 하도록 합시다..

 */
class MyPoint {
    int x;
    int y;
}

//class Circle extends MyPoint { //상속
//    int r;
//
//}
class Circle { //포함 인스턴스 메서드
    MyPoint p = new MyPoint(); //참조 변수의 초기화
    int r;


}

public class ch7_3_compositeRelation {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.p.x = 1;
        c.p.y = 1;
        c.r = 1;


    }
}

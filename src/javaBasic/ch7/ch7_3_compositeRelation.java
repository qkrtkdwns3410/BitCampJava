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



 */
class Point {
    int x;
    int y;
}

class Circle {
    Point c = new Point();
    int r; //반지름
}

public class ch7_3_compositeRelation {
    public static void main(String[] args) {

    }
}
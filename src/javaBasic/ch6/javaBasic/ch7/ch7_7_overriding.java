package javaBasic.ch6.javaBasic.ch7;

/*

오버라이딩
-상속받은 조상의 메서드를 자신에 맞게 변경하는 것

오버라이딩의 조건
1.선언부가 조상 클래스의 메서드와 일치해야 한다
2.접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경 할 수 없다
3.예외는 조상 클래스의 메서드보다 많이 선언할 수 없다. (8장)
    >>조상보다 예외보다 많이 선언 x

    7-9
    오버로딩 vs 오버라이딩
    1. 오버 로딩 : 기존에 없던 새로운 메서드를 정의
    2. 오버 라이딩 : 상속받은 메서드의 내용을 변경 하는 것 (change, modify)


 */
class MyPoint2 extends Object {
    int x;
    int y;

    public MyPoint2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x: " + x + ", y:" + y;
    }

}

public class ch7_7_overriding {
    public static void main(String[] args) {
        MyPoint2 p = new MyPoint2(1, 2);
        System.out.println(p.toString());

    }
}

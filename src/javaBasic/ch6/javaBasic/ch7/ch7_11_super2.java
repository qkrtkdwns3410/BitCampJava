package javaBasic.ch6.javaBasic.ch7;

/*
super() 조상의 생성자
super랑 관계없음
>>조상의 생성자를 호출할 때 사용합니다
>>조상의 멤버는 조상의 생성자를 호출해서 초기화합니다.

<추가 조건>
-생성자의 첫 줄에 반드시 생성자를 호출해야 한다.
-그렇지 않으면 컴파일러가 생성자의 첫 줄 에 super();를 삽입합니다.
 */
public class ch7_11_super2 {
    public static void main(String[] args) {

    }
}

class Point extends Object {
    int x;
    int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        super(); //Object(); //조상의 기본 생성자 호출
        this.x = x;
        this.y = y;
    }
}
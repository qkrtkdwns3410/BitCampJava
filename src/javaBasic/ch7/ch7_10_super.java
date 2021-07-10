package javaBasic.ch7;

/*

참조변수_super
-객체 자신을 가리키는 참조변수 , 인스턴스 메서드(생성자)내에만 존재합니다.
///
this는 lv iv 구별에 사용하고
super는 조상멤버와 자신의 멤버를 구별할 때 사용합니다.
///
-조상의 멤버를 자신의 멤버와 구별할 때 사용합니다.

 */
public class ch7_10_super {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 {
    int x = 10;
}

class Child2 extends Parent2 {
    int x = 20;

    void method() {
        System.out.println("x="+x);
        System.out.println("this.x="+this.x);
        System.out.println("super.x="+super.x);
    }
}

package javaBasic.ch6.javaBasic.ch7;

/*
상속
-기존의 클래스로 새로운 클래스를 작성하는 것 (코드의 재사용)
-두 클래스를 부모와 자식으롤 관계를 맺어주는것

-자손은 조상의 모든 멤버를 상속받습니다 (생성자 , 초기화블럭을 제외합니다)
-자손의 멤버 개수는 조상보다 적을 수 가 없습니다. (같거나 많다)


 */

class Parent {
    int age;
}

class Child extends Parent {
    void play() {
        System.out.println("놀자~");
    }
    //상속멤버 1개 .. 자신의 멤버 1개 == 2개
}

public class ch7_1_inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.play();
    }
}

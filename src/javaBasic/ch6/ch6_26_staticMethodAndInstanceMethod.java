package javaBasic.ch6;


class MyMath2 {
    long a, b;//인스턴스 변수 //클래스 전체에서 사용가능

    long add() {    //인스턴스 메서드 //매개변수가 필요없음 ..iv사용하니까..
        return a + b; //인스턴스 변수를 사용합니다.
    }

    static long add(long a, long b) { //클래스 메서드 ( static 메서드)//매개변수..
        return a + b; //지역변수를 사용합니다
    }

}

class testClass2 {
    int iv;         //인스턴스 변수
    static int cv;  //클래스 변수

    void instanceMethod() {
        System.out.println(iv); //인스턴스 변수를 사용할 수 있다.
        System.out.println(cv); //클래스 변수를 사용할 수 있다.
    }
}

/*

1. 인스턴스 메서드
(iv!!!)
    인스턴스 생성 후 , '참조변수.메서드이름()' 으로 호출
    인스턴스 멤버(iv,im)와 관련된 작업을 하는 메서드
    메서드 내에서 인스턴스 변수(iv)사용 가능

2. static메서드(클래스 메서드)
*************객체 생성이 없음*************************
ex>>Math.random() >>클래스 메서드입니다.
Math.round() >>same

    객체생성없이 '클래스이름.메서드이름()'으로 호출합니다.
    인스턴스 멤버 (iv,im)와 관련없는 작업을 하는 메서드
    메서드 내에서 인스턴스 변수(iv) 사용불가

static 메서드는 static 메서드를 호출가능합니까?
-네 가능합니다

static 메서드는 인스턴스 변수 사용가능합니다?
-객체 생성하지 않기에 인스턴스 변수 (클래스변수)를 사용할 수 없습니다.

statice메서드는 인스턴스 메서드 호출가능??
- 아니요

static 메서드는 인스턴스 멤버를 쓸 수 없나요?
-static 메서드 호출시 객체(iv묶음)가 없을 수도 있습니다.
 */




public class ch6_26_staticMethodAndInstanceMethod {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L, 100L)); //클래스 메서드 호출

        MyMath2 mm = new MyMath2(); //인스턴스 생성 >> iv의 묶음...
        mm.a = 200L;//iv초기화
        mm.b = 100L;//iv 초기화
        System.out.println(mm.add());       //인스턴스 메서드 호출 >>iv를 만들어야 인스턴스메서드를 이용할 수 있습니다....


    }
}

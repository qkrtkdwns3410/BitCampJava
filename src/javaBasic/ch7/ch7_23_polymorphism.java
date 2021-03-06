package javaBasic.ch7;


/*
다형성(polymorphism)
-여러 가지 형태를 가질 수 있는 능력


-자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다. >>
SmartTv s = new Tv(); >>불가능 .. 있는 기능을 사용하지 않는 것은 가능하지만..


7-24
참조변수의 형변환
- 사용할 수 있는 멤버의 갯수를 조절하는 것
-조상 자손 관계의 참조변수는 서로 형변환 가능합니다.

 */
public class ch7_23_polymorphism {
    public static void main(String[] args) {
        Car2 c = new Car2();
        FireEngine fe = (FireEngine) c; //형변환 실행 에러 > java.lang.ClassCaseException..
        fe.water();
    }
}

class Car2 {
    String color;
    int door;

    void drive() {
        System.out.println("드라이브!");
    }

    void stop() {
        System.out.println("멈춰");
    }

}

class FireEngine extends Car2 {
    void water() {
        System.out.println("물 나옵니다!");
    }
}






















package javaBasic.ch6;

import sun.awt.geom.AreaOp;

class Car {
    String color;
    String gearType;
    int door;

    public Car() {
        this("white", "auto", 4);
    }

    Car(Car c) {
        this(c.color, c.gearType, c.door);
    }

    public Car(String color, String gearType, int door) { //인스턴스 복사를 위한 생성자
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }


}


public class ch6_26 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(car1); // c1의 복사본 c2를 생성합니다.

        System.out.println("c1의 color=" + car1.color + ", gearType=" + car1.gearType + ", door=" + car1.door);
        System.out.println("c1의 color=" + car2.color + ", gearType=" + car2.gearType + ", door=" + car2.door);

        car1.door = 100;

        System.out.println("c1의 color=" + car1.color + ", gearType=" + car1.gearType + ", door=" + car1.door);
        System.out.println("c1의 color=" + car2.color + ", gearType=" + car2.gearType + ", door=" + car2.door);
    }

}

























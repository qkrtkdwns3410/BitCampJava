package javaBasic.ch7;

import javax.swing.*;

/*
매개변수의 다형성
1.다형적 매개변수
2.하나의 배열로 여러 종류 객체 다루기
3.instanceof 연산자 >>형변환 가능여부 확인

-참조형 매개변수는 메서드 호출시 , 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있습니다.

다형성
1.Tv t =  new SmartTv(); 조상>자손
2.참조변수의 형변환 >>라모콘 바꾸기기 */
public class ch7_27_polymophism {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv1());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + " 입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + " 점입니다.");
    }
}

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0); //보너스 점수는 제품 가격의 10%입니다.
    }
}

class Tv1 extends Product {

    Tv1() {
        //조상클래스의 생성자 Product(int price)를 호출한다.
        super(100); //Tv의 가격을 100만원으로 한다
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= p.price; //가진 돈에서 구입한 젶품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; //제품의 보너스 점수를 추가합니다.
        System.out.println(p+"을(를) 구입하셨습니다."); //참조변수와 문자열을 결합 할때는 자동으로 참조변수 뒤에 toString()이 붙습니다.
    }
}

















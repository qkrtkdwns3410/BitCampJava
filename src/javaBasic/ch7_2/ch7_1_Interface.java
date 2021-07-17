package javaBasic.ch7_2;

/*
인터페이스 란 ?
일종의 추상클래스 .  추상클래스 보다 추상화 정도가 높습니다.
실제 구현된 것이 전혀 없는 기본 설계도 (알맹이 없는 껍데기)
추상메서드와 상수만을 멤버로 가질 수 있다.
인스턴스를 생성할 수 없고 , 클래스 작성에 도움을 줄 목적으로 사용된다
미리 정해진 규칙에 맞게 구현하도록 표준을 제시하는 데 사용된다.


 */
interface PlayingCard {
    //구성요소(멤버)는 추상메서드와 상수만 가능하다.
    public static final int SPADE = 4;
    final int DIAMOND = 3; //public static final int DIAMOND = 3;
    static int HEART = 2; //public static final int HEART = 2;
    int CLOVER = 1; //public static final int CLOVER =1;

    public abstract String getCardNumber();

    String getCardKind();//public abstract String getCardKind();

}

//인터페이스도 클래스처럼 상속이 가능함 (클래스와 달리 다중상속 허용)

interface Movable {

    void move(int x, int y);

}

interface Attackable {

    void attack(Unit u);

}

interface Fightable {

    void move(int x, int y);
    void attack(Unit u);

}


class Fighter extends Unit implements Fightable {

    public void move(int x, int y) {
    }

    public void attack(Unit u) {
    }

    void attack(Fightable f) {

    }

    Fightable method() {

        return new Fighter();
    }
}


//인터페이스는 Object클래스와 같은 최고 조상이 없습니다.
//인터페이스를 이용한 다형성
//인터페이스 타입의 변수로 인터페이스를 구현한 클래스의 인스턴스를 참조할 수 있습니다.

public class ch7_1_Interface {
    public static void main(String[] args) {

        Fighter f = new Fighter();
        Fightable f1 = new Fighter();

    }
}


























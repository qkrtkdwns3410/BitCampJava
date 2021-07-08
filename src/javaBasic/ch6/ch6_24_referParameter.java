package javaBasic.ch6;

class Data2 {
    int x;
}
public class ch6_24_referParameter {
    public static void main(String[] args) { //스택에 main함수 실행됩니다.
        Data2 d = new Data2(); //힙 영역에 data2를 생성하고 해당 주소를 main메서드에 d라는 변수? 를 만들어내어서 해당 Data2의 주소를 참조합니다.
        d.x = 10;//d라는 변수의 객체변수 x 를 10..
        System.out.println("main() : x=" + d.x);//main상의 d변수의 x는 10입니다.

        change(d);//main 함수 위에 change라는 메서드가 실행됩니다. 그리고 참조변수로 d가 들어가게 되며

        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    private static void change(Data2 d) { //참조형 매개변수 >>읽기 쓰기가 전부 가능해집니다.
        //기본형 매개변수의 경우 >> 객체의 주소를 모르기에 수정이 불가능해집니다.
        d.x = 1000;
        System.out.println("change() : x = "+d.x);
    }
}

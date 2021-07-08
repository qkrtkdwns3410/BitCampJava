package javaBasic.ch6;

class Data3 {
    int x;
}

public class ch6_24_referParameter_2 {
    public static void main(String[] args) { //스택에 main함수 실행됩니다.
        Data3 d = new Data3(); //data3객체가 생성됩니다 . 그리고main함수에 d라는 변수를 만들고 ... 힙영역의 data3주소를 참조합니다.
        d.x = 10; //참조한 값... 힙영역의 x값이 10으로 변경됩니다.

        Data3 d2 = copy(d); //d를

        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
}

    private static Data3 copy(Data3 d) {//참조형 매개변수로 Data3 d가 넘어 왔습니다. 리턴값도 Data3입니다.
        //객체 주소도 결국은 정수입니다.
        //EX6_8 e = new Ex6_8 ();
        //원래는 클래스 객체를 호출해야합니다.

        Data3 tmp = new Data3(); //data3을 참조하는 tmp이라는 변수를 main안에 생성합니다
        tmp.x = d.x; //
        return tmp;
    }
}

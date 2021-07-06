package javaBasic.ch6;

public class WhyMethod {
    public static void main(String[] args) {

        //자바 메서드 >> 서로 연관된 코드를 그룹핑해서 이름을 붙이는 것입니다.
        //static은 static으로 받아야 합니다.
        printTwoTimesA();
    }

    private static void printTwoTimesA() {
        System.out.println("-");
        System.out.println("A");
        System.out.println("A");
    }

    //한줄짜리 코드라도 함수로 표현하는 것이 .. 좋다
    //

}

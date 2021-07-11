package javaBasic.ch6.javaBasic.ch7;

/*

캡슐화와 접근 제어자 (종류, 접근범위)
-접근 제어자를 사용하는 이유
    -외부로부터 데이터를 보호하기 위해서
    -외부에는 불필요한 , 내부적으로만 사용되는 부분을 감추기 위해서



 */

public class ch7_22_capsulationAndModifier {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(23);
        System.out.println(t.getHour());
    }
}

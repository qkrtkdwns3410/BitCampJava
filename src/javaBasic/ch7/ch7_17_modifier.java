package javaBasic.ch7;

/*

제어자(modifier)
-클래스와 클래스의 멤버(멤버 변수 , 메서드)에 부가적인 의미 부여
(영어로 따지면 형용사입니다)
>>접근제어자 public ,  protected, (default) , private
>>그외 : static, final , abstract

//static -클래스, 공통적인.
 */
public class ch7_17_modifier {
    public static void main(String[] args) {

    }
}

abstract class AbstractTest { //추상 클래스 (추상 메서드를 포함한 클래스)
    abstract void move(); //추상 메서드 (구현부가 없는 메서드)
}
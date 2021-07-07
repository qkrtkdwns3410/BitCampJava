package bitcamp;


/*스택 힙 영역 생성
스택에 main 할당
car타입 car1  = new Car()
car타입 car2  = new Car()
car타입car3  = new Car()

main 함수안에 car1 car2 car3 의 지역변수가 생깁니다.
car1객체
각 지역변수마다 4바이트의 공간을 할당합니다. >> new Car() 하는 순간 힙영역에 Car객체를 만들고  int window라는 객체변수를 생성하고 void move()라는 성능관련 메서드가 생성합니다.
>>car객체 >>stack영역에서 car의 주소를 참조합니다.   (주소 xx)


car2
각 지역변수마다 4바이트의 공간을 할당합니다. >> new Car() 하는 순간 힙영역에 Car객체를 만들고  int window라는 객체변수를 생성하고 void move()라는 성능관련 메서드가 생성합니다.
>>
car객체 >>stack영역에서 car2객체의 주소를 참조합니다.  (주소 yy)

car3
각 지역변수마다 4바이트의 공간을 할당합니다. >> new Car() 하는 순간 힙영역에 Car객체를 만들고  int window라는 객체변수를 생성하고 void move()라는 성능관련 메서드가 생성합니다.
>>
car객체 >>stack영역에서 car 주소를 참조합니다.  (주소 zz)

car1. "".""의 의미는 참조연산자의 의미입니다.


 */

public class Ex01_1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

    }
}

package bitcamp;

//라인 주석
/*
블록주석 (해석되지 않는 자원)
일반적으로 만든날짜 : 2021 - 7 - 개더운 여름에...
만든이 : 박상준
목적 : class 사용방법

public class bitcamp.Ex01 >>bitcamp.Ex01 클래스 >> 설계도 >> 데이터 타입..(숫자, 문자, 날짜 etc) :사용자가 만드는 데이터 타입입니다.
클래스 == 설계도 == 타입(여러개의 작은 타입을 모아놓은 것입니다)

종류 :
1.class bitcamp.Test { } >> 독자적인 실행이 불가능한 설계도 입니다. >> 다른 클래스를 도와주는 클래스를 만드는 것입니다.
					>>메인 함수가 없습니다. >> lirary라고 합니다. (줄여서 lib ...)
2.class bitcamp.Test{public static void main(String[] args{} } >> 독자적인 실행이 가능한 클래스입니다.
2.1  statice void main(String[] args) >> main 이라는 이름을 가지고 함수 ,static >>
        >>프로그램 시작점 , 진입점 >> 실행가능합니다. >> 약속입니다!!!!!!

Tip >
C#> static void Main(){}
-- 한달 동안 배우고 서점에서 C#책을 열어보면 대부분 비슷.

변수 : variable
데이터(자료) 담을 수 있는 공간에 이름을...
변수는 공간의 크기를 가져야합니다.(데이터 타입으로 정의합니다)
데이터 타입      변수명     >> int i =100; (4바이트 공간에 이름을 i로 하며, 데이터를 100을 채우겠다)
 */
//하나의 물리적인 자바파일은 여러개의 클래스를 가질 수 있습니다. but public 제어자는 하나의 클래스만 사용할 수 있습니다.
class Test { //독자적인 실행이 불가능한 함수입니다.
    int iv = 100;
}

public class Ex01 { //독자적인 실행이 가능한 함수입니다 (psvm이 존재하기에)

    public static void main(String[] args) {
        Test test = new Test(); //설계도(new 연산자)를 구체화하는 과정입니다. 구체화(땅위에 아파트를 짓는다) >> 프로그램 (메모리를 통해서 구현합니다.)

        //new 가 만든것은 "객체"입니다. test를 찾아갈 수 있는 주소값을 test에 할당합니다. 그리고 그걸 불러오는 거임 ㅇㅇ
        //
        test.iv = 200;
        System.out.println(test.iv);

    }

}























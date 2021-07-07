package javaBasic.ch6;

/*
6-8 객체 배열
객체 배열 == 참조변수 배열
 */
public class chh6_8_arrayList {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3]; //길이가 3인 Tv타입의 참조변수 배열입니다.
        //객체를 생성하여 배열의 각 요소에 저장합니다.
        //tvArr -0x100 tvArr[0] -0x200 [1]  - 0x300 [2] -0x400 이런식으로 메모리 할당됨
        tvArr[0] = new Tv();
        tvArr[1] = new Tv();
        tvArr[2] = new Tv();
//        Tv[] tvArr = {new Tv(), new Tv(), new Tv()};
    }
}

package javaBasic.ch6;

/*
메서드란?
1.문장들을 묶어놓은 것입니다.
>> 코드의 중복을 없애주기 위함입니다.

2.값(입력)을 받아서 처리하고, 결과를 반환(출력)
>>함수 상자:함
int add(int x , int y){
    int result =x+y;
    return result; //결과를 반환
}

>메서드의 장점
1.코드의 중복을 줄일 수 있습니다.
2.코드의 관리가 쉽다.
3.코드를 재사용할 수 있다.
4.코드가 간결해서 이해하기 쉬워집니다.

메서드  = 선언부  + 구현부
반환타입 메서드 이름 (타입 변수명 , 타입변수명 , ..,.) //선언부
{ } //구현부

int add(int a , int b) // int ::출력값 . add: 메서드 이름 a,b 매개변수
{
int result =a+b;
return result; //호출한 메서드로 결과를 반환한다.
}
반환값이 없으면 void...!

 */



import javafx.scene.chart.NumberAxis;

import java.util.ArrayList;

public class ch6_14_Method {

    public static void main(String[] args) {
        int numArr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            numArr[i] =  (int)(Math.random()*10);
        }
        printArr.printArr(numArr);
    }

}

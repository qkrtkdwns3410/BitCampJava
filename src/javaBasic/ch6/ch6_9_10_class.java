package javaBasic.ch6;

import java.util.Scanner;

/*
클래스

1.설계도
2.데이터+함수
3.사용자 정의 타입

*변수 : 하나의 데이터를 저장할 수 있는 공간
*배열 : 같은 종류의 여러 데이터를 하나로 저장할 수 있는 공간
*구조체 : 서로 관련된 여러 데이터    (변수의 자료형 관계 X)      를 하나로 저장 할 수 있는 공간
*클래스 : 데이터와 함수의 결합 (구조체 + 함수) >>함수과 관련있는 데이터 ..묶음..

클래스 : 사용자 정의 타입 : 원하는 타입을 직접 만들 수 있습니다.
int hour, int minute , int second --- 등 ...

시간 과 분 초 타입을 묶어서 독립적인 class
 */
class Time {
    private  int hour;
    private  int minute;
    private  int second;

    public Time() { //기본 생성자

    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}

public class ch6_9_10_class {
    public static void main(String[] args) {
//        int hour_I;
//        int minute_I;
//        int second_I;
//        Time t = new Time();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("시간을 입력하세요:");
//        hour_I = sc.nextInt();
//        System.out.println("분을 입력하세요:");
//        minute_I = sc.nextInt();
//        System.out.println("초를 입력하세요");
//        second_I = sc.nextInt();
//        System.out.println(hour_I+":"+minute_I+":"+second_I);
    }
}

package org.bitcamp;

import java.util.GregorianCalendar;

public class Ex05_Operation {
    public static void main(String[] args) {
        int sum = 0;
        //대입연산자
        sum += 1; //sum = sum +1;
        sum -= 1;

        System.out.println("sum : " + sum); //sum = 0


        //간단한 학점 계산기
        //학점 : A+ , A- , B+ ,  B- , ,....F
        //데이터 점수 : 94점

        //판단의 기준 : 90점 이상 .> A인데 판단.. +인지 -인지.. >>95점 이상이면 A+ >> 아니면 A-
        //if 3종류가 있습니다
        //if() {}
        //if(){} else {}
        //if() {} else if() {} else if(){} else {}
        int score = 78;
        String grade = ""; //지역변수는 항상 사용전에 초기화를 하십시오!!!!
        System.out.println("당신의 점수 : " + score);

        //로직
        if (score >= 90) {
            grade = "A";
            if (score >= 95) {
                grade += "+";
            } else {
                grade += "-";
            }
        } else if (score >= 80) {
            grade = "B";
            if (score >= 85) {
                grade += "+";
            } else {
                grade += "-";
            }
        } else if (score >= 70) {
            grade = "C";
            grade= (score >= 75) ? (grade += "+") : (grade += "-"); //삼항연산자
        } else {
            grade = "F";
        }

        System.out.println("당신의 학점은 : "+grade+" 입니다.");

    }
}

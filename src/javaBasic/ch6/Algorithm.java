package javaBasic.ch6;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {

/*
 어느 학생의 기말고사 시험점수 (5과목)
		 int sum=0;
		 float average = 0f;
		 int[] jumsu = {100,55,90,60,78};

		 1. 총과목의 수
		 2. 과목의 합
		 3. 과목의 평균
		 단 2,3  문제는 하나의  for  으로 해결하세요
*/
        int sum = 0;
        float average = 0f;
        int[] jumsu = {100, 55, 90, 60, 78};

        for (int i = 0; i < jumsu.length; i++) {
            sum += jumsu[i];
            if (i == jumsu.length - 1) { //점수 배열의 마지막에 들어가면
                average = sum / (float) jumsu.length;
            }
        }
        System.out.println(average);
        System.out.println(sum);
    }
}

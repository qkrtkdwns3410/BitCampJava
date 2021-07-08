package org.bitcamp;

/*





 */
public class Ex04_Operation {
    public static void main(String[] args) {
        int result = 100 / 100; //1
        System.out.println("나누기 : " + result);

        result = 13 / 2;//몫
        System.out.println("몫 : " + result);

        //나머지를 구하는 연산자 ( %)
        result = 13 % 2; //나머지 //1
        System.out.println("나머지: " + result);


        //증가감 연산자 (증가 , 감소 : 1씩 증가 ,1씩 감소)
        //++ , --
        int i = 1;
        ++i; //전치증가. 1더해진 값이 i에 담깁니다. 혼자 독자적으로 노는건 상관없습니다. i=1+i
        i++; //후치 증가 . i = i+1
        System.out.println(i);

        //위 단독 사용 변수는 전치 , 후지 증가... 똑같습니다.

        //POINT     (연산자 결합 : 전치, 후치)

        int i2 = 5;
        int j2 = 4;

        result = i2 + ++j2; //전치증가가 +연산보다 먼저 작동합니다. ..10
        System.out.println("result : " + result + " j2 : " + j2);

        result = i2 + j2++; //후치는 연산하고나서 증가하기에 +연산에 영향을 미치지 않습니다..
        System.out.println("result : " + result + " j2 : " + j2);
        //OK!

    }
}






























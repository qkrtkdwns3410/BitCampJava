package javaBasic.ch6.javaBasic.ch6;

/*
return문 >> 실행중인 메서드를 종료하고 호출한 곳으로 되돌아 갑니다.

 */
class Gugudan {
    void printGugudan(int dan) { //반환 타입이 void인 경우에는
        if (!(2 <= dan && dan <= 9)) {
            return;  //dan 의 값이 2~9가 아닌경우 ,  호출한 곳으로 되돌아 갑니다.
        }
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d  = %d\n", dan, i, dan * i);
        }
    }

//    int max(int a, int b) {
//        if (a > b) {
//            return a;
//        }
//    } //거짓인 경우 return 문이 없기에 >> 에러 발생

    int multiply(int x, int y) { //반환타입이 있는 경우 반드시 return 문이 필요합니다.
        int result = x * y;
        return result;  //만약에 return 값이 int가 아니고 char , byte , short 인 경우 자동 형변환됩니다 (데이터 손실의 우려도 없습니다 작-> 큰 이기에)
    }
}

public class ch6_20_return {
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        gugudan.printGugudan(3);

    }
}

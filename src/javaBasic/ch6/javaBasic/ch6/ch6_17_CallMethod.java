package javaBasic.ch6.javaBasic.ch6;

class MyMath {
    //두 값을 받아서 둘 중에 큰 값을 반환하는 메서드 작성
    long max(long a, long b) {
        return a > b ? a : b; //결과를 저장하지는 못합니다..
    }



    long add(long a, long b) {
        long result = a + b;
        return result;
    }

    long substract(long a, long b) {
        long result = a - b;
        return result;
    }

    long multiply(long a, long b) {
        long result = a * b;
        return result;
    }

    long divide(long a, long b) {
        long result = a / b;
        return result;
    }
}

public class ch6_17_CallMethod {


    static int add(int x, int y) { //메서드이름(값1,  값2 , ...); //메서드를 호출하는 방법
        return x + y;
    }

    static void print99danAll() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d  = %d\n", i, j, i * j);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        MyMath mm = new MyMath();
        System.out.println(mm.add(3L, 2L));
        ;
        //long a = 5; 자동형변환 됨.. 작은 단위의 자료형은 큰 단위의 자료형에 free~로 들어가게됩니다.
        //메서드는 클래스 영역안에서만 정의할 수 있습니다.
        System.out.println(mm.substract(3L, 2L));;
        System.out.println(mm.multiply(3L, 2L));;
        System.out.println(mm.divide(3L, 2L));
        System.out.println(mm.max(7, 3));
    }
}


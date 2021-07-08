package javaBasic.ch6;

class MyMath {
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
        mm.add(3L, 2);
        mm.substract(5L, 3);
        mm.divide(5L, 2);
        mm.multiply(6L, 3);
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //소수판별별
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count ++;
            }
        }
        if (count != 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
















































import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String object = sc.next();
        String[] arr = str.split("");

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(object)) {
                count++;
            }
        }
        System.out.println(count);
    }
}


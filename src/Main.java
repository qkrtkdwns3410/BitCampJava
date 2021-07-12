public class Main {
    public static void main(String[] args) {
        //1번 문제
//        for (char i = 65; i <= 90; i++) { //char형
//            System.out.printf("%s ",i);
//        }
//        System.out.println();
//
//
//        //2번 문제
//        for (int i = 1; i <= 100; i++) {
//            System.out.printf("%d ",i);
//            if (i % 10 == 0) {
//                System.out.println();
//            }
//        }
//        //3번 문제
//        //두개의 주사위를 던졌을때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
//
////
//        for (int i = 1; i <= 6; i++) {
//            for (int j = 1; j <= 6; j++) {
//                if (i + j == 6) {
//                    System.out.printf("[%d , %d]\n",i,j);
//                }
//            }
//        }
//        int index = 10;
//for(int j =1;i<=)
//        for (int i = 1; i < 10; i++) {
//            System.out.print("*");
//        }


//        //별 찍기
//        int index = 10;
//        for (int i = 0; i < index; i++) { //별을 index행만큼 찍습니다.
//            for (int j = 0; j < index - i; j++) {//한줄에 (index -i) 만큼 별을 찍습니다.
//                System.out.printf("%s ","*");
//            }
//            System.out.println();
//        }

        //다이아몬드 찍기
        //상단
//        int index = 5;
//        for (int i = 0; i < index; i++) {
//            for (int j = 0; j < index-i-1; j++) {
//                System.out.printf(" ");
//            }
//            for (int k = 0; k < i + 1; k++) {
//                System.out.printf("%s","*");
//            }
//            for (int p = 0; p < i; p++) {
//                System.out.printf("%s","*");
//            }
//            System.out.println();
//
//        }
//        index = 4;
//        //하단
//        for (int i = 0; i < index; i++) { //4줄 출력
//            for (int j = 0; j <=i; j++) { //3공백
//                System.out.printf(" ");
//            }
//            for (int k = 0; k < index - i; k++) {
//                System.out.printf("%s","*");
//            }
//            for (int p = 0; p < index - i - 1; p++) {
//                System.out.printf("%s","*");
//            }
//            System.out.println();
//        }

//        int index = 7;
//        for (int i = 0; i < index; i++) { //7줄로 하겠습니다.
//            for (int j = 0; j <= i; j++) {
//                System.out.printf("%s ","*");
//            }  //1개 2개 3개 순 으로 출력
//            System.out.println();



                /*
        가위 , 바위 ,보 게임 또 제어문을 통해서 작성하세요 (IF)

예를 들명)

컴퓨터가 자동으로 나온 가위 , 바위 , 보 에 대해서 사용자가 값을 입력 해서 처리 하세요

( 예를 들면 : 가위=> 1 , 바위 => 2 , 보 => 3)




         */
        /*
        int com = (int) (Math.random() * 3) + 1;
        System.out.println(com);

        Scanner sc = new Scanner(System.in);

        System.out.println("가위 == 1, 바위 == 2, 보 == 3 (1,2,3 중에 하나를 입력하세요)");

        int input = Integer.parseInt(sc.nextLine());
        String result = "";

        if (com == input) {

            System.out.println("비겼습니다.");

        } else if (com==1) {//컴퓨터 가위

            result = (input == 2) ? "이겼습니다" : "졌습니다."; //내가 바위

        } else if (com == 2) { //컴퓨터 바위

            result = (input == 3) ? "이겼습니다" : "졌습니다.";

        } else {

            result = (input == 1) ? "이겼습니다" : "졌습니다.";

        }
        System.out.println(result);

*/



        //소수판별별


    }
}
















































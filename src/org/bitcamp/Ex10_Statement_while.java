package org.bitcamp;

import java.util.Scanner;

public class Ex10_Statement_while {
    public static void main(String[] args) {

        boolean auto = true;
        int balance = 0; //잔액
        Scanner sc = new Scanner(System.in);
        int money = 0; //

        while (auto) {

            System.out.println("***************************************************");
            System.out.println("1.  예금   |   2.  출금   |   3.  잔고   |   4.  종료");
            System.out.println("***************************************************");

            System.out.println("선택");
            int input = Integer.parseInt(sc.nextLine());

            switch (input) {

                case 1:
                    System.out.print("예금할 금액은? ");
                    money = Integer.parseInt(sc.nextLine());
                balance += money;
                    break;

                case 2:
                    System.out.print("출금할 금액은? ");
                    money = Integer.parseInt(sc.nextLine());

                    if (money <= balance) {
                        balance -= money;
                    } else {
                        System.out.println("잔액이 부족합니다");
                    }
                    break;

                case 3:
                    System.out.println("잔고는 " + balance);
                    break;

                case 4:
                    System.out.println("종료");
                    auto = false; //논리를 이용해서 while(false)탈출
                    break;

                default:
                    System.out.println("올바른 메뉴를 선택해주세요.");

            }
        }







    }
}


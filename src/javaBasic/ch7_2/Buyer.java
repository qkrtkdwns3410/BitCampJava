package javaBasic.ch7_2;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    Product[] cart = new Product[10]; //구입한 물건을 담을 배열

    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint; //보너스 점수를 추가합니다.
        cart[i++] = p; //카트에 물건을 담습니다.
        System.out.println(p + "을/를 구입하셨습니다");
    }

    void summary() {
        int sum = 0; //구입한 물품의 가격의 합계
        String itemList = ""; //구입한 물품의 목록

        //반복문을 이용해서 구입한 물품의 총 가격과 목록을 만듭니다.
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                break;
            }
            sum += cart[i].price;
            itemList += cart[i] + ", "; //car[i].toString() 과 같음.
        }
        System.out.println("구입한 물품의 총 가격은 " + sum + "만원 입니다");
        System.out.println("구입하는 제품은 " + itemList + "입니다.");
    }
}

























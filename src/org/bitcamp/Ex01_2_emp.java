package org.bitcamp;

import org.bitcamp.emp.Emp;

public class Ex01_2_emp {
    public static void main(String[] args) {

//        Emp emp; //emp라는 변수를 선언합니다.
        Emp emp = new Emp(); // new  Emp() >> Emp라는 클래스를 줄테니 여기에 해당하는 주소값을 넘겨받아서(=) >>
        System.out.println(emp); //org.bitcamp.emp.Emp@1b6d3586 >> Emp 클래스의 주소입니다.
        //Why ?? 내가 emp를 찍었다는 것은 emp가 가진 값을 찍겠다 >> ""위 참조주소는 조작된 값""입니다  (org.bitcamp.emp.Emp +@+""hashcode"")
        Emp emp2 = emp; //나는 내가 가진 emp1의 값을 emp2에게 주겠다 >> ((org.bitcamp.emp.Emp +@+""1b6d3586"") 을 emp2에게 주소값을 넘겨주겠습니다.
        //emp2 와 emp는 같은 집에 살고있난???


        if (emp.equals(emp2)) {
            System.out.println("서로의 참조 주소는 같습니다");
        } else {
            System.out.println("주소가 달라요 ");
        }
        //서로의 참조 주소가 같다고 하네요 ㄷㄷ;;
        //Emp 도 타입입니다.
    }

}




















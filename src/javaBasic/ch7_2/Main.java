package javaBasic.ch7_2;

public class Main {
    public static void main(String[] args) {
        Unit[] group = new Unit[3];
        group[0] = new Marine();
        group[1] = new Marine();
        group[2] = new Marine();

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200); //그룹을 묶여서 여러 객체들을 움직이게 함..
        }
    }

}



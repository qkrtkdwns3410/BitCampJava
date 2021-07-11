package javaBasic.ch6.javaBasic.ch7;

/*

private : 같은 클래스 내에서만 접근이 가능합니다.
(default) : 같은 패키지 내에서만 접근이 가능하다.
protected : 같은 패키지 내에서  , 그리고 다른 패키지의 자손 클래스에서 접근 가능합니다
public : 접근 제한이 전혀 없습니다,

 */
class MyParent {
    private int prv; //같은 클래스
    int dft;    //같은 패키지
    protected int prt; //같은 패키지 + 자손(다른 패키지)
    public int pub; //접근 제한 없음

    public void printMembers() {

    }
}

public class ch7_21_accessModifieer {
    public static void main(String[] args) {

    }
}

package javaBasic.ch7_2;

abstract class Player {
    abstract void play(int pos);
    abstract void stop();
}

//추상 클래스는 상속을 통해 완성해야 객체를 생성가능합니다.
class AudioPlayer extends Player {
    void play(int pos) {}

    void stop() {}
}
public class PlayerTest {
    public static void main(String[] args) {
//        Player p = new Player(); //추상 클래스의 객체를 생성했음.. >미완성 클래스이기에 에러 발생하는 것임

        Player ap = new AudioPlayer(); //다형성 ... 기능이 많은 것이 적은 것을 생성하면 안됨 >> 조상클래스가 오디오 플레이어를 가리키기에 에러 X
        ap.play(100);
        ap.stop();

    }

}


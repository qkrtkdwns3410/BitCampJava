package javaBasic.ch7;

class Tv {
    boolean power; //전원상태(on/off)
    int channel;       //채널

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}

class SmartTv extends Tv {
    boolean caption;

    void displayCation(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
public class ch7_1_inheritance2 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();


    }
}

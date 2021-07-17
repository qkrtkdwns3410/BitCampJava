package javaBasic.ch7_2;

/*
추상 클래스의 작성
여러 클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나 기존 클래스의 공통 부분을 뽑아서 추상클래스를 만든다.

 */

abstract class Unit {
    int x, y;

    abstract void move(int x, int y); //무조건 구현을 해야하는 친구는 따로 뺀다.

    void stop() {

    }

}

class Marine extends Unit {
    void move(int x, int y) {

    }

    void stimPack() {

    }

}

class Tank extends Unit {
    void move(int x, int y) {

    }

    void changeMode() {
    }

}

class Dropship extends Unit {
    void move(int x, int y) {

    }

    void load() {}
    void unload(){}

}


























package main;

import media.Television;
import media.Radio;

public class Main {

    public static void main(String[] args) {
        Television Panasonic = new Television();
        Panasonic.info();

        Panasonic.setIsTurnedOn(true);
        Panasonic.setVolume(34);
        Panasonic.setCurrentProgram(5);

        Panasonic.info();

        Radio radio = new Radio();
        radio.setAmFrequency(102);
        radio.setFmFrequency(900);
        radio.setBand('F');
        radio.info();

        Radio radio2 = new Radio(87, 789, 'A');
        radio2.info();
    }
}

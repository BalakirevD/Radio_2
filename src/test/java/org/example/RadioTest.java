package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    Radio radioExpected = new Radio();
    Radio radioActual = new Radio();

    @Test
    void nextStation() {
        radioExpected.setCurrentRadioStation(6);
        radioActual.setCurrentRadioStation(5);

        radioActual.nextStation();
        Assertions.assertEquals(radioExpected.getCurrentRadioStation(), radioActual.getCurrentRadioStation());
    }

    @Test
    void nextStationIf9() {
        radioExpected.setCurrentRadioStation(0);
        radioActual.setCurrentRadioStation(9);

        radioActual.nextStation();
        Assertions.assertEquals(radioExpected.getCurrentRadioStation(), radioActual.getCurrentRadioStation());
    }

    @Test
    void prevStation() {
        radioExpected.setCurrentRadioStation(6);
        radioActual.setCurrentRadioStation(7);

        radioActual.prevStation();
        Assertions.assertEquals(radioExpected.getCurrentRadioStation(), radioActual.getCurrentRadioStation());
    }

    @Test
    void prevStationIf0() {
        radioExpected.setCurrentRadioStation(9);
        radioActual.setCurrentRadioStation(0);

        radioActual.prevStation();
        Assertions.assertEquals(radioExpected.getCurrentRadioStation(), radioActual.getCurrentRadioStation());
    }

    @Test
    void increaseVolume() {
        radioExpected.setSoundVolume(6);
        radioActual.setSoundVolume(5);

        radioActual.increaseVolume();
        Assertions.assertEquals(radioExpected.getSoundVolume(), radioActual.getSoundVolume());
    }

    @Test
    void increaseVolumeIf100() {
        radioExpected.setSoundVolume(0);
        radioActual.setSoundVolume(100);

        radioActual.increaseVolume();
        Assertions.assertEquals(radioExpected.getSoundVolume(), radioActual.getSoundVolume());
    }

    @Test
    void reductionVolume() {
        radioExpected.setSoundVolume(6);
        radioActual.setSoundVolume(7);

        radioActual.reductionVolume();
        Assertions.assertEquals(radioExpected.getSoundVolume(), radioActual.getSoundVolume());
    }

    @Test
    void reductionVolumeIf0() {
        radioExpected.setSoundVolume(100);
        radioActual.setSoundVolume(0);

        radioActual.reductionVolume();
        Assertions.assertEquals(radioExpected.getSoundVolume(), radioActual.getSoundVolume());
    }
}
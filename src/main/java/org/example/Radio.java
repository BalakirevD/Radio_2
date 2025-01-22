package org.example;

public class Radio {
    public int currentRadioStation;
    public int soundVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            this.currentRadioStation = 0;
        } else if (currentRadioStation > 9) {
            this.currentRadioStation = 9;
        } else
            this.currentRadioStation = currentRadioStation;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            this.soundVolume = 0;
        } else if (soundVolume > 100) {
            this.soundVolume = 100;
        } else this.soundVolume = soundVolume;
    }

    public void nextStation() {
        if (this.getCurrentRadioStation() == 9) {
            this.setCurrentRadioStation(0);
        } else this.setCurrentRadioStation(this.getCurrentRadioStation() + 1);
    }

    public void prevStation() {
        if (this.getCurrentRadioStation() == 0) {
            this.setCurrentRadioStation(9);
        } else this.setCurrentRadioStation(this.getCurrentRadioStation() - 1);
    }

    public void increaseVolume() {
        if (this.getSoundVolume() == 100) {
            this.setSoundVolume(0);
        } else this.setSoundVolume(this.getSoundVolume() + 1);
    }

    public void reductionVolume() {
        if (this.getSoundVolume() == 0) {
            this.setSoundVolume(100);
        } else this.setSoundVolume(this.getSoundVolume() - 1);
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }
}

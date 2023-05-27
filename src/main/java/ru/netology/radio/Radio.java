package ru.netology.radio;

public class Radio {

    public int currentRadioStationNumber;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
            return;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
            return;
        } else {
            currentRadioStationNumber = 9;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void volumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
            return;
        } else {
            currentVolume = 100;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            return;
        } else {
            currentVolume = 0;
        }
    }
}


package ru.netology.radio;

public class Radio {

    private int minStation = 0;
    private int numberOfStations = 10;
    private int maxStation = numberOfStations - 1;
    private int currentRadioStationNumber;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.maxStation = numberOfStations - 1;
    }
    public Radio() {}

    public Radio(int minVolume, int maxVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minStation) {
            return;
        }
        if (newCurrentRadioStationNumber > maxStation) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void prev() {
        if (currentRadioStationNumber > minStation) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
            return;
        } else {
            currentRadioStationNumber = maxStation;
        }
    }

    public void next() {
        if (currentRadioStationNumber < maxStation) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
            return;
        } else {
            currentRadioStationNumber = minStation;
        }
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            return;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
            return;
        } else {
            currentVolume = minVolume;
        }
    }
}


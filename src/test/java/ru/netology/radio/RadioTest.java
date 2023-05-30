package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio condStation = new Radio(10);
    Radio condVolume = new Radio(0, 100);

    @Test
    public void shouldSetRadioStationBelowTheMinimum() {

        condStation.setRadioStationNumber(-1);
        int expected = 0;
        int actual = condStation.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationToZero() {

        condStation.setRadioStationNumber(0);
        int expected = 0;
        int actual = condStation.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationToOne() {

        condStation.setRadioStationNumber(1);
        int expected = 1;
        int actual = condStation.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationToEight() {

        condStation.setRadioStationNumber(8);
        int expected = 8;
        int actual = condStation.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationToNine() {

        condStation.setRadioStationNumber(9);
        int expected = 9;
        int actual = condStation.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationToTen() {
        Radio condStation = new Radio();

        condStation.setRadioStationNumber(10);
        int expected = 0;
        int actual = condStation.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheNextRadioStation() {

        condStation.setRadioStationNumber(8);

        condStation.next();

        int expected = 9;
        int actual = condStation.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheNextRadioStationAboveMaximum() {
        condStation.setRadioStationNumber(9);

        condStation.next();

        int expected = 0;
        int actual = condStation.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setThePrevRadioStation() {
        condStation.setRadioStationNumber(1);

        condStation.prev();

        int expected = 0;
        int actual = condStation.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setThePrevRadioStationBelowTheMinimum() {
        condStation.setRadioStationNumber(0);

        condStation.prev();

        int expected = 9;
        int actual = condStation.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheVolumeLevelBelowTheMinimum() {
        condVolume.setCurrentVolume(-1);

        int expected = 0;
        int actual = condVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeDownToMinimum() {
        condVolume.setCurrentVolume(-1);

        int expected = 0;
        int actual = condVolume.getCurrentVolume();
    }

    @Test
    public void setVolumeToMinimum() {
        condVolume.setCurrentVolume(0);

        int expected = 0;
        int actual = condVolume.getCurrentVolume();
    }

    @Test
    public void setVolumeOne() {
        condVolume.setCurrentVolume(1);

        int expected = 1;
        int actual = condVolume.getCurrentVolume();
    }

    @Test
    public void setTheVolumeToNinetyNine() {
        condVolume.setCurrentVolume(99);

        int expected = 99;
        int actual = condVolume.getCurrentVolume();
    }

    @Test
    public void setTheVolumeToMax() {
        condVolume.setCurrentVolume(100);

        int expected = 100;
        int actual = condVolume.getCurrentVolume();
    }

    @Test
    public void setTheVolumeUpToMax() {
        condVolume.setCurrentVolume(101);

        int expected = 0;
        int actual = condVolume.getCurrentVolume();
    }


    @Test
    public void setTheVolumeAboveOneHundred() {
        condVolume.setCurrentVolume(100);

        condVolume.volumeUp();

        int expected = 100;
        int actual = condVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnUpTheVolume() {
        condVolume.setCurrentVolume(99);

        condVolume.volumeUp();

        int expected = 100;
        int actual = condVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownTheVolumeAtZero() {
        condVolume.setCurrentVolume(0);

        condVolume.volumeDown();

        int expected = 0;
        int actual = condVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownTheVolume() {
        condVolume.setCurrentVolume(1);

        condVolume.volumeDown();

        int expected = 0;
        int actual = condVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStationBelowTheMinimum() {
        Radio cond = new Radio();

        cond.setRadioStationNumber(-1);
        int expected = 0;
        int actual = cond.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationToZero() {
        Radio cond = new Radio();

        cond.setRadioStationNumber(0);
        int expected = 0;
        int actual = cond.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationToOne() {
        Radio cond = new Radio();

        cond.setRadioStationNumber(1);
        int expected = 1;
        int actual = cond.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationToEight() {
        Radio cond = new Radio();

        cond.setRadioStationNumber(8);
        int expected = 8;
        int actual = cond.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationToNine() {
        Radio cond = new Radio();

        cond.setRadioStationNumber(9);
        int expected = 9;
        int actual = cond.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationToTen() {
        Radio cond = new Radio();

        cond.setRadioStationNumber(10);
        int expected = 0;
        int actual = cond.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheNextRadioStation() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(8);

        cond.next();

        int expected = 9;
        int actual = cond.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheNextRadioStationAboveMaximum() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(9);

        cond.next();

        int expected = 0;
        int actual = cond.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setThePrevRadioStation() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(1);

        cond.prev();

        int expected = 0;
        int actual = cond.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setThePrevRadioStationBelowTheMinimum() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(0);

        cond.prev();

        int expected = 9;
        int actual = cond.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheVolumeLevelBelowTheMinimum() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeDownToMinimum() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.getCurrentVolume();
    }

    @Test
    public void setVolumeToMinimum() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        int expected = 0;
        int actual = cond.getCurrentVolume();
    }

    @Test
    public void setVolumeOne() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);

        int expected = 1;
        int actual = cond.getCurrentVolume();
    }

    @Test
    public void setTheVolumeToNinetyNine() {
        Radio cond = new Radio();
        cond.setCurrentVolume(99);

        int expected = 99;
        int actual = cond.getCurrentVolume();
    }

    @Test
    public void setTheVolumeToMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);

        int expected = 100;
        int actual = cond.getCurrentVolume();
    }

    @Test
    public void setTheVolumeUpToMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(101);

        int expected = 0;
        int actual = cond.getCurrentVolume();
    }


    @Test
    public void setTheVolumeAboveOneHundred() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);

        cond.volumeUp();

        int expected = 100;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnUpTheVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(99);

        cond.volumeUp();

        int expected = 100;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownTheVolumeAtZero() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.volumeDown();

        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownTheVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);

        cond.volumeDown();

        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

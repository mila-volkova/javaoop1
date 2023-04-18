import javaoop.service.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void tunedStationNextMinTest() {

        Radio radio = new Radio();


        radio.setTunedStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tunedStationNextBoundaryTest() {
        Radio radio = new Radio();
        radio.setTunedStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tunedStationNextBoundaryTest1() {
        Radio radio = new Radio();
        radio.setTunedStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tunedStationNextMaxTest() {
        Radio radio = new Radio();
        radio.setTunedStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tunedStationPrewMaxTest() {
        Radio radio = new Radio();
        radio.setTunedStation(9);
        radio.prew();
        int expected = 8;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tunedStationPrewMinTest() {
        Radio radio = new Radio();
        radio.setTunedStation(0);
        radio.prew();
        int expected = 9;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tunedStationPrewBoundaryTest1() {
        Radio radio = new Radio();
        radio.setTunedStation(8);
        radio.prew();
        int expected = 7;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tunedStationPrewBoundaryTest2() {
        Radio radio = new Radio();
        radio.setTunedStation(1);
        radio.prew();
        int expected = 0;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void tunedStationAverageTest() {
        Radio radio = new Radio(30);
        radio.setTunedStation(15);
        int expected = 15;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tunedStationMinTest() {
        Radio radio = new Radio(30);
        radio.setTunedStation(0);
        int expected = 0;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tunedStationBoundaryTest() {
        Radio radio = new Radio(30);
        radio.setTunedStation(1);
        int expected = 1;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tunedStationBoundaryTest1() {
        Radio radio = new Radio(30);
        radio.setTunedStation(28);
        int expected = 28;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tunedStationMaxTest1() {
        Radio radio = new Radio(30);
        radio.setTunedStation(29);
        int expected = 29;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tunedStationOverseasTest() {
        Radio radio = new Radio(30);
        radio.setTunedStation(40);
        int expected = 0;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tunedStationOverseasTest1() {
        Radio radio = new Radio(30);
        radio.setTunedStation(-3);
        int expected = 0;
        int actual = radio.getTunedStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolumeMaxTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void CurrentVolumeMinTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void CurrentVolumeBoundaryTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void CurrentVolumeBoundaryTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void CurrentVolumeAverageTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void CurrentVolumeOverseasTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(115);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void CurrentVolumeOverseasTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


}






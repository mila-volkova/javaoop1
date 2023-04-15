package javaoop.service;

public class Radio {
    private int tunedStation;
    private int currentVolume;

    public void next() {
        if (tunedStation != 9) {
            tunedStation++;
        } else {
            tunedStation = 0;
        }
    }

    public void prew() {
        if (tunedStation != 0) {
            tunedStation--;
        } else {
            tunedStation = 9;
        }
    }

    public int getTunedStation() {
        return tunedStation;
    }

    public void setTunedStation(int tunedStation) {
        if (tunedStation < 0) {
            return;
        }
        if (tunedStation > 9) {
            return;
        }

        this.tunedStation = tunedStation;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;

        }
        this.currentVolume = currentVolume;
    }
}










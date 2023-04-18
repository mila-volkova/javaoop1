package javaoop.service;

public class Radio {
    private int tunedStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }




    public Radio (int numberOfStation) {
        this.maxStation = numberOfStation - 1;
    }


    public void next() {
        if (tunedStation != maxStation ) {
            tunedStation++;
        } else {
            tunedStation = 0;
        }
    }

    public void prew() {
        if (tunedStation != 0) {
            tunedStation--;
        } else {
            tunedStation = maxStation ;
        }
    }

    public int getTunedStation() {
        return tunedStation;
    }

    public void setTunedStation(int tunedStation) {
        if (tunedStation < 0) {
            return;
        }
        if (tunedStation > maxStation ) {
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










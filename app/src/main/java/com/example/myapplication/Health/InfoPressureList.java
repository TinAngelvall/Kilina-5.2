package com.example.myapplication.Health;

public class InfoPressureList {
    private int upperPressure;
    private int lowerPressure;
    private int pulse;
    private int tachycardia;
    private int date;

    public InfoPressureList(int upperPressure, int lowerPressure, int pulse, int tachycardia, int date) {
        this.upperPressure = upperPressure;
        this.lowerPressure = lowerPressure;
        this.pulse = pulse;
        this.tachycardia = tachycardia;
        this.date = date;
    }

    public int getUpperPressure() {
        return upperPressure;
    }

    public void setUpperPressure(int upperPressure) {
        this.upperPressure = upperPressure;
    }

    public int getLowerPressure() {
        return lowerPressure;
    }

    public void setLowerPressure(int lowerPressure) {
        this.lowerPressure = lowerPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getTachycardia() {
        return tachycardia;
    }

    public void setTachycardia(int tachycardia) {
        this.tachycardia = tachycardia;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "InfoPressureList{" +
                "upperPressure=" + upperPressure +
                ", lowerPressure=" + lowerPressure +
                ", pulse=" + pulse +
                ", tachycardia=" + tachycardia +
                ", data=" + date +
                '}';
    }
}

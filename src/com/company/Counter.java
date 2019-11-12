package com.company;

public class Counter {
    public double presentValue;
    public double pastValue;

    public Counter(double pastValue, double presentValue) {
        this.pastValue = pastValue;
        this.presentValue = presentValue;

    }

    public double getPastValue() {
        return pastValue;
    }

    public double getPresentValue() {
        return presentValue;
    }

    public void setPastValue(double pastValue) {
        this.pastValue = pastValue;
    }

    public void setIndication() {
        this.presentValue = presentValue;
    }


    @Override
    public String toString() {
        return "Counter{" +
                "presentValue=" + presentValue +
                ", pastValue=" + pastValue +
                '}';
    }
}

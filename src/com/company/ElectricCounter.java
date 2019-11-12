package com.company;

public class ElectricCounter extends Counter {

    private double COST_100KW = 0.9;
    private double COST_UP_100KW = 1.68;

    public ElectricCounter(double pastValue, double presentValue) {
        super(pastValue, presentValue);

    }

    private double num;

    public void count() {

        if ((presentValue - pastValue) <= 100) {
            num = (presentValue - pastValue) * COST_100KW;
        } else {
            if ((presentValue - pastValue) > 100) {
                num = 100 * COST_100KW + (((presentValue - pastValue) - 100) * COST_UP_100KW);
            }
        }
        System.out.format("%.2f%n", num);

    }

    @Override
    public String toString() {
        return "ElectricCounter{" +
                " pastValue=" + pastValue +
                ", presentValue=" + presentValue +
                '}';
    }
}


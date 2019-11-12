package com.company;

public class ColdWaterCounter extends Counter implements Count {
    private double COST_KUB_METR = 13.14;

    public ColdWaterCounter(double pastValue, double presentValue/*,double costKubMetr*/) {
        super(pastValue, presentValue);
//        this.COST_KUB_METR = costKubMetr;
    }

//    public double getCOST_KUB_METR() {
//        return COST_KUB_METR;
//    }
//
//    public void setCOST_KUB_METR(double COST_KUB_METR) {
//        this.COST_KUB_METR = COST_KUB_METR;
//    }

    private double num;

    public void count() {
        num = (presentValue - pastValue) * COST_KUB_METR;
        System.out.format("%.2f%n", num);

    }

}


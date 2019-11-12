package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter counter value for last month = ");
        if (scanner.hasNextDouble()) {
            double pastVal = scanner.nextInt();
        }else{
            System.err.println("You enter incorrect value ");
//            scanner.close();
        }

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter counter value for current month = ");
        if (sc.hasNextInt()) {
            int presentVal = sc.nextInt();

        }else{
            System.err.println("You enter incorrect value ");
//            scanner.close();
        }

        ElectricCounter countElectric = new ElectricCounter(3089.0, 3434.0);
        countElectric.count();

        ColdWaterCounter countColdWater = new ColdWaterCounter(0.0, 6.88);
        countColdWater.count();

        WaterDisposalCounter countWaterDisposal = new WaterDisposalCounter(0.0, 9.88);
        countWaterDisposal.count();


//       ElectricCounter electric = new ElectricCounter(pastValue,);
//        System.out.println(electric.toString());


    }
}

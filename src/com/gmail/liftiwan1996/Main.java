package com.gmail.liftiwan1996;


import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        int consta;
        int stDays;
        double income;
        String dateP;
        String dateS;
        ArrayList<SaleFish> fish = new ArrayList<SaleFish>();
        SaleFish pike = new SaleFish();
        SaleFish shark = new SaleFish();
        SaleFish carp = new SaleFish();
        SaleFish zander = new SaleFish();
        fish.add(pike);
        fish.add(shark);
        fish.add(carp);
        fish.add(zander);
// income for pike
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input price of purchase pike");
        pike.setPp(sc.nextDouble());

        System.out.println("Please input price of sale pike");
        pike.setPs(sc.nextDouble());

        System.out.println("Please input weight of pike");
        pike.setWeight(sc.nextInt());

        System.out.println("Please input date of purchase in format \"d/M/yyyy\" ");
        dateP = sc.nextLine();

        System.out.println("Please input date of sale in format \"d/M/yyyy\" ");
        dateS = sc.nextLine();

        stDays = pike.dateDif(dateP, dateS);

        System.out.println("Please input constant");
        consta = sc.nextInt();

        income = (pike.getPs() - pike.getPp() - stDays * consta) * pike.getWeight();

        System.out.println("Sum of your operation of pike is " + income + "$");
        System.out.println();
        System.out.println();
        // income for shark
        System.out.println("Please input price of purchase shark");
        shark.setPp(sc.nextDouble());

        System.out.println("Please input price of sale shark");
        shark.setPs(sc.nextDouble());

        System.out.println("Please input weight of shark");
        shark.setWeight(sc.nextInt());

        System.out.println("Please input date of purchase in format \"d/M/yyyy\" ");
        dateP = sc.nextLine();

        System.out.println("Please input date of sale in format \"d/M/yyyy\" ");
        dateS = sc.nextLine();

        stDays = shark.dateDif(dateP, dateS);

        System.out.println("Please input constant");
        consta = sc.nextInt();

        income = (shark.getPs() - shark.getPp() - stDays * consta) * shark.getWeight();

        System.out.println("Sum of your operation of shark is " + income + "$");
        System.out.println();
        System.out.println();

        // income for carp
        System.out.println("Please input price of purchase carp");
        carp.setPp(sc.nextDouble());

        System.out.println("Please input price of sale carp");
        carp.setPs(sc.nextDouble());

        System.out.println("Please input weight of carp");
        carp.setWeight(sc.nextInt());

        System.out.println("Please input date of purchase in format \"d/M/yyyy\" ");
        dateP = sc.nextLine();

        System.out.println("Please input date of sale in format \"d/M/yyyy\" ");
        dateS = sc.nextLine();

        stDays = carp.dateDif(dateP, dateS);

        System.out.println("Please input constant");
        consta = sc.nextInt();

        income = (carp.getPs() - carp.getPp() - stDays * consta) * carp.getWeight();

        System.out.println("Sum of your operation of carp is " + income + "$");
        System.out.println();
        System.out.println();

        // income for zander
        System.out.println("Please input price of purchase zander");
        zander.setPp(sc.nextDouble());

        System.out.println("Please input price of sale zander");
        zander.setPs(sc.nextDouble());

        System.out.println("Please input weight of zander");
        zander.setWeight(sc.nextInt());

        System.out.println("Please input date of purchase in format \"d/M/yyyy\" ");
        dateP = sc.nextLine();

        System.out.println("Please input date of sale in format \"d/M/yyyy\" ");
        dateS = sc.nextLine();

        stDays = zander.dateDif(dateP, dateS);

        System.out.println("Please input constant");
        consta = sc.nextInt();

        income = (zander.getPs() - zander.getPp() - stDays * consta) * zander.getWeight();

        System.out.println("Sum of your operation of zander is " + income + "$");

    }
}

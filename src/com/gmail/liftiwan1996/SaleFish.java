package com.gmail.liftiwan1996;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class SaleFish {
    private String name;
    private double pp;
    private double ps;
    private int weight;

    public SaleFish() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPp() {
        return pp;
    }

    public void setPp(double pp) {
        this.pp = pp;
    }

    public double getPs() {
        return ps;
    }

    public void setPs(double ps) {
        this.ps = ps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int dateDif(String dateP, String dateS) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate datePurshase = LocalDate.parse(dateP, formatter);
        LocalDate dateSale = LocalDate.parse(dateS, formatter);
        Period p3 = Period.between(datePurshase, dateSale);
        int stDays = p3.getDays();
        return stDays;
    }
}





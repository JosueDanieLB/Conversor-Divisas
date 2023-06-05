package com.alura.challenge.conversor.monedas;

import com.alura.challenge.conversor.apiMonedas.ConsumoAPI;

public class Divisas {

    private static double USD;
    private static double MXN;
    private static double EUR;
    private static double GBP;
    private static double JPY;
    private static double KRW;

    public double getUSD() {
        return USD;
    }

    public double getMXN() {
        return MXN;
    }

    public double getEUR() {
        return EUR;
    }

    public double getGBP() {
        return GBP;
    }

    public double getJPY() {
        return JPY;
    }

    public double getKRW() {
        return KRW;
    }

    public void setUSD(double USD) {
        Divisas.USD = USD;
    }

    public void setMXN(double MXN) {
        Divisas.MXN = MXN;
    }

    public void setEUR(double EUR) {
        Divisas.EUR = EUR;
    }

    public void setGBP(double GBP) {
        Divisas.GBP = GBP;
    }

    public void setJPY(double JPY) {
        Divisas.JPY = JPY;
    }

    public void setKRW(double KRW) {
        Divisas.KRW = KRW;
    }
}

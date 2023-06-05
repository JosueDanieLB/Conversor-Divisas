package com.alura.challenge.conversor.conversorMonedas;

import com.alura.challenge.conversor.monedas.Divisas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {

    Divisas divisas = new Divisas();
    double monedaDolar = divisas.getMXN();
    double monedaEuro = monedaDolar / divisas.getEUR();
    double monedaLibra = monedaDolar / divisas.getGBP();
    double monedaYen = monedaDolar / divisas.getJPY();
    double monedaWon = monedaDolar / divisas.getKRW();

    public void ConvertirDolaresAPesos(double valor) {
        System.out.println("Hoy el dólar en pesos vale: " + monedaDolar);
        monedaDolar = valor * monedaDolar;
        monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Mexicanos");
    }

    public void ConvertirEurosAPesos(double valor) {
        System.out.println("Hoy el euro en pesos vale: " + monedaEuro);
        monedaEuro = valor * monedaEuro;
        monedaEuro = (double) Math.round(monedaEuro *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Mexicanos");
    }

    public void ConvertirLibrasAPesos(double valor) {
        System.out.println("Hoy la libra esterlina en pesos vale: " + monedaLibra);
        monedaLibra = valor * monedaLibra;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Mexicanos");
    }

    public void ConvertirYenAPesos(double valor) {
        System.out.println("Hoy el yen en pesos vale: " + monedaYen);
        monedaYen = valor * monedaYen;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Mexicanos");
    }

    public void ConvertirWonAPesos(double valor) {
        //double monedaWon = valor * 3.04;
        System.out.println("Hoy el won en pesos vale: " + monedaWon);
        monedaWon = valor * monedaWon;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Mexicanos");
    }
}

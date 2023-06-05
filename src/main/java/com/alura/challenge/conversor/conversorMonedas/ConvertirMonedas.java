package com.alura.challenge.conversor.conversorMonedas;

import com.alura.challenge.conversor.monedas.Divisas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

    Divisas divisas = new Divisas();
    double monedaDolar = divisas.getMXN();
    double monedaEuro = monedaDolar / divisas.getEUR();
    double monedaLibra = monedaDolar / divisas.getGBP();
    double monedaYen = monedaDolar / divisas.getJPY();
    double monedaWon = monedaDolar / divisas.getKRW();

    public void ConvertirPesosADolares(double valor) {
        System.out.println("Hoy el peso en dólares vale: " + 1/monedaDolar);
        monedaDolar = valor / monedaDolar;
        monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
    }

    public void ConvertirPesosAEuros(double valor) {
        System.out.println("Hoy el pesos en euros vale: " + 1/monedaEuro);
        monedaEuro = valor / monedaEuro;
        monedaEuro = (double) Math.round(monedaEuro *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
    }

    public void ConvertirPesosALibras(double valor) {
        System.out.println("Hoy el peso en libras esterlinas vale: " + 1/monedaLibra);
        monedaLibra = valor / monedaLibra;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
    }

    public void ConvertirPesosAYen(double valor) {
        System.out.println("Hoy el peso en yenes vale: " + 1/monedaYen);
        monedaYen = valor / monedaYen;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yenes");
    }

    public void ConvertirPesosAWon(double valor) {
        System.out.println("Hoy el peso en wones vale: " + 1/monedaWon);
        monedaWon = valor / monedaWon;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
    }
}

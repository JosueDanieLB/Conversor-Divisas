package com.alura.challenge.conversor.conversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

    public double ConvertirCelciusAFahrenheit(double valor) {
        double fahrenheit = valor * 1.8 + 32;
        fahrenheit = (double) Math.round(fahrenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +fahrenheit+ " Grados Fahrenheit ");
        return fahrenheit;
    }

    public void ConvertirCelciusAKelvin(double valor){
        double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +kelvin+ " Kelvin");
    }

    public void ConvertirFahrenheitACelcius(double valor) {
        double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Fahrenheit son " +celcius+ " Celcius");
    }

    public void ConvertirFahrenheitAKelvin(double valor) {
        double fahrenheitKelvin = (valor + 459.67)*5/9 ;
        fahrenheitKelvin = (double) Math.round(fahrenheitKelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Fahrenheit son " +fahrenheitKelvin+ " Kelvin");
    }

    public double ConvertirKelvinACelcius(double valor) {
        double kelvinCelcius = valor - 273.15;
        kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinCelcius+ " Celcius");
        return kelvinCelcius;
    }

    public void ConvertirKelvinAFahrenheit(double valor) {
        double kelvinFahrenheit = 1.8*(valor - 273) + 32;
        kelvinFahrenheit	= (double) Math.round(kelvinFahrenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinFahrenheit+ " Fahrenheit");
    }

}

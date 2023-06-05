package com.alura.challenge.conversor.conversorTemperatura;

import javax.swing.JOptionPane;

public class functionTemperatura {

    ConvertirTemperatura temperatura = new ConvertirTemperatura();

    public void ConvertirTemperatura(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Fahrenheit a Grados Celcius", "Grados Fahrenheit a Kelvin", "Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch(opcion) {
            case "Grados Celcius a Grados Farenheit":
                temperatura.ConvertirCelciusAFahrenheit(Minput);
                break;
            case "Grados Celcius a Kelvin":
                temperatura.ConvertirCelciusAKelvin(Minput);
                break;
            case "Grados Fahrenheit a Grados Celcius":
                temperatura.ConvertirFahrenheitACelcius(Minput);
                break;
            case "Grados Fahrenheit a Kelvin":
                temperatura.ConvertirFahrenheitAKelvin(Minput);
                break;
            case "Kelvin a Grados Celcius":
                temperatura.ConvertirKelvinACelcius(Minput);
                break;
            case "Kelvin a Grados Farenheit":
                temperatura.ConvertirKelvinAFahrenheit(Minput);
                break;
        }
    }
}

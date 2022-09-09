package ConversorDeTemperaturaEMoedas;

import javax.swing.JOptionPane;

public class ConverterTemperatura {

    public void ConverterTemperaturaFahrenheit(double temperaturaRecebida) {
        double fahrenheit = (temperaturaRecebida / 5 * 9) + 32; 
        fahrenheit = (double) Math.round(fahrenheit * 100d)/100;
        JOptionPane.showMessageDialog(null, "Está fazendo " + fahrenheit + "°F");
    }

    public void ConverterTemperaturaKelvin(double temperaturaRecebida) {
        double kelvin = (temperaturaRecebida / 5 * 5) + 273;
        kelvin = (double) Math.round(kelvin * 100d)/100;
        JOptionPane.showMessageDialog(null, "Está fazendo " + kelvin + "°K");
    }
}
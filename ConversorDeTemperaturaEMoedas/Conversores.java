package ConversorDeTemperaturaEMoedas;

import javax.swing.JOptionPane;

public class Conversores {
    public static void main(String[] args) {

        ConverterMoeda converterG = new ConverterMoeda();
        ConverterTemperatura  converterT = new ConverterTemperatura();
        
        while(true) {
            String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Conversor de Moeda", "Conversor de Temperatura" }, "Escolha").toString();
            switch (opcoes) {
                case "Conversor de Moeda": 
                String input = JOptionPane.showInputDialog("Insira um valor em reais");
    
                double valorRecebido = Double.parseDouble(input);
    
                converterG.ConverterReaisParaDolar(valorRecebido);
                converterG.ConverterReaisParaEuro(valorRecebido);
            }
            switch (opcoes) {
                case "Conversor de Temperatura":
                String input = JOptionPane.showInputDialog("Insura uma temperatura em °C");
    
                double temperaturaRecebida = Double.parseDouble(input);
    
                converterT.ConverterTemperaturaFahrenheit(temperaturaRecebida);
                converterT.ConverterTemperaturaKelvin(temperaturaRecebida);
            }
        }
    }
}
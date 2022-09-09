package ConversorDeTemperaturaEMoedas;

import javax.swing.JOptionPane;

public class ConverterMoeda {

    public void ConverterReaisParaDolar(double valorRecebido) {
        double moedaDolar = valorRecebido / 5.21;
        moedaDolar = (double) Math.round(moedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Você tem $" + moedaDolar + "Dólares");
    }

    public void ConverterReaisParaEuro(double valorRecebido) {
        double moedaEuro = valorRecebido / 5.22;
        moedaEuro = (double) Math.round(moedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Você tem €" + moedaEuro + "Euros");
    }
}

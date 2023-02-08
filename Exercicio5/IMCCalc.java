package Exercicio5;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class IMCCalc {
    //Implemente uma classe para Cálculo de IMC. Esta classe deverá, quando executada, solicitar o sexo, 
    //o peso e a altura, na sequência realizar o cálculo do IMC, conforme apresentado abaixo. O cálculo deverá ser feito em um método separado. 
    //Solicitar as informações ao usuário utilizando um JoptionPane.showInputDialog.

    public static void main(String[] args) {
        JOptionPane.showInputDialog("Informe o sexo do paciente:");   
        Double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do paciente:"));         
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do paciente:"));   
        RealizarCalculoImc(peso, altura);
    }
    public static void RealizarCalculoImc(Double peso, Double altura) {
        Double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, ("IMC do paciente: "+imc));
    }
     
}
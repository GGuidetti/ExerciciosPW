package Exercicio5;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class IMCCalc {
    //Implemente uma classe para Cálculo de IMC. Esta classe deverá, quando executada, solicitar o sexo, 
    //o peso e a altura, na sequência realizar o cálculo do IMC, conforme apresentado abaixo. O cálculo deverá ser feito em um método separado. 
    //Solicitar as informações ao usuário utilizando um JoptionPane.showInputDialog.

    public static void main(String[] args) {
        String sexo = JOptionPane.showInputDialog("Informe o sexo do paciente (M ou H):");   
        Double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do paciente:"));         
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do paciente:"));   
        RealizarCalculoImc(sexo, peso, altura);
    }
    public static void RealizarCalculoImc(String sexo, Double peso, Double altura) {
        Double imc = peso / (altura * altura)*10000;
        if (sexo.equals("M")){
            
            if (imc <19.1){
                JOptionPane.showMessageDialog(null, ("A paciente está abaixo do peso"));
            }
            else if (imc >= 19.1 && imc <25.8){
                JOptionPane.showMessageDialog(null, ("A paciente está no peso normal"));
            }
            else if (imc >= 25.8 && imc <27.3){
                JOptionPane.showMessageDialog(null, ("A paciente está marginalmente acima do peso"));
            }
            else if (imc >= 27.3 && imc <32.3){
                JOptionPane.showMessageDialog(null, ("A paciente está acima do peso"));
            }
            else{
                JOptionPane.showMessageDialog(null, ("A paciente está obesa"));
            }
        }
        else if (sexo.equals("H")){
            if (imc <20.7){
                JOptionPane.showMessageDialog(null, ("O paciente está abaixo do peso"));
            }
            else if (imc >= 20.7 && imc <26.4){
                JOptionPane.showMessageDialog(null, ("O paciente está no peso normal"));
            }
            else if (imc >= 26.4 && imc <27.8){
                JOptionPane.showMessageDialog(null, ("O paciente está marginalmente acima do peso"));
            }
            else if (imc >= 27.8 && imc <31.1){
                JOptionPane.showMessageDialog(null, ("O paciente está acima do peso"));
            }
            else{
                JOptionPane.showMessageDialog(null, ("O paciente está obeso"));
            }
        }
        else{
            JOptionPane.showMessageDialog(null, ("Sexo não identificado"));
            return;
        }
        JOptionPane.showMessageDialog(null, ("IMC do paciente: "+imc +"Kg por m²"));
    }
     
}
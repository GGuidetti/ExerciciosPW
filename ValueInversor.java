import java.util.Scanner;

import javax.swing.JOptionPane;

public class ValueInversor {
    // Implemente uma classe que deverá, quando executada, solicitar valores
    // separados por vírgula e apresentar esses valores na ordem inversa. A inversão
    // dos valores deverá ser feita em um método separado. Solicitar as informações
    // ao usuário utilizando um JoptionPane.showInputDialog.

    public static void main(String[] args) {

        String valores = JOptionPane.showInputDialog("Digite dois valores separados por vírgula:");      

        InverterValores(valores);

       
    }

    public static String[] InverterValores(String valores){
        String[] arrayValores = valores.split(",", 2);
        return arrayValores;
    }
    
}
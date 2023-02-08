package Exercicio3;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrderByAscend {
    public static void main(String[] args) {
        String valores = JOptionPane.showInputDialog("Digite três valores separados por virgula:");      
        String[] arrayValores = OrdenarValores(valores);

        JOptionPane.showMessageDialog(null, (arrayValores[0] + "," + arrayValores[1] + "," + arrayValores[2]));
    }

     public static String[] OrdenarValores(String valores){
        String[] arrayValores = valores.split(",", 3);

        int i = 1;
        while(i<arrayValores.length){
            if (Integer.parseInt(arrayValores[i-1]) > Integer.parseInt(arrayValores[i])){
                String valorBkp = arrayValores[i-1];
                arrayValores[i-1] = arrayValores[i];
                arrayValores[i] = valorBkp;
            }
            i++;
        }
        return arrayValores;
    }
}
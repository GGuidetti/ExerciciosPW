package Exercicio1;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AgeIdentificator {
    // Crie uma classe e no método principal e solicite uma idade. Em seguida,
    // apresente uma mensagem informando se é criança, adolescente, adulto ou idoso.
    // Defina os intervalos de valores para classificar a idade entre essas
    // categorias. O valor deverá ser solicitado ao usuário utilizando um
    // JoptionPane.showInputDialog. Criar uma classe para a pessoa.

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:")));
        pessoa.IdentificadorIdade();
       
    }
}
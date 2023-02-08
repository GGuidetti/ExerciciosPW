package Exercicio1;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Pessoa {
    private Integer idade;

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void IdentificadorIdade(){
        String identificacao = "";
        Integer idade = this.idade;

        if (idade <= 12) {
            identificacao = "Criança";
        } else if (idade <= 18) {
            identificacao = "Adolescente";
        } else if (idade < 60) {
            identificacao = "Adulto";
        } else {
            identificacao = "Idoso";
        }

        JOptionPane.showMessageDialog(null, "A idade que voce digitou é referente a de um ser humano " + identificacao);
    }
}
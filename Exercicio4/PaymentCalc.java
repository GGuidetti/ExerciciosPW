package Exercicio4;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PaymentCalc {
    // Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda
    // que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto
    // mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
    // O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês. 
    // Crie uma classe que permita criar várias instâncias da folha de pagamento.

    // 3% Sind -- 11% Fgts

        //Desconto do IR:
        //- Salário Bruto até 900 (inclusive) - isento
        //- Salário Bruto até 1500 (inclusive) - desconto de 5%
        //- Salário Bruto até 2500 (inclusive) - desconto de 10%
        //- Salário Bruto acima de 2500 - desconto de 20% 
        //Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

    public static void main(String[] args) {
        String salario = JOptionPane.showInputDialog("Digite o salário do usuário");   
        String horas = JOptionPane.showInputDialog("Digite as horas trabalhadas do usuário");         
        Pessoa pessoa = new Pessoa();
        pessoa.setSalarioHora(Double.parseDouble(salario));
        pessoa.setHorasTrabalhadas(Double.parseDouble(horas));
        pessoa.CalcularFolhaPagamento();
    }

     
}
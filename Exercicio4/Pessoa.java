package Exercicio4;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Pessoa {
    private Double salarioHora;
    private Double horasTrabalhadas;
    private Double salarioBruto;
    private Double salarioLiquido;
     
    public Pessoa() {
    }

    public Pessoa(Double salarioHora, Double horasTrabalhadas, Double salarioBruto, Double salarioLiquido) {
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public Double getSalarioHora() {
        return this.salarioHora;
    }

    public void setSalarioHora(Double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public Double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return this.salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public Pessoa salarioHora(Double salarioHora) {
        setSalarioHora(salarioHora);
        return this;
    }

    public Pessoa horasTrabalhadas(Double horasTrabalhadas) {
        setHorasTrabalhadas(horasTrabalhadas);
        return this;
    }

    public Pessoa salarioBruto(Double salarioBruto) {
        setSalarioBruto(salarioBruto);
        return this;
    }

    public Pessoa salarioLiquido(Double salarioLiquido) {
        setSalarioLiquido(salarioLiquido);
        return this;
    }

    //Desconto do IR:
        //- Salário Bruto até 900 (inclusive) - isento
        //- Salário Bruto até 1500 (inclusive) - desconto de 5%
        //- Salário Bruto até 2500 (inclusive) - desconto de 10%
        //- Salário Bruto acima de 2500 - desconto de 20% 
        //Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

    public void CalcularFolhaPagamento(){
        Double salarioBruto = this.salarioHora * this.horasTrabalhadas;
        this.setSalarioBruto(salarioBruto);

        Double salarioLiquido;
        Double fgtsDesconto = salarioBruto * 0.11;
        Double sindicatoDesconto = salarioBruto * 0.03;
        Double irDesconto = 0.0;
        Integer irPercent = 0;

        if (salarioBruto <= 900){
            irPercent = 0;
        }
        else if (salarioBruto > 900 && salarioBruto <= 1500){
            irPercent = 5;
            irDesconto = salarioBruto * 0.05; 
        }
        else if (salarioBruto > 1500 && salarioBruto <= 2500){
            irPercent = 10;
            irDesconto = salarioBruto * 0.10;
        }
        else if (salarioBruto > 2500){
            irPercent = 20;
            irDesconto = salarioBruto * 0.20;
        }
        Double totalDesconto = sindicatoDesconto + fgtsDesconto + irDesconto;
        salarioLiquido = salarioBruto - totalDesconto;

        JOptionPane.showMessageDialog(null, ("Salário Bruto("+this.salarioHora +" * "+ this.horasTrabalhadas+"):               "+ salarioBruto+
                                                             "\n (-) IR ("+irPercent+"):                                             "+irDesconto+
                                                             "\n (-) Sindicato (3%):                            "+sindicatoDesconto+  
                                                             "\n (-) FGTS (11%):                                  "+fgtsDesconto+ 
                                                             "\n Total de descontos:                        "+totalDesconto+        
                                                             "\n Salário Líquido:                               "+salarioLiquido                                                         
        ));
    }

}

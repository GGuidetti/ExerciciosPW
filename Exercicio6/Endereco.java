package Exercicio6;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Endereco {
    private Integer Id;
    private Boolean ativo;
    private String cep;
     
    public Endereco() {
    }


    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Boolean isAtivo() {
        return this.ativo;
    }

    public Boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
}

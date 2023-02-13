package Exercicio6;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cliente {
    private Endereco[] enderecos;
    private Integer Id;
    private String nome;
     
    public Cliente() {
    }


    public Endereco[] getEnderecos() {
        return this.enderecos;
    }

    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

}

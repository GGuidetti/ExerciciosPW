package Exercicio6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DataAdministrator {
    //Implemente uma solução para gestão de dados de clientes, que deverá contemplar as seguintes regras:
    // Deverá ter classes para cliente e uma para endereço. Um cliente pode ter vários endereços, como representar? Você definirá os atributos de cada classe.
    // Incluir um campo ID para todas as classes, que deverá ser gerado de forma automática;

    // Implementar métodos para incluir clientes e endereços. Onde devemos colocar esses métodos?
    
    // Adicione o toString na classe cliente para mostrar as informações dos atributos da classe e sua associação;
    // Deverá ter um método para retornar a quantidade de endereços ativos do cliente;
    // Incluir um método para exibir todos os endereços, os ativos e inativos do cliente;
    // Não é necessário interface gráfica. Incluir uma classe principal para executar e testar as classes e métodos criados.

static Integer idCliente = 1;
static Integer idEndereco = 1;
static List<Cliente> clientelista = new ArrayList<Cliente>();
static List<Endereco> enderecolista = new ArrayList<Endereco>();
    
    public static void main(String[] args) {
        Gerenciar();
    }
    public static void Gerenciar() {
        Object[] selectedClass = {"Cliente", "Endereço"};

        int n = JOptionPane.showOptionDialog(null,
            "O que deseja inserir",
            "Choose a colour",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            selectedClass,
            selectedClass[0]);
        
        if (selectedClass[n].equals("Cliente")){
            InserirCliente();
        }
        else{
            InserirEndereco();
        }
    }

    public static void InserirCliente() {
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");         
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setId(idCliente);
        idCliente++;
        clientelista.add(cliente);
        Gerenciar();
    }
    public static void InserirEndereco() {
        String cep = JOptionPane.showInputDialog("Digite o CEP do cliente:"); 
        Endereco endereco = new Endereco();
        endereco.setCep(cep);
        endereco.setId(idEndereco);
        idEndereco++;
        enderecolista.add(endereco);

        Object[] selectedUser = {clientelista};

        int n = JOptionPane.showOptionDialog(null,
            "De qual cliente",
            "Escolha o cliente",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            selectedUser,
            selectedUser[0]);
        
        
        Gerenciar();
    }
     
}
import java.util.Scanner;

public class AgeIdentificator {
    // Crie uma classe e no método principal e solicite uma idade. Em seguida,
    // apresente uma mensagem informando se é criança, adolescente, adulto ou idoso.
    // Defina os intervalos de valores para classificar a idade entre essas
    // categorias. O valor deverá ser solicitado ao usuário utilizando um
    // JoptionPane.showInputDialog. Criar uma classe para a pessoa.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma idade:");

        if (Integer.parseInt(sc.next()) < 1) {
            System.out.println("Idades devem ser no minímo maiores que 0, por favor");
            System.out.print("Digite uma idade:");
        }

        String identificacao = "";
        Integer idade = Integer.parseInt(sc.next());

        if (idade <= 12) {
            identificacao = "Criança";
        } else if (idade <= 18) {
            identificacao = "Adolescente";
        } else if (idade < 60) {
            identificacao = "Adulto";
        } else {
            identificacao = "Idoso";
        }

        System.out.println("A idade que você digitou é referente a de um ser humano " + identificacao);
    }
}
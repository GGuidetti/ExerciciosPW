
1- Crie uma classe e no método principal e solicite uma idade. Em seguida, apresente uma mensagem informando se é criança, adolescente, adulto ou idoso. Defina os intervalos de valores para classificar a idade entre essas categorias. O valor deverá ser solicitado ao usuário utilizando um JoptionPane.showInputDialog. Criar uma classe para a pessoa.

2-Implemente uma classe que deverá, quando executada, solicitar valores separados por vírgula e apresentar esses valores na ordem inversa. A inversão dos valores deverá ser feita em um método separado. Solicitar as informações ao usuário utilizando um JoptionPane.showInputDialog. 

3- Implemente uma classe que deverá, quando executada, solicitar 03 valores separados por vírgula e apresentar esses valores em ordem crescente. A ordenação dos valores deverá ser feita em um método separado, sem utilizar qualquer mecanismo da linguagem de programação.

4- Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês. Crie uma classe que permita criar várias instâncias da folha de pagamento.
Desconto do IR:
- Salário Bruto até 900 (inclusive) - isento
- Salário Bruto até 1500 (inclusive) - desconto de 5%
- Salário Bruto até 2500 (inclusive) - desconto de 10%
- Salário Bruto acima de 2500 - desconto de 20% 
Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
        Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00  
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Líquido                 : R$  935,00

5- Implemente uma classe para Cálculo de IMC. Esta classe deverá, quando executada, solicitar o sexo, o peso e a altura, na sequência realizar o cálculo do IMC, conforme apresentado abaixo. O cálculo deverá ser feito em um método separado. Solicitar as informações ao usuário utilizando um JoptionPane.showInputDialog.
O IMC é obtido a partir da divisão do peso (em Kg) pelo quadrado da altura (em metros). Após calcular o IMC do participante, utilize a tabela a seguir para interpretar e apresentar o resultado ao participante.

6- Implemente uma solução para gestão de dados de clientes, que deverá contemplar as seguintes regras:
Deverá ter classes para cliente e uma para endereço. Um cliente pode ter vários endereços, como representar? Você definirá os atributos de cada classe.
Incluir um campo ID para todas as classes, que deverá ser gerado de forma automática;
Implementar métodos para incluir clientes e endereços. Onde devemos colocar esses métodos?
Adicione o toString na classe cliente para mostrar as informações dos atributos da classe e sua associação;
Deverá ter um método para retornar a quantidade de endereços ativos do cliente;
Incluir um método para exibir todos os endereços, os ativos e inativos do cliente;
Não é necessário interface gráfica. Incluir uma classe principal para executar e testar as classes e métodos criados.

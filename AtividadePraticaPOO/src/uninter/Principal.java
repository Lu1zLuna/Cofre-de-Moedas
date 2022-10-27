//RU do Aluno 3993979

package uninter;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao, tipoMoeda;
        double quantia;
        Moeda coin;

        Cofrinho cofre = new Cofrinho();
        Scanner teclado = new Scanner(System.in);

        //Exibe Menu do Cofrinho e salva
        //a opção digitada pelo usuário
        cofre.Menu();
        opcao = teclado.nextInt();

        while (opcao != 0) {
            switch (opcao) {
                // Caso 1 - Adicionar Moeda
                case 1:
                    tipoMoeda = 0;
                    while (0 >= tipoMoeda || tipoMoeda > 3) {
                        System.out.print("1 - Real\n" +
                                           "2 - Dolar\n" +
                                           "3 - Euro\n" +
                                           "> ");
                        tipoMoeda = teclado.nextInt();
                    }
                    System.out.print("(Utilize vírgula para representar a parte decimal)\n" + 
                                     "Qual quantia deseja adicionar?\n" +
                                     "> ");
                    quantia = teclado.nextDouble();
                    while (quantia < 0.01) {
                        System.out.print("Qual a quantia que deseja adicionar? ");
                        quantia = teclado.nextDouble();
                    }
                    
                    coin = null;
                    //Escolher Real
                    if (tipoMoeda == 1) {
                        coin = new Real(quantia);
                    }
                    //Escolher Dolar
                    else if (tipoMoeda == 2) {
                        coin = new Dolar(quantia);
                    }
                    //Escolher Euro
                    else if (tipoMoeda == 3) {
                        coin = new Euro(quantia);
                    }
                    cofre.adicionar(coin);
                    break;
                //Caso 2 - Remover moeda
                case 2:
                    tipoMoeda = 0;
                    while (0 >= tipoMoeda || tipoMoeda > 3) {
                        System.out.print("1 - Real\n" +
                                        "2 - Dolar\n" +
                                        "3 - Euro\n" +
                                        "> ");
                        tipoMoeda = teclado.nextInt();
                    }
                    quantia = 0.0;
                    while (quantia < 1) {
                        System.out.print("Qual a quantia que deseja remover? ");
                        quantia = teclado.nextDouble();
                        if (quantia > 0) {
                            break;
                        }
                    }
                    coin = null;
                    //Escolher Real
                    if (tipoMoeda == 1) {
                        coin = new Real(quantia);
                    }
                    //Escolher Dolar
                    else if (tipoMoeda == 2) {
                        coin = new Dolar(quantia);
                    }
                    //Escolher Euro
                    else if (tipoMoeda == 3) {
                        coin = new Euro(quantia);
                    }
                    cofre.remover(coin);
                    break;
                //Listar moedas no cofrinho
                case 3:
                    cofre.listar();
                    break;
                //converte todas as moedas para real
                case 4:
                    System.out.print("Total da conversão: " + String.format("%.2f", cofre.ConverterTotal()));
            }
            cofre.Menu();
            opcao = teclado.nextInt();
        }
        //fecha o scanner
        teclado.close();
        String s1 = new String("Ola"); 
        String s2 = new String("Ola");
        String s3 = s1;
        System.out.println(s1 == s2);//PRIMEIRA COMPARAÇÃO
        System.out.println(s1.equals(s2)); //SEGUNDA COMPARAÇÃO
    }
}

package uninter;

import java.util.ArrayList;

public class Cofrinho {

    ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    //adiciona uma moeda ao cofrinho
    public void adicionar(Moeda m) {
        listaMoedas.add(m);
        
    }

    //remove uma moeda do cofrinho
    public void remover(Moeda m) {
        listaMoedas.remove(m); //isso dá problema, consultar depois.
    }

    //passa por todas moedas salvas no ArrayList, apresentando suas respectivas quantidades.
    public void listar() {
        for (Moeda m : listaMoedas) {
            System.out.println(m.info());
        }
    }

    //menu de seleção inicial do programa
    public void Menu() {
        System.out.print("\n--- MENU ---" +
                           "\n" +
                           "Digite o número correspondente a uma das seguintes opções:\n" +
                           "1 - Adicionar\n" +
                           "2 - Remover\n" +
                           "3 - Listar\n" +
                           "4 - Calcular total convertido para Real\n" +
                           "0 - Encerrar\n" +
                           "> ");
    }
    
    //Método para converter todas as moedas para real
    public double ConverterTotal() {
        //variável que armazena o total da conversão
        double totalConvertido = 0;
        //loop que passa por todas as moedas na lista de moedas
        for (Moeda m : listaMoedas) {
            totalConvertido += m.converter();
        }
        return totalConvertido;
    }
}

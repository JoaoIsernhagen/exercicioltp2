package aplication;

import entities.Produc;
import services.Util;
import services.Veiculos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(Util.RetornaCabecalho("EXPENSE SIMULATOR!"));
        System.out.println(Util.LinhaVazia());

        System.out.printf("| Informe seu Nome: ");
        String nome = sc.nextLine();

        char ehFinalizar;

        do {

            Veiculos.EscolheVeiculos(sc);

            sc = new Scanner(System.in);

            System.out.printf("| Deseja iniciar outra simulação (S - Sim | N - Nâo): ");
            ehFinalizar = sc.nextLine().toUpperCase().charAt(0);

            System.out.println(Util.LinhaVazia());
            System.out.println(Util.Linha());
            if(ehFinalizar == 'S') System.out.println(Util.LinhaVazia());

        } while (ehFinalizar == 'S');

        sc.close();

    }
}




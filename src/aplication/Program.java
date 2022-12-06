package aplication;

import entities.Produc;

import services.Veiculos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produc produc = new Produc();

        System.out.println("Seu Nome:");
        produc.name = sc.nextLine();

        char ehFinalizar;

        do {
            Veiculos.EscolheVeiculos(sc);

            sc = new Scanner(System.in);

            System.out.printf("%n%n");
            System.out.printf("Deseja iniciar outra simulaçã0: (S - Sim | N - Nâo) %n");
            ehFinalizar = sc.nextLine().toUpperCase().charAt(0);

        } while (ehFinalizar == 'S');

        sc.close();
           

            // System.out.println("---------------------------------------:");
            // System.out.println("            Informações:");
            // System.out.println("---------------------------------------:");
            // System.out.println("Aluno: " + produc.name);
            // System.out.println("Meio de Transporte: " + escolhaVeiculos.MeioTransporte);
            // System.out.printf("Valor do gasto diario com Combustivel %.2f%n", produc.gastoCombutivelDia());
            // System.out.printf("Valor do gasto semestral com Combustivel %.2f%n", produc.gastoSemestral());


    }
}




package aplication;

import entiitens.Produc;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produc produc = new Produc();

        System.out.println("");
        System.out.println("");
        System.out.println("---------------------------------------:");
        System.out.println("Calcular gasto semestral com transporte");
        System.out.println("---------------------------------------:");
        System.out.println("");


        System.out.println("Seu Nome: ");
        produc.name = sc.nextLine();

        boolean transporteValido = true;

        do {

            System.out.printf("Escolha o veiculo(C - Carro | M - Moto | O - Onibus %n");
            char veiculo = sc.nextLine().toUpperCase().charAt(0);

            produc.SelecionarMeioTransporte(veiculo);

            if (produc.MeioTransporte == "") {
                System.out.println("Meio de Transporte invalido:");
            } else {
                transporteValido = false;
            }

        } while (transporteValido);



        boolean combustiveValido = true;


        do {

            System.out.println("Qual combustivel so seu " + produc.MeioTransporte + ":");
            System.out.println("G - Gasolina | A - Alcool");
            char combustivel = sc.nextLine().toUpperCase().charAt(0);

            produc.selecionarCombustivel(combustivel);

            if (produc.combustivel == "") {
                System.out.println("Combustivel invalido");
            } else {
                combustiveValido = false;
            }


        } while (combustiveValido);


        if (produc.combustivel == "G") {
            System.out.println("Preco Atual da" + produc.combustivel);
            produc.gasolina = sc.nextDouble();
            produc.valorcombustivel = produc.gasolina;
        } else {
            System.out.println("Preco atual do " + produc.combustivel);
            produc.alcool = sc.nextDouble();
            produc.valorcombustivel = produc.alcool;
        }

        System.out.println("Media quilometros por litros?");
        produc.media = sc.nextDouble();


        System.out.println("Distancia entre origem e destino?");
        produc.distancia = sc.nextDouble();



        System.out.println("");
        System.out.println("");
        System.out.println("---------------------------------------:");
        System.out.println("            Informações:");
        System.out.println("---------------------------------------:");
        System.out.println("");
        System.out.println("Aluno: " + produc.name);
        System.out.println("Meio de Transporte: " + produc.MeioTransporte);
        System.out.printf("Valor do gasto diario com Combustivel %.2f%n", produc.gastoCombutivelDia());
        System.out.printf("Valor do gasto semestral com Combustivel %.2f%n", produc.gastoSemestral());


    }
}

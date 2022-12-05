package aplication;

import entities.EscolhaVeiculos;
import entities.Produc;

import services.Veiculos;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produc produc = new Produc();
        EscolhaVeiculos escolhaVeiculos = new EscolhaVeiculos();

        System.out.println("Seu Nome:");
        produc.name = sc.nextLine();

        String opcao2 = null;

        do {

            char veiculo = Veiculos.EscolheVeiculos();


            if (veiculo == 'O') {

                System.out.println("Valor da Parcela Mensal?");
                produc.parcelaOnibus = sc.nextDouble();
                System.out.println("Gasto semestral com onibus e " + produc.valorOnibus());
            }

            if (veiculo == 'O') {
                System.out.println("Dejesa escolher outro veiculo? S para sem | N para nao");
                 opcao2 = sc.nextLine();
                
            }
        } while ( opcao2 == "S");


            boolean combustiveValido = true;

            do {

                sc.nextLine();
                System.out.println("Qual combustivel so seu " + escolhaVeiculos.MeioTransporte + ":");
                System.out.println("G - Gasolina | A - Alcool");
                char combustivel = sc.nextLine().toUpperCase().charAt(0);

                produc.selecionarCombustivel(combustivel);

                if (Objects.equals(produc.combustivel, "")) {
                    System.out.println("Combustivel invalido");
                } else {
                    combustiveValido = false;
                }


            } while (combustiveValido);


            if (Objects.equals(produc.combustivel, "G")) {
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


            System.out.println("---------------------------------------:");
            System.out.println("            Informações:");
            System.out.println("---------------------------------------:");
            System.out.println("Aluno: " + produc.name);
            System.out.println("Meio de Transporte: " + escolhaVeiculos.MeioTransporte);
            System.out.printf("Valor do gasto diario com Combustivel %.2f%n", produc.gastoCombutivelDia());
            System.out.printf("Valor do gasto semestral com Combustivel %.2f%n", produc.gastoSemestral());


        }
    }




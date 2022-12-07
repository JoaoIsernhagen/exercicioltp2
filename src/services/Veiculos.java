package services;


import java.util.Scanner;

public final class Veiculos {

    public static final int MESESLETIVOS = 12;
    public static final int DIASLETIVOS = 100;

    double gasolina;

    public static void EscolheVeiculos(Scanner sc)
    {
        boolean ehValido = false;
        char veiculo;

        do {
            System.out.printf("Escolha o veiculo:(C - Carro | M - Moto | O - Onibus) %n");
            veiculo = sc.nextLine().toUpperCase().charAt(0);

            if (ValidarVeiculoSelecionado(veiculo)) {
                ehValido = true;
            } else {
                System.out.println("Meio de Transporte invalido:");
            }
        } while (!ehValido);

        if(veiculo == 'C') CalculaValoresCarro(sc);
        if(veiculo == 'M') CalculaValoresMoto(sc);
        if(veiculo == 'O') CalculaValoresOnibus(sc);   
    }

    private static boolean ValidarVeiculoSelecionado(char veiculo)
    {
        if(veiculo == 'C' || veiculo == 'M' || veiculo == 'O' )
        {
            return true;
        }
        else{
            return false;
        }
    }

    private static void CalculaValoresOnibus(Scanner sc)
    {
        double vlrPassagem = 0;

        do
        {
            System.out.println("Digite o valor da mensalidade?");
            vlrPassagem = sc.nextDouble();

            if(vlrPassagem > 0)
            {
                double valor = vlrPassagem * MESESLETIVOS;
                System.out.println("Valor gasto em passagens será de: " + valor);
            }
            else
            {
                System.out.println("Valor da passagem deve ser maior que 0!");
            }

        } while(vlrPassagem <=0);
    }

    private static void CalculaValoresCarro(Scanner sc)
    {
        int teste = 0;
        char combustivel;
        double gasolina;
        double alcool;
        double media;
        double destino;


        do {
            System.out.println("Selecione o combusteivel do seu veiculo: (G para Gasolina | A para Alcool)");
            combustivel = sc.nextLine().toUpperCase().charAt(0);

            if (combustivel == 'G') {

                System.out.println("Preço da gasolina?");
                gasolina = sc.nextDouble();
                teste++;

                do {
                    System.out.println("Quantos quilometros por litro de combustivel faz o veiculo?");
                    media = sc.nextDouble();
                    if (media > 0) {

                    } else {
                        System.out.println("Valor Invalido");
                    }
                } while (media <= 0);

                do {

                    System.out.println("Quilometros ate o destino?");
                    destino = sc.nextDouble();

                    if (destino > 0) {

                    } else {
                        System.out.println("Valor Invalido");
                    }

                } while (destino <= 0);

               double total = ((destino * 2) / media) * gasolina;
                System.out.println(total);


            } else if (combustivel == 'A') {
                System.out.println("Preço do alcool?");
                alcool = sc.nextDouble();
                teste++;

                do {
                    System.out.println("Quantos quilometros por litro de combustivel faz o veiculo?");
                    media = sc.nextDouble();

                    if (media > 0) {
                        media = media;
                    } else {
                        System.out.println("Valor Invalido");
                    }
                } while (media <= 0);

                do {

                    System.out.println("Quilometros ate o destino?");
                    destino = sc.nextDouble();

                    if (destino > 0) {

                    } else {
                        System.out.println("Valor Invalido");
                    }

                } while (destino <= 0);

                double total = ((destino * 2) / media) * alcool;
                System.out.println(total);

            } else {
                System.out.println("Combustivel invalido:");
            }
        } while (teste != 1);

    }

    private static void CalculaValoresMoto(Scanner sc)
    {

    }
}

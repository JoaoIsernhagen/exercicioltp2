package services;

import java.util.Scanner;

public final class Veiculos {

    public static final int MESESLETIVOS = 12;

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

    }

    private static void CalculaValoresMoto(Scanner sc)
    {

    }
}

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
            System.out.printf("| Escolha o veiculo(C - Carro | M - Moto | O - Onibus): ");
            veiculo = sc.nextLine().toUpperCase().charAt(0);

            if (ValidarVeiculoSelecionado(veiculo)) {
                ehValido = true;
            } else {
                System.out.println(Util.LinhaTexto("Erro : Meio de Transporte inválido!"));
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

    private static boolean ValidarCombustivel(char combustivel)
    {
        if(combustivel == 'G' || combustivel == 'A' )
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
            System.out.printf("| Informe o valor da mensalidade: ");
            vlrPassagem = sc.nextDouble();

            System.out.println(Util.LinhaVazia());
            System.out.println(Util.Linha());
            System.out.println(Util.LinhaVazia());

            if(vlrPassagem > 0)
            {
                System.out.println(Util.LinhaTexto("Veiculo selecionado: Onibus"));
                Util.LinhaVazia();
                System.out.println(Util.LinhaTexto("Valor gasto em passagens em Janeiro/2023 será de: " + (vlrPassagem/ObterDiasUteis(1)) + "/dia."));
                System.out.println(Util.LinhaTexto("Valor gasto em passagens em Fevereiro/2023 será de: " + (vlrPassagem/ObterDiasUteis(2)) + "/dia."));
                System.out.println(Util.LinhaTexto("Valor gasto em passagens em Março/2023 será de: " + (vlrPassagem/ObterDiasUteis(3)) + "/dia."));
                System.out.println(Util.LinhaTexto("Valor gasto em passagens em Abril/2023 será de: " + (vlrPassagem/ObterDiasUteis(4)) + "/dia."));
                System.out.println(Util.LinhaTexto("Valor gasto em passagens em Maio/2023 será de: " + (vlrPassagem/ObterDiasUteis(5)) + "/dia."));
                System.out.println(Util.LinhaTexto("Valor gasto em passagens em Junho/2023 será de: " + (vlrPassagem/ObterDiasUteis(6)) + "/dia."));
                System.out.println(Util.LinhaTexto("Valor gasto em passagens em Julho/2023 será de: " + (vlrPassagem/ObterDiasUteis(7)) + "/dia."));
                System.out.println(Util.LinhaTexto("Valor gasto em passagens em Agosto/2023 será de: " + (vlrPassagem/ObterDiasUteis(8)) + "/dia."));
                System.out.println(Util.LinhaTexto("Valor gasto em passagens em Setembro/2023 será de: " + (vlrPassagem/ObterDiasUteis(9)) + "/dia."));
                System.out.println(Util.LinhaTexto("Valor gasto em passagens em Outubro/2023 será de: " + (vlrPassagem/ObterDiasUteis(10)) + "/dia."));
                System.out.println(Util.LinhaTexto("Valor gasto em passagens em Novembro/2023 será de: " + (vlrPassagem/ObterDiasUteis(11)) + "/dia."));
                System.out.println(Util.LinhaTexto("Valor gasto em passagens em Dezembro/2023 será de: " + (vlrPassagem/ObterDiasUteis(12)) + "/dia."));
            }
            else
            {
                System.out.println(Util.LinhaTexto("Valor da passagem deve ser maior que 0!"));
            }

        } while(vlrPassagem <=0);

        System.out.println(Util.LinhaVazia());
        System.out.println(Util.Linha());
        System.out.println(Util.LinhaVazia());

    }

    private static void CalculaValoresCarro(Scanner sc)
    {
        char combustivel = EscolheCombustivel(sc);
        double autonomia = EscolheAutonomia(sc);
        double distancia = EscolheDistancia(sc);

        System.out.println(Util.LinhaVazia());
        System.out.println(Util.Linha());
        System.out.println(Util.LinhaVazia());

        double distanciaPorDia = distancia * 2;
        double litrosPorDia = distanciaPorDia / autonomia;
        double custoPorDia = litrosPorDia * (combustivel == 'G' ? 5 : 4);

        System.out.println(Util.LinhaTexto("Veiculo selecionado: Carro"));
        System.out.println(Util.LinhaTexto("Trajeto diário: " + distanciaPorDia + " KM"));
        Util.LinhaVazia();
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Janeiro/2023 será de: " + (custoPorDia * ObterDiasUteis(1))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Fevereiro/2023 será de: " + (custoPorDia * ObterDiasUteis(2))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Março/2023 será de: " + (custoPorDia * ObterDiasUteis(3))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Abril/2023 será de: " + (custoPorDia * ObterDiasUteis(4))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Maio/2023 será de: " + (custoPorDia * ObterDiasUteis(5))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Junho/2023 será de: " + (custoPorDia * ObterDiasUteis(6))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Julho/2023 será de: " + (custoPorDia * ObterDiasUteis(7))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Agosto/2023 será de: " + (custoPorDia * ObterDiasUteis(8))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Setembro/2023 será de: " + (custoPorDia * ObterDiasUteis(9))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Outubro/2023 será de: " + (custoPorDia * ObterDiasUteis(10))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Novembro/2023 será de: " + (custoPorDia * ObterDiasUteis(11))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Dezembro/2023 será de: " + (custoPorDia * ObterDiasUteis(12))));

        System.out.println(Util.LinhaVazia());
        System.out.println(Util.Linha());
        System.out.println(Util.LinhaVazia());
    }

    private static void CalculaValoresMoto(Scanner sc)
    {
        char combustivel = EscolheCombustivel(sc);
        double autonomia = EscolheAutonomia(sc);
        double distancia = EscolheDistancia(sc);

        System.out.println(Util.LinhaVazia());
        System.out.println(Util.Linha());
        System.out.println(Util.LinhaVazia());

        double distanciaPorDia = distancia * 2;
        double litrosPorDia = distanciaPorDia / autonomia;
        double custoPorDia = litrosPorDia * (combustivel == 'G' ? 5 : 4);

        System.out.println(Util.LinhaTexto("Veiculo selecionado: Moto"));
        System.out.println(Util.LinhaTexto("Trajeto diário: " + distanciaPorDia + " KM"));
        Util.LinhaVazia();
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Janeiro/2023 será de: " + (custoPorDia * ObterDiasUteis(1))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Fevereiro/2023 será de: " + (custoPorDia * ObterDiasUteis(2))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Março/2023 será de: " + (custoPorDia * ObterDiasUteis(3))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Abril/2023 será de: " + (custoPorDia * ObterDiasUteis(4))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Maio/2023 será de: " + (custoPorDia * ObterDiasUteis(5))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Junho/2023 será de: " + (custoPorDia * ObterDiasUteis(6))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Julho/2023 será de: " + (custoPorDia * ObterDiasUteis(7))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Agosto/2023 será de: " + (custoPorDia * ObterDiasUteis(8))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Setembro/2023 será de: " + (custoPorDia * ObterDiasUteis(9))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Outubro/2023 será de: " + (custoPorDia * ObterDiasUteis(10))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Novembro/2023 será de: " + (custoPorDia * ObterDiasUteis(11))));
        System.out.println(Util.LinhaTexto("Valor gasto em combustivel em Dezembro/2023 será de: " + (custoPorDia * ObterDiasUteis(12))));


        System.out.println(Util.LinhaVazia());
        System.out.println(Util.Linha());
        System.out.println(Util.LinhaVazia());
    }

    private static char EscolheCombustivel(Scanner sc)
    {
        Boolean combustivelValido = false;
        char combustivel;

        do {
            System.out.printf("| Informe o combustivel do seu veiculo (G para Gasolina | A para Alcool): ");
            combustivel = sc.nextLine().toUpperCase().charAt(0);

            if (ValidarCombustivel(combustivel)) {
                combustivelValido = true;
            } else {
                System.out.println(Util.LinhaTexto("Erro : Combustivel inválido!"));
            }
        } while (!combustivelValido);

        return combustivel;
    }

    private static double EscolheAutonomia(Scanner sc)
    {
        Boolean autonomiaValido = false;
        double autonomia;

        do {
            System.out.printf("| Informe a autonomia do seu veiculo (KM/L): ");
            autonomia = sc.nextDouble();

            if (autonomia > 0) {
                autonomiaValido = true;
            } else {
                System.out.println(Util.LinhaTexto("Erro : Autonomia inválida!"));
            }
        } while (!autonomiaValido);

        return autonomia;
    }

    private static double EscolheDistancia(Scanner sc)
    {
        Boolean distanciaValido = false;
        double distancia;

        do {
            System.out.printf("| Informe a distancia do percurso (KM): ");
            distancia = sc.nextDouble();

            if (distancia > 0) {
                distanciaValido = true;
            } else {
                System.out.println(Util.LinhaTexto("Erro : Distância inválida!"));
            }
        } while (!distanciaValido);

        return distancia;
    }

    private static int ObterDiasUteis(int mes){
        DiasLetivos dia = new DiasLetivos();

        return dia.DiasLetivosPorMes(mes);
    }
}

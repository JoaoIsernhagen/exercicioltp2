package services;

public final class Util {
    
    public static final int TotalDeColunas = 100;

    public static String RetornaCabecalho(String titulo){

        String cabecalho = "";

        cabecalho += Linha();
        cabecalho += "\n";
        cabecalho += "|";

        int bordaTitulo = TotalDeColunas - titulo.length() - 2;

        cabecalho += Espacamento((bordaTitulo/2), " ");
        cabecalho += titulo;
        cabecalho += Espacamento((bordaTitulo/2), " ");

        if(bordaTitulo % 2 > 0){
            cabecalho += " ";
        }

        cabecalho += "|";
        cabecalho += "\n";
        cabecalho += Linha();

        return cabecalho;
    }

    private static String Espacamento(int quantidade, String caractere)
    {
        return String.format("%-" + quantidade + "s", caractere);
    }

    public static String Linha()
    {
        return "-".repeat(TotalDeColunas);
    }

    public static String LinhaVazia(){
        return "|" + " ".repeat(TotalDeColunas -2) + "|";
    }

    public static String LinhaTexto(String texto){
        String linha = "| " + texto;

        if(linha.length() + 2 <= TotalDeColunas){
            var bordaDireita = TotalDeColunas - linha.length();

            linha += " ".repeat(bordaDireita - 1) + "|";
        }

        return linha;
    }

}

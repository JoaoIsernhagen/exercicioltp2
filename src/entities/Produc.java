package entiitens;


public class Produc {

    public String name;
    public double gasolina;
    public double alcool;
    public double parcelaOnibus;
    public double valorcombustivel;
    public double distancia;
    public double media;
    public String combustivel;

    public String opcao;
    public final int diasLetivos = 100;

    public void selecionarCombustivel(char combustivel) {

        if (combustivel == 'G') {
            this.combustivel = "Gasolina";

        } else if (combustivel == 'A') {
            this.combustivel = "Alcool";

        } else {
            this.combustivel = "";

        }

    }


    public double gastoCombutivelDia() {
        return ((distancia * 2) / media) * valorcombustivel;
    }

    public double gastoSemestral() {
        return gastoCombutivelDia() * diasLetivos;
    }

        public double valorOnibus() {

        return parcelaOnibus * 5;

        }

}



package entiitens;

public class EscolhaVeiculos {

    public String MeioTransporte;
    public String opcao;


    public void SelecionarMeioTransporte(char transporte) {
        if (transporte == 'C') {
            this.MeioTransporte = "Carro";
            opcao = "S";

        } else if (transporte == 'M') {
            this.MeioTransporte = "Moto";
            opcao = "S";

        } else if (transporte == 'O') {
            this.MeioTransporte = "Onibus";

        } else this.MeioTransporte = "";

    }
}

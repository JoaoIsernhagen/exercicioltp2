package entiitens;


public class Produc {

    public String name;
    public double gasolina;
    public double alcool;
    public double valorcombustivel;

    public double distancia;
    public double media;

    public String MeioTransporte;

    public String combustivel;

    public final int diasLetivos = 100;


    public void SelecionarMeioTransporte(char transporte)
    {
        if(transporte == 'C')
        {
            this.MeioTransporte = "Carro";
            return;
        } else if (transporte == 'M')
        {
            this.MeioTransporte = "Moto";
            return;
        }else if(transporte == 'O')
        {
            this.MeioTransporte = "Onibus";
            return;
        }else this.MeioTransporte = "";
        return;
    }

    public void selecionarCombustivel(char combustivel) {

        if (combustivel == 'G') {
           this.combustivel = "Gasolina";
           return;
        } else if (combustivel == 'A') {
          this.combustivel = "Alcool";
          return;
        } else {
            this.combustivel = "";
            return;
        }

        }


    public double gastoCombutivelDia() {
        return ((distancia * 2) / media) * valorcombustivel;
    }

    public double gastoSemestral() {
        return gastoCombutivelDia() * diasLetivos;
        }
    }



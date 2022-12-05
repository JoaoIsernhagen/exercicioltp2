package services;


public static class Veiculos {

    public static char EscolheVeiculos()
    {
        boolean ehValido = false;
        char veiculo = '';

        do {
            System.out.printf("Escolha o veiculo(C - Carro | M - Moto | O - Onibus %n");
            veiculo = sc.nextLine().toUpperCase().charAt(0);

            if (ValidarVeiculoSelecionado(veiculo)) {
                ehValido = true;
            } else {
                System.out.println("Meio de Transporte invalido:");
            }
        } while (!ehValido);

        return veiculo;
    }

    private boolean ValidarVeiculoSelecionado(char veiculo)
    {
        if(veiculo == 'C' || veiculo == 'M' || veiculo == 'O' )
        {
            return true;
        }
        else{
            return false;
        }
    }

}

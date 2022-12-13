package services;

import java.util.Calendar;

public class DiasLetivos {
    
    Calendar cal;

    public DiasLetivos(){
        cal = Calendar.getInstance();
    }

    public int DiasLetivosPorMes(int mes){

        cal.set(Calendar.YEAR, 2023);        
        cal.set(Calendar.MONTH, mes -1);

        //Ultimo dia do mês
        var ultimoDiaMes = cal.getActualMaximum(Calendar.DATE);

        return ContadorDias(ultimoDiaMes);
    }

    private int ContadorDias(int dia){
        int resultado = 0;

        if(dia == 0)
            return resultado;

        cal.set(Calendar.DAY_OF_MONTH, dia);

        if(dia >= 1 ) {
            //Obter o dia da semana
            int diaDaSemana = cal.get(Calendar.DAY_OF_WEEK);

            //Se diferente de sabado e domingo
            if(diaDaSemana != 1 && diaDaSemana != 7){
                resultado = 1;
            }            
        }
        
        return (resultado + ContadorDias(dia -1));
    }
    
}

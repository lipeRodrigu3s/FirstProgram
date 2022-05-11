package br.com.dio;

public class Emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas(){

        return 3;
    }

    public static int getQuatroParcelas(){

        return 4;
    }

    public static int getCincoParcelas(){

        return 5;
    }

    public static int getSeisParcelas(){

        return 6;
    }

    public static double getTaxasDasParcelas(){
        return 0.8;
    }


    public static void calcular(double valor, int parcelas){
        if (parcelas == 2){

            double valorFinal = valor + (valor + getTaxasDasParcelas());

            System.out.println("Se parcelar em 2x fica: " + valorFinal);

        } else if (parcelas == 3){

            double valorFinal = valor + (valor + getTaxasDasParcelas());

            System.out.println("Se parcelar em 3x fica: " + valorFinal);

        } else if (parcelas == 4) {

            double valorFinal = valor + (valor + getTaxasDasParcelas());

            System.out.println("Se parcelar em 4x fica: " + valorFinal);

        } else if (parcelas == 5) {

            double valorFinal = valor + (valor + getTaxasDasParcelas());

            System.out.println("Se parcelar em 5x fica: " + valorFinal);

        } else if (parcelas == 6) {

            double valorFinal = valor + (valor + getTaxasDasParcelas());

            System.out.println("Se parcelar em 6x fica: " + valorFinal);

        }

        else{
            System.out.println("Esse numero de parcelas não é valido");
        }

    }

}

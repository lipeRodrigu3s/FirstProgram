package br.com.dio;

public class Calcular {
    public static void soma(double valor1, double valor2){
        double resultado = valor1 + valor2;
        System.out.println("A soma entre os valores é: " + resultado);
    }

    public static void dividir(double valor1, double valor2){
        double resultado = valor1 / valor2;
        System.out.println("A divisão dos valores é: " + resultado);
    }

    public static void multiplicar(double valor1, double valor2){
        double resultado = valor1 * valor2;
        System.out.println("A multiplicação dos valores é: " + resultado);
    }

    public static void subtrair(double valor1, double valor2){
        double resultado = valor1 - valor2;
        System.out.println("A subitração dos valores é: " + resultado);
    }
}

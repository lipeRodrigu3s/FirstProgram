package br.com.dio;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        System.out.println("Calcular");
        Calcular.soma(3,6);
        Calcular.dividir(9,8);
        Calcular.multiplicar(9,3);
        Calcular.subtrair(4,8);

        System.out.println("Tenha um(a)");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(18);
        Mensagem.obterMensagem(21);

        System.out.println("Tabela de emprestimos");

        Emprestimo.calcular(5000,4);
        Emprestimo.calcular(80000,5);
        }


}

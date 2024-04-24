package br.edu.up;
import br.edu.up.listaClasses.Loja;

public class Ex05 {
    public static void executar(){

        Loja loja1 = new Loja();

        loja1.setValorCompra(Prompt.lerDecimal("Informe o valor da compra: "));

        Double valorPrestacao = loja1.prestacoes();
        Prompt.imprimir("O valor da prestação é: " + valorPrestacao);
    }
}

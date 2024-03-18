import utilidades.*;

public class Ex05 {
    public static void executar(){
        /*5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. 
        Faça um programa que receba um valor de uma compra e mostre o valor das prestações. */

        LojaMamao loja1 = new LojaMamao();

        loja1.valorCompra = Prompt.lerDecimal("Informe o valor da compra: ");

        Double valorPrestacao = loja1.prestacoes(loja1.valorCompra);
        Prompt.imprimir("O valor da prestação é: " + valorPrestacao);
    }
}

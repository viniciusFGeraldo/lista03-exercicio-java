package br.edu.up;
import br.edu.up.listaClasses.Loja;

public class Ex06 {
    public static void executar(){

         Loja produto1 = new Loja();

         produto1.setPrecoCusto(Prompt.lerDecimal("Informe o valor do custo do produto: "));
         produto1.setAcrescimo(Prompt.lerDecimal("Informe o percentual de acréscimo sobre o produto: "));

         Double valorVenda = produto1.valorVenda();
         Prompt.imprimir("Valor de venda: " + valorVenda);
    }
}

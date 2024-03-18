import utilidades.Produto;
import utilidades.Prompt;

public class Ex06 {
    public static void executar(){
        /*6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda.
         Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.*/

         Produto produto1 = new Produto();

         produto1.precoCusto = Prompt.lerDecimal("Informe o valor do custo do produto: ");
         produto1.acrescimo = Prompt.lerDecimal("Informe o percentual de acréscimo sobre o produto: ");

         Double valorVenda = produto1.valorVenda(produto1.precoCusto, produto1.acrescimo);
         Prompt.imprimir("Valor de venda: " + valorVenda);
    }
}

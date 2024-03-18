import utilidades.Produto;
import utilidades.Prompt;

public class Ex14 {
    public static void executar(){
        /*14. Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. Mostre 
        como resultado se houve lucro, prejuízo ou empate para cada produto. Informe média de preço de 
        custo e do preço de venda.*/

        Produto produto = new Produto();
        Double mediaPrecoCusto = 0.0;
        Double mediaPrecoVenda = 0.0;

        for(int i = 0;i < 40;i++){
            produto.precoCusto = Prompt.lerDecimal("Informe o preço de custo do " + (i + 1) + "° produto: ");
            produto.precoVenda = Prompt.lerDecimal("Informe o preço de venda do " + (i + 1) + "° produto: ");

            mediaPrecoCusto += produto.precoCusto;
            mediaPrecoVenda += produto.precoVenda;

            produto.rendimentoProduto(produto.precoCusto, produto.precoVenda);
        }

        Prompt.imprimir("Média de custo: " + mediaPrecoCusto / 40);
        Prompt.imprimir("Média de Venda: " + mediaPrecoVenda / 40);
    }
}

package br.edu.up;
import br.edu.up.listaClasses.Loja;

public class Ex14 {
    public static void executar(){

        Loja produto = new Loja();
        Double mediaPrecoCusto = 0.0;
        Double mediaPrecoVenda = 0.0;

        for(int i = 0;i < 40;i++){
            produto.setPrecoCusto(Prompt.lerDecimal("Informe o preço de custo do " + (i + 1) + "° produto: "));
            produto.setPrecoVenda(Prompt.lerDecimal("Informe o preço de venda do " + (i + 1) + "° produto: "));

            mediaPrecoCusto += produto.getPrecoCusto();
            mediaPrecoVenda += produto.getPrecoVenda();

            produto.rendimentoProduto();
        }

        Prompt.imprimir("Média de custo: " + mediaPrecoCusto / 40);
        Prompt.imprimir("Média de Venda: " + mediaPrecoVenda / 40);
    }
}

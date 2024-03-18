package utilidades;

public class Produto {
    /*6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda.
    Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.*/

    public Double precoCusto;
    public Double precoVenda;
    public Double acrescimo;
    

    public Double valorVenda(Double precoCusto, Double acrescimo){
        return (precoCusto * (acrescimo / 100)) + precoCusto;
    } 

    public void rendimentoProduto(Double precoCusto, Double precoVenda){
        if(precoCusto < precoVenda){
            Prompt.separador();
            Prompt.imprimir("Esse produto rendeu lucro.");
            Prompt.separador();
        }else if(precoCusto > precoVenda){
            Prompt.separador();
            Prompt.imprimir("Esse produto deu prejuizo.");
            Prompt.separador();
        }else{
            Prompt.separador();
            Prompt.imprimir("Esse produto deu empate");
            Prompt.separador();
        }
    }
}

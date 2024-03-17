public class Produto {
    /*6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda.
    Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.*/

    Double precoCusto;
    Double acrescimo;

    public Double valorVenda(Double precoCusto, Double acrescimo){
        return (precoCusto * (acrescimo / 100)) + precoCusto;
    } 
}

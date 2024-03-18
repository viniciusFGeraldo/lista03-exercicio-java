package utilidades;

public class LojaMamao {
    /*5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. 
    Faça um programa que receba um valor de uma compra e mostre o valor das prestações. */
    
    public Double valorCompra;

    public Double prestacoes(Double valorCompra){
        return valorCompra / 5;
    }
}

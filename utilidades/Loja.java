package utilidades;

public class Loja {
    /*3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
        efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre 
        suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês. */

    public String nome;
    public Double salarioFixo;
    public Double vendas;

    public Double comissao(Double vendas){
        return vendas * 0.15;
    }

    public Double salarioLiquido(Double salarioFixo, Double comissao){
        return salarioFixo + comissao;
    }
}

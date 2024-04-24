package br.edu.up.listaClasses;
import br.edu.up.*;

public class Loja {
    private String nome;
    private Double salarioFixo;
    private Double vendas;
    private Double valorCompra;
    private Double precoCusto;
    private Double precoVenda;
    private Double acrescimo;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalarioFixo(Double salarioFixo){
        this.salarioFixo = salarioFixo;
    }

    public void setVendas(Double vendas){
        this.vendas = vendas;
    }

    public String getNome(){
        return this.nome;
    }

    public Double comissao(){
        return vendas * 0.15;
    }

    public Double salarioLiquido(Double comissao){
        return salarioFixo + comissao;
    }
    // -------------------------------------------------------

    public void setValorCompra(Double valorCompra){
        this.valorCompra = valorCompra;
    }

    public Double prestacoes(){
        return valorCompra / 5;
    }
    // -------------------------------------------------------

    public void setPrecoCusto(Double precoCusto){
        this.precoCusto = precoCusto;
    }

    public void setPrecoVenda(Double precoVenda){
        this.precoVenda = precoVenda;
    }

    public void setAcrescimo(Double acrescimo){
        this.acrescimo = acrescimo;
    }

    public Double valorVenda(){
        return (precoCusto * (acrescimo / 100)) + precoCusto;
    } 

    public void rendimentoProduto(){
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

    public Double getPrecoCusto(){
        return precoCusto;
    }

    public Double getPrecoVenda(){
        return precoVenda;
    }
}

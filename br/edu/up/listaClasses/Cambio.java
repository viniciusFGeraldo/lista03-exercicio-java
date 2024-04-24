package br.edu.up.listaClasses;

public class Cambio {
    private Double cotacaoDolar;
    private Double qtdDolar;

    public void setCotacaoDolar(Double cotacaoDolar){
        this.cotacaoDolar = cotacaoDolar;
    }

    public void setQtdDolar(Double qtdDolar){
        this.qtdDolar = qtdDolar;
    }

    public Double conversaoParaReais(){
        return qtdDolar * cotacaoDolar;
    }
}

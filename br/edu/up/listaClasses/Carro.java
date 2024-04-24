package br.edu.up.listaClasses;

public class Carro {

    private Double distanciaPercorrida;
    private Double combustivelGasto;
    private Double custoFabrica;
    private Double imposto = 0.45;
    private Double distribuidor = 0.28;

    private Double valorCarro;
    private Integer anoCarro;
    private Double desconto = 0.0;
    private Integer qtdAte2000 = 0;
    private Integer qtdCarros = 0;

    private Character tipoCombustivel;

    public void setDistanciaPercorrida(Double distanciaPercorrida){
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public void setCombustivelGasto(Double combustivelGasto){
        this.combustivelGasto = combustivelGasto;
    }

    public Double consumoMedio(){
        Double consumoMedio = distanciaPercorrida / combustivelGasto;
        return consumoMedio;
    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void setCustoFabrica(Double custoFabrica){
        this.custoFabrica = custoFabrica;
    }

    public Double custoConsumidor(){
        Double valorComImposto = (custoFabrica * imposto) + custoFabrica;
        Double valorConsumidor = (valorComImposto * distribuidor) + valorComImposto;
        return valorConsumidor;
    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void setValorCarro(Double valorCarro){
        this.valorCarro = valorCarro;
    }

    public void setAnoCarro(Integer anoCarro){
        this.anoCarro = anoCarro;
    }

    public Double descontoPeloAno(){
        if(anoCarro <= 2000){
            desconto += (valorCarro * 0.12);
            qtdAte2000++;
            qtdCarros++;
            return desconto;
        }else{
            desconto += (valorCarro * 0.07);
            qtdCarros++;
            return desconto;
        }
    }

    public Double getValorCarro(){
        return valorCarro;
    }

    public Integer getQtdAte2000(){
        return qtdAte2000;
    }

    public Integer getQtdCarros(){
        return qtdCarros;
    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void setTipoCombustivel(Character tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }

    public Double descontoPeloCombustivel(){

        if(tipoCombustivel == 'a'){
            desconto += (valorCarro * 0.25);
        }else if(tipoCombustivel == 'g'){
            desconto += (valorCarro * 0.21);
        }else if(tipoCombustivel == 'd'){
            desconto += (valorCarro * 0.14);
        }
        return desconto;
    }
}

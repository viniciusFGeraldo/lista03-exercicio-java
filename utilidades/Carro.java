package utilidades;

public class Carro {
    /*7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e 
    dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor
    sobre o resultado). Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um 
    programa que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo. */

    public Double custoFabrica;
    public Double imposto = 0.45;
    public Double distribuidor = 0.28;

    public Double custoConsumidor(Double custoFabrica){
        Double valorComImposto = (custoFabrica * imposto) + custoFabrica;
        Double valorConsumidor = (valorComImposto * distribuidor) + valorComImposto;
        return valorConsumidor;
    }
}

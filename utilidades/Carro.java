package utilidades;

public class Carro {
    /*7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e 
    dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor
    sobre o resultado). Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um 
    programa que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo. */

    public Double custoFabrica;
    public Double imposto = 0.45;
    public Double distribuidor = 0.28;

    public Double valorCarro;
    public Integer anoCarro;
    public Character tipoCombustivel;
    public Integer qtdAte2000 = 0;
    public Integer qtdCarros = 0;
    public Double desconto = 0.0;


    public Double custoConsumidor(Double custoFabrica){
        Double valorComImposto = (custoFabrica * imposto) + custoFabrica;
        Double valorConsumidor = (valorComImposto * distribuidor) + valorComImposto;
        return valorConsumidor;
    }

    /*12. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com 
    desconto. Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo 
    cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 
    - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando desconto 
    até que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral. */

    public Double descontoPeloAno(Double valorCarro, Integer anoCarro, Double desconto){
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

    public Integer pegarQtdAte2000(){
        return qtdAte2000;
    }

    public Integer pegarQtdCarros(){
        return qtdCarros;
    }

    /*15. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça 
    um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto 
    deverá ser calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina 
    – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados. Informe total de 
    desconto e total pago pelos clientes. */

    public Double descontoPeloCombustivel(Double valorCarro, Character tipoCombustivel){

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
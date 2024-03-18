import utilidades.Carro;
import utilidades.Prompt;

public class Ex12 {
    public static void executar(){
        /*12. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com 
    desconto. Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo 
    cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 
    - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando desconto 
    até que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral. */

    Carro carro = new Carro();
    Boolean continuar = true;
    Double valorPagar = 0.0;
    Double desconto = 0.0;

    do{
        carro.valorCarro = Prompt.lerDecimal("Informe o valor carro: ");
        carro.anoCarro = Prompt.lerInteiro("Informe o ano do carro: ");

        valorPagar += carro.valorCarro;

        desconto = carro.descontoPeloAno(carro.valorCarro, carro.anoCarro, desconto);
        Integer qtdAte2000 = carro.qtdAte2000;
        Integer qtdCarros = carro.qtdCarros;

        Prompt.imprimir("Valor do desconto: " + desconto);
        Prompt.imprimir("Total a pagar: " + (valorPagar - desconto));
        Prompt.imprimir("Total de veiculos até ano 2000: " + qtdAte2000);
        Prompt.imprimir("Total de veiculos: " + qtdCarros);

    
    Character resposta = Prompt.lerCaractere("Deseja continuar(n(Não) ou s(Sim)): ");
    if(resposta == 'n' || resposta == 'N'){
        continuar = false;
    }else if(resposta == 's' || resposta == 'S'){
        continuar = true;
    }else{
        Prompt.imprimir("Opção inválida. Por favor, escolha s para Sim ou n para Não.");
    }
    }while(continuar);

    }
}

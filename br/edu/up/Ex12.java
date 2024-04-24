package br.edu.up;
import br.edu.up.listaClasses.Carro;

public class Ex12 {
    public static void executar(){

    Carro carro1 = new Carro();
    Boolean continuar = true;
    Double desconto = 0.0;

    do{
        carro1.setValorCarro(Prompt.lerDecimal("Informe o valor carro: "));
        carro1.setAnoCarro(Prompt.lerInteiro("Informe o ano do carro: "));

        desconto = carro1.descontoPeloAno();

        Prompt.imprimir("Valor do desconto: " + desconto);
        Prompt.imprimir("Total a pagar: " + (carro1.getValorCarro() - desconto));
        Prompt.imprimir("Total de veiculos até ano 2000: " + carro1.getQtdAte2000());
        Prompt.imprimir("Total de veiculos: " + carro1.getQtdCarros());

    
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

package br.edu.up;
import br.edu.up.listaClasses.Carro;

public class Ex07 {
    public static void executar(){

        Carro carro1 = new Carro();

        carro1.setCustoFabrica(Prompt.lerDecimal("Informe o custo de fabrica do carro: "));

        Double custoConsumidor = carro1.custoConsumidor();
        Prompt.imprimir("Custo final ao consumidor é: R$" + custoConsumidor);
        
    }
}

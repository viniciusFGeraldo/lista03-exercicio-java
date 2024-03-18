import utilidades.*;

public class Ex07 {
    public static void executar(){
        /*7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e 
        dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor
        sobre o resultado). Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um 
        programa que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo. */

        Carro carro1 = new Carro();

        carro1.custoFabrica = Prompt.lerDecimal("Informe o custo de fabrica do carro: ");

        Double custoConsumidor = carro1.custoConsumidor(carro1.custoFabrica);
        Prompt.imprimir("Custo final ao consumidor é: R$" + custoConsumidor);
        
    }
}

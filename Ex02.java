public class Ex02 {
    public static void executar(){
        /*2. Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a 
        distância total percorrida pelo automóvel e o total de combustível gasto. */

        Veiculo carro = new Veiculo();

        carro.distanciaPercorrida = Prompt.lerDecimal("Informe a distância percorrida pelo automóvel: ");
        carro.combustivelGasto = Prompt.lerDecimal("Informe o total de combustivel gasto: ");

        Double consumo = carro.consumoMedio(carro.distanciaPercorrida, carro.combustivelGasto);

        Prompt.imprimir("Consumo médio: " + consumo);
    }    
}

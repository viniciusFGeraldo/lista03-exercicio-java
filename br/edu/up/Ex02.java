package br.edu.up;
import br.edu.up.listaClasses.Carro;

public class Ex02 {
    public static void executar(){

        Carro carro1 = new Carro();

        carro1.setDistanciaPercorrida(Prompt.lerDecimal("Informe a distância percorrida pelo automóvel: "));
        carro1.setCombustivelGasto(Prompt.lerDecimal("Informe o total de combustivel gasto: "));

        Double consumo = carro1.consumoMedio();

        Prompt.imprimir("Consumo médio: " + consumo);
    }    
}

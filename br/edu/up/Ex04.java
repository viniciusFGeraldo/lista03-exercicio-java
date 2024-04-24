package br.edu.up;
import br.edu.up.listaClasses.Cambio;

public class Ex04 {
    public static void executar(){

        Cambio cambio = new Cambio();

        cambio.setCotacaoDolar(Prompt.lerDecimal("Informe a cotação do dólar: "));
        cambio.setQtdDolar(Prompt.lerDecimal("Informe a quantidade de dólares que deseja trocar: "));

        Double conversao = cambio.conversaoParaReais();
        Prompt.imprimir("O valor da conversão em real: R$" + conversao);
    }
}

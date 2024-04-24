package br.edu.up;
import br.edu.up.listaClasses.Carro;

public class Ex15 {
    public static void executar(){

        Carro carro1 = new Carro();
        Double valorPagar = 0.0;

        do{

            carro1.setValorCarro(Prompt.lerDecimal("Infome o valor do carro: "));
            carro1.setTipoCombustivel(Prompt.lerCaractere("Informe tipo de combustivel(a-alcool, g-gasolina, d-diesel): "));

            valorPagar += carro1.getValorCarro();;

            Double desconto = carro1.descontoPeloCombustivel();

            Prompt.separador();
            Prompt.imprimir("Valor de desconto: " + desconto);
            Prompt.imprimir("Valor a pagar: " + (valorPagar - desconto));
            Prompt.separador();

        }while(carro1.getValorCarro() != 0);

    }
}

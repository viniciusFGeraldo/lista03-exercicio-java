import utilidades.Carro;
import utilidades.Prompt;

public class Ex15 {
    public static void executar(){
        /*15. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça 
        um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto 
        deverá ser calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina 
        – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados. Informe total de 
        desconto e total pago pelos clientes. */

        Carro carro = new Carro();
        Double valorPagar = 0.0;

        do{

            carro.valorCarro = Prompt.lerDecimal("Infome o valor do carro: ");
            carro.tipoCombustivel = Prompt.lerCaractere("Informe tipo de combustivel(a-alcool, g-gasolina, d-diesel): ");

            valorPagar += carro.valorCarro;

            Double desconto = carro.descontoPeloCombustivel(carro.valorCarro, carro.tipoCombustivel);

            Prompt.separador();
            Prompt.imprimir("Valor de desconto: " + desconto);
            Prompt.imprimir("Valor a pagar: " + (valorPagar - desconto));
            Prompt.separador();

        }while(carro.valorCarro != 0);

    }
}

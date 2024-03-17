public class Ex04 {
    public static void executar(){
        /*4. Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um 
        valor lido em dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também a 
        quantidade de dólares disponíveis com o usuário. */

        Cambio cambio = new Cambio();

        cambio.cotacaoDolar = Prompt.lerDecimal("Informe a cotação do dólar: ");
        cambio.qtdDolar = Prompt.lerDecimal("Informe a quantidade de dólares que deseja trocar: ");

        Double conversao = cambio.conversaoParaReais(cambio.cotacaoDolar, cambio.qtdDolar);
        Prompt.imprimir("O valor da conversão em real: R$" + conversao);
    }
}

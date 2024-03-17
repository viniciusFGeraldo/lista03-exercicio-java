public class Cambio {
    /*4. Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um 
        valor lido em dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também a 
        quantidade de dólares disponíveis com o usuário. */
    
    Double cotacaoDolar;
    Double qtdDolar;

    public Double conversaoParaReais(Double qtdDolar, Double cotacaoDolar){
        return qtdDolar * cotacaoDolar;
    }
}

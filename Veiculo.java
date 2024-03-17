public class Veiculo {

    Double distanciaPercorrida;
    Double combustivelGasto;

    public Double consumoMedio(Double dp, Double cg){
        Double consumoMedio = dp / cg;
        return consumoMedio;
    }
    
}

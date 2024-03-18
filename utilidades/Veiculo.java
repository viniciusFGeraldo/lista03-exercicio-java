package utilidades;

public class Veiculo {

    public Double distanciaPercorrida;
    public Double combustivelGasto;

    public Double consumoMedio(Double dp, Double cg){
        Double consumoMedio = dp / cg;
        return consumoMedio;
    }
    
}

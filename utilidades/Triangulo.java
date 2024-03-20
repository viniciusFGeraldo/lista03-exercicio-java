package utilidades;

public class Triangulo {

    public Integer lado1;
    public Integer lado2;
    public Integer lado3;

    public Boolean formaTriangulo(Integer lado1, Integer lado2, Integer lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
    
    public String tipoTriangulo(Integer lado1, Integer lado2, Integer lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isóscele";
        } else {
            return "Escaleno";
        }
    }
    
}

package br.edu.up.listaClasses;

public class Triangulo {
    private Integer lado1;
    private Integer lado2;
    private Integer lado3;

    public void setLado1(Integer lado1){
        this.lado1 = lado1;
    }

    public void setLado2(Integer lado2){
        this.lado2 = lado2;
    }

    public void setLado3(Integer lado3){
        this.lado3 = lado3;
    }

    public Boolean formaTriangulo() {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
    
    public String tipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isóscele";
        } else {
            return "Escaleno";
        }
    }
}

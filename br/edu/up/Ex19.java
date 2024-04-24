package br.edu.up;
import br.edu.up.listaClasses.*;

public class Ex19 {
    public static void executar(){

        Triangulo triangulo = new Triangulo();
        String tipoTriangulo;

        triangulo.setLado1(Prompt.lerInteiro("Informe o 1° valor: "));
        triangulo.setLado2(Prompt.lerInteiro("Informe o 2° valor: "));
        triangulo.setLado3(Prompt.lerInteiro("Informe o 3° valor: "));

        if (triangulo.formaTriangulo()) {
            tipoTriangulo = triangulo.tipoTriangulo();
            Prompt.imprimir("Os valores informados formam um triângulo do tipo " + tipoTriangulo);
        } else {
            Prompt.imprimir("Os valores informados não formam um triângulo.");
        }
    
    }
}

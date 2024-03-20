import utilidades.*;

public class Ex19 {
    public static void executar(){
        /*19. Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados de 
        um triângulo. Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
        Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos 
        comprimentos dos outros dois lados.
        Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
        Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. Portanto, todo 
        triângulo equilátero é também isóscele;
        Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes */

        Triangulo triangulo = new Triangulo();
        String tipoTriangulo;

        triangulo.lado1 = Prompt.lerInteiro("Informe o 1° valor: ");
        triangulo.lado2 = Prompt.lerInteiro("Informe o 2° valor: ");
        triangulo.lado3 = Prompt.lerInteiro("Informe o 3° valor: ");

        if (triangulo.formaTriangulo(triangulo.lado1, triangulo.lado2, triangulo.lado3)) {
            tipoTriangulo = triangulo.tipoTriangulo(triangulo.lado1, triangulo.lado2, triangulo.lado3);
            Prompt.imprimir("Os valores informados formam um triângulo do tipo " + tipoTriangulo);
        } else {
            Prompt.imprimir("Os valores informados não formam um triângulo.");
        }
    
    }
}
package br.edu.up;
import br.edu.up.listaClasses.Intervalo;

public class Ex09 {
    public static void executar(){
        
        Intervalo entreValores = new Intervalo();

        entreValores.lerNumeros();
        Integer contador = entreValores.qtdNoIntervalo();
        Prompt.imprimir("A quantidade de números no intervalo entre 10 e 150 é: " + contador);
    }
}

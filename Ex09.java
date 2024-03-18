import utilidades.Intervalo;
import utilidades.Prompt;

public class Ex09 {
    public static void executar(){
        /*9. Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) 
        e 150 (inclusive). */
        Intervalo intervalo = new Intervalo();

        intervalo.lerNumeros();
        Integer contador = intervalo.qtdNoIntervalo();
        Prompt.imprimir("A quantidade de números no intervalo entre 10 e 150 é: " + contador);
    }
}

import utilidades.Pessoa;
import utilidades.Prompt;

public class Ex10 {
    public static void executar(){
        /*10. Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem 
        informando “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18 
        anos como maior de idade. */

        Pessoa pessoa = new Pessoa();

        for(int i = 0;i < 10;i++){
            pessoa.idade = Prompt.lerInteiro("Informe a idade da " + (i + 1) + "° pessoa: ");

            pessoa.maioridade();
        }
    }
}

import utilidades.Natacao;
import utilidades.Prompt;

public class Ex21 {
    public static void executar(){
        /*21. Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
        Infantil A = 5 - 7 anos
        Infantil B = 8 - 10 anos
        juvenil A = 11- 13 anos
        juvenil B = 14 - 17 anos
        Sênior = 18 - 25 anos
        Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado. */

        Natacao nadador1 = new Natacao();

        nadador1.idade = Prompt.lerInteiro("Informe a idade do nadador: ");

        nadador1.classificacaoNadador(nadador1.idade);
    }
}

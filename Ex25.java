import utilidades.Aluno;
import utilidades.Prompt;

public class Ex25 {
    public static void executar(){
        /*25. Dado o nome de um estudante, com o respectivo número de matrícula e as três notas acima mencionadas,
         desenvolva um programa para calcular a nota final e a classificação de cada estudante. 
         A classificação é dada conforme a lista abaixo:
        Nota Final Classificação
        [8,10] A
        [7,8] B 
        [6,7] C
        [5,6] D
        [0,5] R
        Imprima o nome do estudante, com o seu número, nota final e classificação.*/

        Aluno aluno1 = new Aluno();

        aluno1.nome = Prompt.lerLinha("Informe o nome: ");
        aluno1.matricula = Prompt.lerInteiro("Informe o número da matricula: ");
        aluno1.nota1 = Prompt.lerDecimal("Informe o valor da nota1 do aluno: ");
        aluno1.nota2 = Prompt.lerDecimal("Informe o valor da nota2 do aluno: ");
        aluno1.nota3 = Prompt.lerDecimal("Informe o valor da nota3 do aluno: ");

        Double media = aluno1.mediaAritmetica(aluno1.nota1, aluno1.nota2, aluno1.nota3);
        aluno1.classificacaoBaseadaEmMedia(aluno1.nome, aluno1.matricula, media);

    }
}

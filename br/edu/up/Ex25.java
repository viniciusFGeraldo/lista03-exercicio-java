package br.edu.up;
import br.edu.up.listaClasses.Aluno;

public class Ex25 {
    public static void executar(){

        Aluno aluno1 = new Aluno();

        aluno1.setNome(Prompt.lerLinha("Informe o nome: "));
        aluno1.setMatricula(Prompt.lerInteiro("Informe o número da matricula: "));
        aluno1.setNota1(Prompt.lerDecimal("Informe o valor da nota1 do aluno: "));
        aluno1.setNota2(Prompt.lerDecimal("Informe o valor da nota2 do aluno: "));
        aluno1.setNota3(Prompt.lerDecimal("Informe o valor da nota3 do aluno: "));

        Double media = aluno1.mediaAritmetica();
        aluno1.classificacaoBaseadaEmMedia(media);

    }
}

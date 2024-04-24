package br.edu.up;
import br.edu.up.listaClasses.Aluno;

public class Ex01 {
    public static void executar(){
        Aluno aluno1 = new Aluno();

        aluno1.setNome(Prompt.lerLinha("Informe o nome do aluno: "));
        
        aluno1.setNota1(Prompt.lerDecimal("Informe o valor da nota1 do aluno: "));
        aluno1.setNota2(Prompt.lerDecimal("Informe o valor da nota2 do aluno: "));
        aluno1.setNota3(Prompt.lerDecimal("Informe o valor da nota3 do aluno: "));

        double media = aluno1.mediaAritmetica();

        Prompt.imprimir("O aluno: " + aluno1.getNome() + " ficou com média: " + media);
    }
}

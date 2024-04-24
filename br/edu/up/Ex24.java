package br.edu.up;
import br.edu.up.listaClasses.Aluno;

public class Ex24 {
    public static void executar(){
        Aluno aluno1 = new Aluno();

        aluno1.setNome(Prompt.lerLinha("Informe o nome do aluno: "));
        aluno1.setNota1(Prompt.lerDecimal("Informe a nota do trabalho de laboratório: "));
        aluno1.setNota2(Prompt.lerDecimal("Informe a nota da avaliação semestral: "));
        aluno1.setNota3(Prompt.lerDecimal("Informe a nota do exame final: "));

        aluno1.mediaPonderada();
    }  
}

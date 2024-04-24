package br.edu.up;
import br.edu.up.listaClasses.Aluno;

public class Ex08 {
    public static void executar(){

        Aluno aluno1 = new Aluno();

        aluno1.setNome(Prompt.lerLinha("Informe o nome do aluno: "));
        
        aluno1.setNota1(Prompt.lerDecimal("Informe o valor da nota1 do aluno: "));
        aluno1.setNota2(Prompt.lerDecimal("Informe o valor da nota2 do aluno: "));
        aluno1.setNota3(Prompt.lerDecimal("Informe o valor da nota3 do aluno: "));

        Double media = aluno1.mediaAritmetica();

        if(media >= 7){
            Prompt.imprimir("aluno: " + aluno1.getNome() + " foi APROVADO.");
        }else if(media <= 5){
            Prompt.imprimir("aluno: " + aluno1.getNome() + " foi REPROVADO.");
        }else{
            Prompt.imprimir("aluno: " + aluno1.getNome() + " está de RECUPERAÇÃO.");
        }
    }
}

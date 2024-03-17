public class Ex01 {
    public static void executar(){
        /*1. Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve 
        no semestre. No final informar o nome do aluno e a sua média (aritmética). */

        Aluno aluno1 = new Aluno();

        aluno1.nome = Prompt.lerLinha("Informe o nome do aluno: ");
        
        aluno1.nota1 = Prompt.lerDecimal("Informe o valor da nota1 do aluno: ");
        aluno1.nota2 = Prompt.lerDecimal("Informe o valor da nota2 do aluno: ");
        aluno1.nota3 = Prompt.lerDecimal("Informe o valor da nota3 do aluno: ");

        Double media = aluno1.mediaAritmetica(aluno1.nota1, aluno1.nota2, aluno1.nota3);

        Prompt.imprimir("O aluno: " + aluno1.nome + " ficou com média: " + media);
    }
}

public class Ex08 {
    public static void executar(){
        /*8. Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre. 
        Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), 
        Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9). */

        Aluno aluno = new Aluno();

        aluno.nome = Prompt.lerLinha("Informe o nome do aluno: ");
        aluno.nota1 = Prompt.lerDecimal("Informe a 1° nota: ");
        aluno.nota2 = Prompt.lerDecimal("Informe a 2° nota: ");
        aluno.nota3 = Prompt.lerDecimal("Informe a 3° nota: ");

        Double media = aluno.mediaAritmetica(aluno.nota1, aluno.nota2, aluno.nota3);

        if(media >= 7){
            Prompt.imprimir("aluno: " + aluno.nome + " foi APROVADO.");
        }else if(media <= 5){
            Prompt.imprimir("aluno: " + aluno.nome + " foi REPROVADO.");
        }else{
            Prompt.imprimir("aluno: " + aluno.nome + " está de RECUPERAÇÃO.");
        }
    }
}

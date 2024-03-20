import utilidades.Aluno;
import utilidades.Prompt;

public class Ex24 {
    public static void executar(){
        /*24. Em um curso de Ciência da Computação a nota do estudante é calculada a partir de três notas 
        atribuídas, respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame 
        final. As notas variam, de 0 a 10 e a nota final é a média ponderada das três notas mencionadas.
        A lista abaixo fornece os pesos:
        a. Laboratório: peso 2
        b. Avaliação semestral: peso 3
        c. Exame final: peso 5 */

        Aluno aluno1 = new Aluno();

        aluno1.nome = Prompt.lerLinha("Informe o nome do aluno: ");
        aluno1.nota1 = Prompt.lerDecimal("Informe a nota do trabalho de laboratório: ");
        aluno1.nota2 = Prompt.lerDecimal("Informe a nota da avaliação semestral: ");
        aluno1.nota3 = Prompt.lerDecimal("Informe a nota do exame final: ");

        aluno1.mediaPonderada(aluno1.nota1, aluno1.nota2, aluno1.nota3);



    }    
}

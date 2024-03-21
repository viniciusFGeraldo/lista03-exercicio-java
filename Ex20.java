import utilidades.Funcionario;
import utilidades.Prompt;

public class Ex20 {
    public static void executar(){
        /*20. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa
        que calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
        Professor Nível 1 R$12,00 por hora/aula
        Professor Nível 2 R$17,00 por hora/aula
        Professor Nível 3 R$25,00 por hora/aula */

        Funcionario funcionario = new Funcionario();

        funcionario.horaAula = Prompt.lerInteiro("Informe quantas horas/aula foram feitas:");
        funcionario.nivel = Prompt.lerInteiro("Informe o nivel do professor(1,2 ou 3): ");
        
        

        funcionario.salarioHoraAula(funcionario.horaAula, funcionario.nivel);

    }
}

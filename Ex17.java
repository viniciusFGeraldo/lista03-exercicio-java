import utilidades.Funcionario;
import utilidades.Prompt;

public class Ex17 {
    public static void executar(){
        /*17. Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário 
        reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à 
        empresa vai aumentar sua folha de pagamento. */

        Boolean continuar = true;
        Funcionario funcionario = new Funcionario();

        do {

            funcionario.reajusteSalarialComSoma();

            Character resposta = Prompt.lerCaractere("Deseja continuar(n(Não) ou s(Sim)): ");
            if(resposta == 'n' || resposta == 'N'){
                continuar = false;
            }else if(resposta == 's' || resposta == 'S'){
                continuar = true;
            }else{
                Prompt.imprimir("Opção inválida. Por favor, escolha s para Sim ou n para Não.");
            }
            
        } while (continuar);


    }
}

package br.edu.up;
import br.edu.up.listaClasses.Pessoa;

public class Ex17 {
    public static void executar(){

        Boolean continuar = true;
        Pessoa funcionario = new Pessoa();

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

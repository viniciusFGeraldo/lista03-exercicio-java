package br.edu.up;
import br.edu.up.listaClasses.Pessoa;

public class Ex21 {
    public static void executar(){

        Pessoa nadador1 = new Pessoa();

        nadador1.setIdade(Prompt.lerInteiro("Informe a idade do nadador: "));

        nadador1.classificacaoNadador();
    }
}

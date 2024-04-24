package br.edu.up;
import br.edu.up.listaClasses.*;

public class Ex10 {
    public static void executar(){

        Pessoa pessoa1 = new Pessoa();

        for(int i = 0;i < 10;i++){
            pessoa1.setIdade(Prompt.lerInteiro("Informe a idade da " + (i + 1) + "° pessoa: "));

            pessoa1.maioridade();
        }
    }
}

package br.edu.up;
import br.edu.up.listaClasses.Pessoa;

public class Ex11 {
    public static void executar(){
        Pessoa pessoa1 = new Pessoa();

        for(int i = 0; i < 56; i++){
            pessoa1.setNome(Prompt.lerLinha("Informe o nome da " + (i + 1) + "° pessoa: "));
            pessoa1.setSexo(Prompt.lerCaractere("Informe o sexo da " + (i + 1) + "° pessoa com f(feminino) ou m(masculino): "));

            pessoa1.qtdPorSexo();
        }

        Prompt.separador();
        Prompt.imprimir("Total de mulheres: " + pessoa1.getFeminino());
        Prompt.imprimir("Total de homens: " + pessoa1.getMasculino());
    }
}

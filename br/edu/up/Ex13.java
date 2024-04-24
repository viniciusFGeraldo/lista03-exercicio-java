package br.edu.up;
import br.edu.up.listaClasses.Pessoa;

public class Ex13 {
    public static void executar(){

        Pessoa pessoa1 = new Pessoa();
        int num = Prompt.lerInteiro("Informe quantas pessoas seram testadas: ");

        for(int i = 0;i < num;i++){
            pessoa1.setNome(Prompt.lerLinha("Informe o nome da " + (i + 1) + "° pessoa: "));
            pessoa1.setSexo(Prompt.lerCaractere("Informe o sexo da " + (i + 1) + "° pessoa: "));
            pessoa1.setIdade(Prompt.lerInteiro("Informe a idade da " + (i + 1) + "° pessoa: "));
            pessoa1.setSaude(Prompt.lerCaractere("Informe se a " + (i + 1) + "° pessoa esta apta a servir(n(Não) ou s(Sim)): "));

            pessoa1.testeDeAptidão();
        }
    }
}

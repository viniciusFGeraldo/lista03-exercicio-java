package br.edu.up;
import br.edu.up.listaClasses.Pessoa;

public class Ex23 {
    public static void executar(){

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome(Prompt.lerLinha("Informe o nome: "));
        pessoa1.setSexo(Prompt.lerCaractere("Informe o sexo(f-feminino ou m-masculino): "));
        pessoa1.setAltura(Prompt.lerDecimal("Informe a altura: "));
        pessoa1.setIdade(Prompt.lerInteiro("Informe a idade: "));

        pessoa1.pesoIdeal();
    }
}

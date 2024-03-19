import utilidades.Pessoa;
import utilidades.Prompt;

public class Ex23 {
    public static void executar(){
        /*23. Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. Calcule e mostre 
        nome e o seu peso ideal de acordo com as seguintes características da pessoa: */

        Pessoa pessoa = new Pessoa();

        pessoa.nome = Prompt.lerLinha("Informe o nome: ");
        pessoa.sexo = Prompt.lerCaractere("Informe o sexo(f-feminino ou m-masculino): ");
        pessoa.altura = Prompt.lerDecimal("Informe a altura: ");
        pessoa.idade = Prompt.lerInteiro("Informe a idade: ");

        pessoa.pesoIdeal(pessoa.nome, pessoa.sexo, pessoa.altura, pessoa.idade);
    }
}

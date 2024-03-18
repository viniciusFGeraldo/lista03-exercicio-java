import utilidades.*;

public class Ex11 {
    public static void executar(){
        /*11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é 
        homem ou mulher. No final informe total de homens e de mulheres. */

        Pessoa pessoa = new Pessoa();

        for(int i = 0; i < 56; i++){
            pessoa.nome = Prompt.lerLinha("Informe o nome da " + (i + 1) + "° pessoa: ");
            pessoa.sexo = Prompt.lerCaractere("Informe o sexo da " + (i + 1) + "° pessoa com f(feminino) ou m(masculino): ");

            pessoa.qtdPorSexo(pessoa.sexo, pessoa.nome);
        }

        Integer feminino = pessoa.qtdFeminino;
        Integer masculino = pessoa.qtdMasculino;

        Prompt.separador();
        Prompt.imprimir("Total de mulheres: " + feminino);
        Prompt.imprimir("Total de homens: " + masculino);
    }
}

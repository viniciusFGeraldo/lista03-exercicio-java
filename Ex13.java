import utilidades.Pessoa;
import utilidades.Prompt;

public class Ex13 {
    public static void executar(){
        /*13. Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe 
        se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais. */

        Pessoa pessoa = new Pessoa();
        int num = Prompt.lerInteiro("Informe quantas pessoas seram testadas: ");

        for(int i = 0;i < num;i++){
            pessoa.nome = Prompt.lerLinha("Informe o nome da " + (i + 1) + "° pessoa: ");
            pessoa.sexo = Prompt.lerCaractere("Informe o sexo da " + (i + 1) + "° pessoa: ");
            pessoa.idade = Prompt.lerInteiro("Informe a idade da " + (i + 1) + "° pessoa: ");
            pessoa.saude = Prompt.lerCaractere("Informe se a " + (i + 1) + "° pessoa esta apta a servir(n(Não) ou s(Sim)): ");

            pessoa.testeDeAptidão(pessoa.nome, pessoa.sexo, pessoa.idade, pessoa.saude);
        }
    }
}

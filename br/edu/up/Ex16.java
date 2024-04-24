package br.edu.up;
import br.edu.up.listaClasses.Pessoa;

public class Ex16 {
    public static void executar(){

        Pessoa funcionario = new Pessoa();

        funcionario.setSalarioMinimo(Prompt.lerDecimal("Informe o valor do salário minimo: "));

        for(int i = 0;i < 584;i++){
            funcionario.setSalarioFuncionario(Prompt.lerDecimal("Informe o salário do " + (i + 1) + "° funcionário: "));
            funcionario.reajusteSalarial();

            Prompt.separador();
            Prompt.imprimir("O salário do funcionário passou de R$" + funcionario.getSalarioFuncionario() + " para o reajuste de R$" + funcionario.getSalarioReajustado());
            Prompt.separador();
        }
        Prompt.linhaEmBranco();
        Prompt.imprimir("FIM DO PROGRAMA!!");
    }
}

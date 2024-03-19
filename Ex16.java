import utilidades.*;

public class Ex16 {
    public static void executar(){
        /*16. Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionários 
        de acordo com os seguintes critérios:
        a) 50% para aqueles que ganham menos do que três salários mínimos;
        b) 20% para aqueles que ganham entre três até dez salários mínimos;
        c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
        d) 10% para os demais funcionários. */

        Funcionarios funcionario = new Funcionarios();

        Double salarioMinimo = Prompt.lerDecimal("Informe o valor do salário minimo: ");

        for(int i = 0;i < 5;i++){
            Double salarioFuncionario = Prompt.lerDecimal("Informe o salário do " + (i + 1) + "° funcionário: ");
            Double salarioReajustado = funcionario.reajusteSalarial(salarioMinimo, salarioFuncionario);

            Prompt.separador();
            Prompt.imprimir("O salário do funcionário passou de R$" + salarioFuncionario + " para o reajuste de R$" + salarioReajustado);
            Prompt.separador();
        }
        Prompt.linhaEmBranco();
        Prompt.imprimir("FIM DO PROGRAMA!!");
    }
}

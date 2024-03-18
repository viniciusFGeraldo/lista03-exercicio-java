import utilidades.Loja;
import utilidades.Prompt;

public class Ex03 {
    public static void executar(){
        /*3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
        efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre 
        suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês. */

        Loja vendedor1 = new Loja();

        vendedor1.nome = Prompt.lerLinha("Informe o nome do vendedor: ");
        vendedor1.salarioFixo = Prompt.lerDecimal("Informe o salário fixo do vendedor: ");
        vendedor1.vendas = Prompt.lerDecimal("Informe o total em vendas efetuadas pelo vendedor no mês: ");

        Double comissão = vendedor1.comissao(vendedor1.vendas);
        Double salarioLiquido = vendedor1.salarioLiquido(vendedor1.salarioFixo, comissão);

        Prompt.imprimir("Salário Liquido: R$" + salarioLiquido);
    }
}

package br.edu.up;
import br.edu.up.listaClasses.Loja;

public class Ex03 {
    public static void executar(){

        Loja vendedor1 = new Loja();

        vendedor1.setNome(Prompt.lerLinha("Informe o nome do vendedor: "));
        vendedor1.setSalarioFixo(Prompt.lerDecimal("Informe o salário fixo do vendedor: "));
        vendedor1.setVendas(Prompt.lerDecimal("Informe o total em vendas efetuadas pelo vendedor no mês: "));
        
        Double comissão = vendedor1.comissao();
        Double salarioLiquido = vendedor1.salarioLiquido(comissão);

        Prompt.imprimir("O funcionário : " + vendedor1.getNome() + " tem Salário Liquido de: R$" + salarioLiquido);
    }
}

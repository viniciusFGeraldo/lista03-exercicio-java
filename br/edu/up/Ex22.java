package br.edu.up;
import br.edu.up.listaClasses.Pessoa;

public class Ex22 {
    public static void executar(){

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setKw(Prompt.lerDecimal("Informe o quantidade em KW/h gasto: "));
        pessoa1.setTipoConta(Prompt.lerInteiro("Informe o tipo de cliente(1-residência  2-comércio  3-indústria): "));

        pessoa1.contaLuz();

    }
}

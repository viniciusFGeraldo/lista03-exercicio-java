import utilidades.Pessoa;
import utilidades.Prompt;

public class Ex22 {
    public static void executar(){
        /*22. Faça um programa que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de
         luz segue a tabela abaixo:
        Tipo de Cliente Valor do KW/h
        1 (Residência) 0,60
        2 (Comércio) 0,48
        3 (Indústria) 1,29 */

        Pessoa pessoa = new Pessoa();

        pessoa.kw = Prompt.lerDecimal("Informe o quantidade em KW/h gasto: ");
        pessoa.tipoConta = Prompt.lerInteiro("Informe o tipo de cliente(1-residência  2-comércio  3-indústria): ");

        pessoa.contaLuz(pessoa.kw, pessoa.tipoConta);

    }
}

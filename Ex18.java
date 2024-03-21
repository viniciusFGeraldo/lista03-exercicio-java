import utilidades.Funcionario;
import utilidades.Prompt;

public class Ex18 {
    public static void executar(){
        /*18. Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. Mostre 
        o nome e o salário líquido acrescido do abono conforme o sexo e a idade: */

        Funcionario funcionario = new Funcionario();
        Boolean continuar = false;

        funcionario.nome = Prompt.lerLinha("Informe o nome do funcionário: ");
        funcionario.idade = Prompt.lerInteiro("Informe a idade do funcionario: ");
        do{
            funcionario.sexo = Prompt.lerCaractere("Informe o sexo(f-feminino ou m-masculino): ");

            if(funcionario.sexo != 'f' && funcionario.sexo != 'F' && funcionario.sexo != 'm' && funcionario.sexo != 'M'){
                Prompt.imprimir("Caracter inválido,tente novamente.");
                Prompt.separador();
                continuar = true;
            }else{
                continuar = false;
            }
        }while(continuar);
        funcionario.salarioFuncionario = Prompt.lerDecimal("Informe o salário fixo do funcionário: ");

        funcionario.salarioComAbono(funcionario.nome, funcionario.idade, funcionario.sexo, funcionario.salarioFuncionario);        

        
    }
}

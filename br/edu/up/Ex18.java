package br.edu.up;
import br.edu.up.listaClasses.Pessoa;

public class Ex18 {
    public static void executar(){

        Pessoa funcionario = new Pessoa();
        Boolean continuar = false;

        funcionario.setNome(Prompt.lerLinha("Informe o nome do funcionário: "));
        funcionario.setIdade(Prompt.lerInteiro("Informe a idade do funcionario: "));
        do{
            funcionario.setSexo(Prompt.lerCaractere("Informe o sexo(f-feminino ou m-masculino): "));

            if(funcionario.getSexo() != 'f' && funcionario.getSexo() != 'F' && funcionario.getSexo() != 'm' && funcionario.getSexo() != 'M'){
                Prompt.imprimir("Caracter inválido,tente novamente.");
                Prompt.separador();
                continuar = true;
            }else{
                continuar = false;
            }
        }while(continuar);
        funcionario.setSalarioFuncionario(Prompt.lerDecimal("Informe o salário fixo do funcionário: "));

        funcionario.salarioComAbono();        

        
    }
}

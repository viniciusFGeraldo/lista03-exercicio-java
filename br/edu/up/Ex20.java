package br.edu.up;
import br.edu.up.listaClasses.Pessoa;

public class Ex20 {
    public static void executar(){

        Pessoa funcionario = new Pessoa();

        funcionario.setHorasAula(Prompt.lerInteiro("Informe quantas horas/aula foram feitas:"));
        funcionario.setNivel(Prompt.lerInteiro("Informe o nivel do professor(1,2 ou 3): "));
        
        

        funcionario.salarioHoraAula();
    }
}

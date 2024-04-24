package br.edu.up;
import br.edu.up.listaClasses.Pessoa;

public class Ex26 {
    public static void executar(){

        Pessoa cliente1 = new Pessoa();
        cliente1.setNome(Prompt.lerLinha("Informe o nome do cliente: "));
        cliente1.setIdade(Prompt.lerInteiro("Informe a idade do cliente: "));
        
        if(cliente1.getIdade() < 17 || cliente1.getIdade() > 70){
            Prompt.imprimir("Este cliente não possui idade adequada para apólices de seguro.");
        }else{
            cliente1.setGrupoRisco(Prompt.lerCaractere("Informe o grupo de risco(b-baixo, m-médio, a-alto): "));
            cliente1.categoriaSeguro();
        }

    } 
}

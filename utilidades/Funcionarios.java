package utilidades;

public class Funcionarios {

    public Double salarioReajustado;
    public String nome;
    public Double salarioFuncionario;
    public Double salarioMinimo;
    public Double reajuste;
    public Double folhaPagamento = 0.0;

    /*16. Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionários 
        de acordo com os seguintes critérios:
        a) 50% para aqueles que ganham menos do que três salários mínimos;
        b) 20% para aqueles que ganham entre três até dez salários mínimos;
        c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
        d) 10% para os demais funcionários. */

    public Double reajusteSalarial(Double salarioMinimo, Double salarioFuncionario){
        if(salarioFuncionario < (salarioMinimo * 3)){
            reajuste = (salarioFuncionario * 0.50);
            salarioReajustado = (salarioFuncionario * 0.50) + salarioFuncionario;
            
        }else if(salarioFuncionario < (salarioMinimo * 10) && salarioFuncionario >= (salarioMinimo * 3)){
            reajuste = (salarioFuncionario * 0.20);
            salarioReajustado = (salarioFuncionario * 0.20) + salarioFuncionario;

        }else if(salarioFuncionario < (salarioMinimo * 20) && salarioFuncionario >= (salarioMinimo * 10)){
            reajuste = (salarioFuncionario * 0.15);
            salarioReajustado = (salarioFuncionario * 0.15) + salarioFuncionario;

        }else{
            reajuste = (salarioFuncionario * 0.10);
            salarioReajustado = (salarioFuncionario * 0.10) + salarioFuncionario;

        }
        return salarioReajustado;
    }



    /*17. Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário 
    reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à 
    empresa vai aumentar sua folha de pagamento. */

    public void reajusteSalarialComSoma(){
        this.nome = Prompt.lerLinha("Informe o nome do funcionário: ");
        this.salarioFuncionario = Prompt.lerDecimal("Informe o salário do funcionário: ");
        this.salarioMinimo = Prompt.lerDecimal("Informe o salário minimo: ");
        
        
        salarioReajustado = reajusteSalarial(salarioMinimo, salarioFuncionario);

        folhaPagamento += reajuste; 

        Prompt.separador();
        Prompt.imprimir("Nome: " + nome);
        Prompt.imprimir("Reajuste de R$" + reajuste);
        Prompt.imprimir("Novo salário: R$" + salarioReajustado);
        Prompt.imprimir("O aumento na folha de pagamento é de: R$" + folhaPagamento);
        Prompt.separador();
    }
    
}

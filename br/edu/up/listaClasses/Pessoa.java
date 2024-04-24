package br.edu.up.listaClasses;
import br.edu.up.*;

public class Pessoa {
    private Integer idade;

    private String nome;
    private Character sexo;
    private Integer qtdFeminino = 0;
    private Integer qtdMasculino = 0;

    private Character saude;
    
    private Double salarioMinimo;
    private Double salarioFuncionario;
    private Double salarioReajustado;
    private Double reajuste = 0.0;
    
    private Integer horasAula;
    private Integer nivel;
    private Double folhaPagamento = 0.0;
    
    private Double kw;
    private Integer tipoConta;
    private Double calcContaLuz;

    private Double altura;
    private Double pesoIdl;

    private Character grupoRisco;

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public void maioridade(){
        if(idade < 18){
            Prompt.imprimir("Menor de idade.");
        }else{
            Prompt.imprimir("Maior de idade.");
        }
    }
    /*------------------------------------------------------------------------ */

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSexo(Character sexo){
        this.sexo = sexo;
    }

    public void qtdPorSexo(){
        if(sexo == 'f'){
            Prompt.imprimir("A " + nome + " é uma mulher.");
            qtdFeminino++;
        }else if(sexo == 'm'){
            Prompt.imprimir("O " + nome + " é um homem.");
            qtdMasculino++;
        }else{
            Prompt.imprimir("o caracter fornecido é inválido.");
        }
    }

    public  Integer getFeminino(){
        return qtdFeminino;
    }
    public Integer getMasculino(){
        return qtdMasculino;
    }
    /*------------------------------------------------------------------------ */

    public void setSaude(Character saude){
        this.saude = saude;
    }

    public void testeDeAptidão(){
        if(sexo == 'f' || idade < 18 || saude == 'n'){
            Prompt.separador();
            Prompt.imprimir("Candidato(a): " + nome + " NÃO está apto(a) ao serviço militar obrigatório");
            Prompt.separador();
        }else{
            Prompt.separador();
            Prompt.imprimir("Candidato(a): " + nome + " está apto(a) ao serviço militar obrigatório");
            Prompt.separador();
        }
    }
    /*------------------------------------------------------------------------ */

    public void setSalarioMinimo(Double salarioMinimo){
        this.salarioMinimo = salarioMinimo;
    }    

    public void setSalarioFuncionario(Double salarioFuncionario){
        this.salarioFuncionario = salarioFuncionario;
    }

    public void reajusteSalarial(){
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
    }

    public Double getSalarioReajustado(){
        return salarioReajustado;
    }

    public Double getSalarioFuncionario(){
        return salarioFuncionario;
    }
    /*------------------------------------------------------------------------ */

    public void reajusteSalarialComSoma(){
        this.nome = Prompt.lerLinha("Informe o nome do funcionário: ");
        this.salarioFuncionario = Prompt.lerDecimal("Informe o salário do funcionário: ");
        this.salarioMinimo = Prompt.lerDecimal("Informe o salário minimo: ");
        
        
        reajusteSalarial();

        folhaPagamento += reajuste; 

        Prompt.separador();
        Prompt.imprimir("Nome: " + nome);
        Prompt.imprimir("Reajuste de R$" + reajuste);
        Prompt.imprimir("Novo salário: R$" + salarioReajustado);
        Prompt.imprimir("O aumento na folha de pagamento é de: R$" + folhaPagamento);
        Prompt.separador();
    }

    public void salarioComAbono(){

        if((sexo == 'm' || sexo == 'M') && idade >= 30){
            reajuste += (salarioFuncionario + 100.00);
            Prompt.imprimir("Funcionário: " + nome + " receberá novo salário de R$" + reajuste);
        
        }else if((sexo == 'm' || sexo == 'M') && idade < 30){
            reajuste += (salarioFuncionario + 50.00);
            Prompt.imprimir("Funcionário: " + nome + " receberá novo salário de R$" + reajuste);

        }else if((sexo == 'f' || sexo == 'F') && idade >= 30){
            reajuste += (salarioFuncionario + 200.00);
            Prompt.imprimir("Funcionário: " + nome + " receberá novo salário de R$" + reajuste);

        }else if((sexo == 'f' || sexo == 'F') && idade < 30){
            reajuste += (salarioFuncionario + 80.00);
            Prompt.imprimir("Funcionário: " + nome + " receberá novo salário de R$" + reajuste);

        }
        
    }

    public Character getSexo(){
        return sexo;
    }
    /*------------------------------------------------------------------------ */

    public void setHorasAula(Integer horasAula){
        this.horasAula = horasAula;
    }

    public void setNivel(Integer nivel){
        this.nivel = nivel;
    }

    public void salarioHoraAula(){
        if(nivel == 1){
            salarioFuncionario = horasAula * 12.00;
            Prompt.imprimir("Salário Bruto: R$" + salarioFuncionario); 
        }else if(nivel == 2){
            salarioFuncionario = horasAula * 17.00;
            Prompt.imprimir("Salário Bruto: R$" + salarioFuncionario); 
        }else if(nivel == 3){
            salarioFuncionario = horasAula * 25.00;
            Prompt.imprimir("Salário Bruto: R$" + salarioFuncionario); 
        }
        
    }
    /*------------------------------------------------------------------------ */

    public void classificacaoNadador(){
        if(idade >= 5 && idade <= 7){
            Prompt.imprimir("O nadador está na categoria Infantil A.");

        }else if(idade >= 8 && idade <= 10){
            Prompt.imprimir("O nadador está na categoria Infantil B.");

        }else if(idade >= 11 && idade <= 13){
            Prompt.imprimir("O nadador está na categoria Juvenil A.");

        }else if(idade >= 14 && idade <= 17){
            Prompt.imprimir("O nadador está na categoria Juvenil B.");

        }else if(idade >= 18 && idade <= 25){
            Prompt.imprimir("O nadador está na categoria Sênior.");

        }else{
            Prompt.imprimir("idade fora da faixa etária.");
        }

    }
    /*------------------------------------------------------------------------ */

    public void setKw(Double kw){
        this.kw = kw;
    }

    public void setTipoConta(Integer tipoConta){
        this.tipoConta = tipoConta;
    }

    public void contaLuz(){
        if(tipoConta == 1){
            calcContaLuz = kw * 0.60;
            Prompt.imprimir("Conta: R$" + calcContaLuz);
        }else if(tipoConta == 2){
            calcContaLuz = kw * 0.48;
            Prompt.imprimir("Conta: R$" + calcContaLuz);
        }if(tipoConta == 3){
            calcContaLuz = kw * 1.29;
            Prompt.imprimir("Conta: R$" + calcContaLuz);
        }
    }
    /*------------------------------------------------------------------------ */

    public void setAltura(Double altura){
        this.altura = altura;
    }

    public void pesoIdeal(){
        if((sexo == 'm' || sexo == 'M') && altura > 1.70 && idade <= 20){
            pesoIdl = (72.7 * altura) - 58;
            Prompt.imprimir("Peso Ideal: " + pesoIdl);
            
        }else if((sexo == 'm' || sexo == 'M') && altura > 1.70 && idade > 20 && idade <= 39){
            pesoIdl = (72.7 * altura) - 53;
            Prompt.imprimir("Peso Ideal: " + pesoIdl);

        }else if((sexo == 'm' || sexo == 'M') && altura > 1.70 && idade >= 40){
            pesoIdl = (72.7 * altura) - 45;
            Prompt.imprimir("Peso Ideal: " + pesoIdl);

        }else if((sexo == 'm' || sexo == 'M') && altura <= 1.70 && idade <= 40){
            pesoIdl = (72.7 * altura) - 50;
            Prompt.imprimir("Peso Ideal: " + pesoIdl);

        }else if((sexo == 'm' || sexo == 'M') && altura <= 1.70 && idade > 40){
            pesoIdl = (72.7 * altura) - 58;
            Prompt.imprimir("Peso Ideal: " + pesoIdl);

        }else if((sexo == 'f' || sexo == 'F') && altura > 1.50){
            pesoIdl = (62.1 * altura) - 44.7;
            Prompt.imprimir("Peso Ideal: " + pesoIdl);

        }else if((sexo == 'f' || sexo == 'F') && altura <= 1.50 && idade >= 35){
            pesoIdl = (62.1 * altura) - 45;
            Prompt.imprimir("Peso Ideal: " + pesoIdl);

        }else if((sexo == 'f' || sexo == 'F') && altura > 1.50 && idade < 35){
            pesoIdl = (62.1 * altura) - 49;
            Prompt.imprimir("Peso Ideal: " + pesoIdl);
            
        }
    }
    /*------------------------------------------------------------------------ */

    public void setGrupoRisco(Character grupoRisco){
        this.grupoRisco = grupoRisco;
    }

    public Integer getIdade(){
        return idade;
    }

    public void categoriaSeguro(){
        if(idade >= 17 && idade <= 20 && grupoRisco == 'b'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Baixo.");
            Prompt.imprimir("Categoria: 1.");
            Prompt.separador();
        }else if(idade >= 17 && idade <= 20 && grupoRisco == 'm'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Médio.");
            Prompt.imprimir("Categoria: 2.");
            Prompt.separador();
        }else if(idade >= 17 && idade <= 20 && grupoRisco == 'a'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Alto.");
            Prompt.imprimir("Categoria: 3.");
            Prompt.separador();
        }else if(idade >= 21 && idade <= 24 && grupoRisco == 'b'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Baixo.");
            Prompt.imprimir("Categoria: 2.");
            Prompt.separador();
        }else if(idade >= 21 && idade <= 24 && grupoRisco == 'm'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Médio.");
            Prompt.imprimir("Categoria: 3.");
            Prompt.separador();
        }else if(idade >= 21 && idade <= 24 && grupoRisco == 'a'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Alto.");
            Prompt.imprimir("Categoria: 4.");
            Prompt.separador();
        }else if(idade >= 25 && idade <= 34 && grupoRisco == 'b'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Baixo.");
            Prompt.imprimir("Categoria: 3.");
            Prompt.separador();
        }else if(idade >= 25 && idade <= 34 && grupoRisco == 'm'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Médio.");
            Prompt.imprimir("Categoria: 4.");
            Prompt.separador();
        }else if(idade >= 25 && idade <= 34 && grupoRisco == 'a'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Alto.");
            Prompt.imprimir("Categoria: 5.");
            Prompt.separador();
        }else if(idade >= 35 && idade <= 64 && grupoRisco == 'b'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Baixo.");
            Prompt.imprimir("Categoria: 4.");
            Prompt.separador();
        }else if(idade >= 35 && idade <= 64 && grupoRisco == 'm'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Médio.");
            Prompt.imprimir("Categoria: 5.");
            Prompt.separador();
        }else if(idade >= 35 && idade <= 64 && grupoRisco == 'a'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Alto.");
            Prompt.imprimir("Categoria: 6.");
            Prompt.separador();
        }else if(idade >= 65 && idade <= 70 && grupoRisco == 'b'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Baixo.");
            Prompt.imprimir("Categoria: 7.");
            Prompt.separador();
        }else if(idade >= 65 && idade <= 70 && grupoRisco == 'm'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Médio.");
            Prompt.imprimir("Categoria: 8.");
            Prompt.separador();
        }else if(idade >= 65 && idade <= 70 && grupoRisco == 'a'){
            Prompt.separador();
            Prompt.imprimir("Nome do cliente: " + nome);
            Prompt.imprimir("Idade: " + idade);
            Prompt.imprimir("Grupo de risco: Alto.");
            Prompt.imprimir("Categoria: 9.");
            Prompt.separador();
        }
    }
}

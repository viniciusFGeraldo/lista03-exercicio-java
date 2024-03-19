package utilidades;

public class Pessoa {

    public Integer idade;
    public String nome;
    public Character sexo;
    public Character saude;
    public Double altura;
    public Integer qtdFeminino = 0;
    public Integer qtdMasculino = 0;
    public Double kw;
    public Integer tipoConta;
    public Double calcContaLuz;
    public Double pesoIdl;

    public void maioridade(){
        if(idade < 18){
            Prompt.imprimir("Menor de idade.");
        }else{
            Prompt.imprimir("Maior de idade.");
        }
    }

    /*------------------------------------------------------------------------ */

    public void qtdPorSexo(Character sexo, String nome){
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

    public  Integer pegarFeminino(){
        return qtdFeminino;
    }
    public Integer pegarMasculino(){
        return qtdMasculino;
    }

    /*------------------------------------------------------------------------ */

    public void testeDeAptidão(String nome, Character sexo, Integer idade, Character saude){
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

    /*22. Faça um programa que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de
         luz segue a tabela abaixo:
        Tipo de Cliente Valor do KW/h
        1 (Residência) 0,60
        2 (Comércio) 0,48
        3 (Indústria) 1,29 */

    public void contaLuz(Double kw, Integer tipoConta){
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

    /*23. Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. Calcule e mostre 
        nome e o seu peso ideal de acordo com as seguintes características da pessoa: */

    public void pesoIdeal(String nome, Character sexo, Double altura, Integer idade){
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

}

package utilidades;

public class Pessoa {

    public Integer idade;
    public String nome;
    public Character sexo;
    public Integer qtdFeminino = 0;
    public Integer qtdMasculino = 0;

    public void maioridade(){
        if(idade < 18){
            Prompt.imprimir("Menor de idade.");
        }else{
            Prompt.imprimir("Maior de idade.");
        }
    }

    /*11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é 
        homem ou mulher. No final informe total de homens e de mulheres. */

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
}

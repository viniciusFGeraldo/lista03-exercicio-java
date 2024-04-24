package br.edu.up.listaClasses;
import br.edu.up.*;

public class Aluno {
    private String nome;
    private Double nota1;
    private Double nota2;
    private Double nota3;

    private Integer pesoLaboratorio = 2;
    private Integer pesoAvSemestral = 3;
    private Integer pesoExame = 5;

    private Integer matricula;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNota1(Double nota1){
        this.nota1 = nota1;
    }

    public void setNota2(Double nota2){
        this.nota2 = nota2;
    }

    public void setNota3(Double nota3){
        this.nota3 = nota3;
    }

    public String getNome(){
        return nome;
    }

    public Double mediaAritmetica(){
        Double media = (nota1 + nota2 + nota3) / 3; 
        return media;
    }
    /*------------------------------------------------------------------------ */

    public void mediaPonderada(){
        Double mediaPonderad = ((nota1 * pesoLaboratorio) + (nota2 * pesoAvSemestral) + (nota3 * pesoExame)) / (pesoLaboratorio + pesoAvSemestral + pesoExame);
        Prompt.imprimir("Média Ponderada: " + mediaPonderad);
    }
    /*------------------------------------------------------------------------ */

    public void setMatricula(Integer matricula){
        this.matricula = matricula;
    }

    public void classificacaoBaseadaEmMedia(Double media){
        if(media > 8 && media <=10){
            Prompt.imprimir("Aluno: " + nome + " - matricula: " + matricula + " - Nota Final: " + media + " - Classificação: A");

        }else if(media > 7 && media <= 8){
            Prompt.imprimir("Aluno: " + nome + " - matricula: " + matricula + " - Nota Final: " + media + " - Classificação: B");

        }else if(media > 6 && media <= 7){
            Prompt.imprimir("Aluno: " + nome + " - matricula: " + matricula + " - Nota Final: " + media + " - Classificação: C");

        }else if(media > 5 && media <= 6){
            Prompt.imprimir("Aluno: " + nome + " - matricula: " + matricula + " - Nota Final: " + media + " - Classificação: D");

        }else if(media >= 0 && media <= 5){
            Prompt.imprimir("Aluno: " + nome + " - matricula: " + matricula + " - Nota Final: " + media + " - Classificação: D");
            
        }
    }
}

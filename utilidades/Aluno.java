package utilidades;

public class Aluno {
    public String nome;
    public Integer matricula;
    public Double nota1;
    public Double nota2;
    public Double nota3;
    public Integer pesoLaboratorio = 2;
    public Integer pesoAvSemestral = 3;
    public Integer pesoExame = 5;
    public Double mediaPonderada;


    public Double mediaAritmetica(Double nota1,Double nota2,Double nota3){
        Double media = (nota1 + nota2 + nota3) / 3; 
        return media;
    }


    public void mediaPonderada(Double nota1, Double nota2, Double nota3){
        mediaPonderada = ((nota1 * pesoLaboratorio) + (nota2 * pesoAvSemestral) + (nota3 * pesoExame)) / (pesoLaboratorio + pesoAvSemestral + pesoExame);
        Prompt.imprimir("Média Ponderada: " + mediaPonderada);
    }

    /*25. Dado o nome de um estudante, com o respectivo número de matrícula e as três notas acima mencionadas,
         desenvolva um programa para calcular a nota final e a classificação de cada estudante. 
         A classificação é dada conforme a lista abaixo:
        Nota Final Classificação
        [8,10] A
        [7,8] B 
        [6,7] C
        [5,6] D
        [0,5] R
        Imprima o nome do estudante, com o seu número, nota final e classificação.*/

    public void classificacaoBaseadaEmMedia(String nome, Integer matricula,Double media){
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

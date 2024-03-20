package utilidades;

public class Aluno {
    public String nome;
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
}

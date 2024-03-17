public class Aluno {
    String nome;
    Double nota1;
    Double nota2;
    Double nota3;


    public double mediaAritmetica(Double nota1,Double nota2,Double nota3){
        Double media = (nota1 + nota2 + nota3) / 3; 
        return media;
    }
}

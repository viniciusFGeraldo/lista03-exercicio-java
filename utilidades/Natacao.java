package utilidades;

public class Natacao {
    /*21. Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
        Infantil A = 5 - 7 anos
        Infantil B = 8 - 10 anos
        juvenil A = 11- 13 anos
        juvenil B = 14 - 17 anos
        Sênior = 18 - 25 anos
        Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado. */
    
    public Integer idade;

    public void classificacaoNadador(Integer idade){
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
}

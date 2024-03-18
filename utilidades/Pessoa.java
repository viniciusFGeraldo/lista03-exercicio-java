package utilidades;

public class Pessoa {

    public Integer idade;
    public String nome;
    public Character sexo;
    public Character saude;
    public Integer qtdFeminino = 0;
    public Integer qtdMasculino = 0;

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

}

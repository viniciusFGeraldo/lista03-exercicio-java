package utilidades;

public class Seguradora {
    /*26. Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado. 
        Somente pessoas com pelo menos 17 anos e não mais que 70 anos podem adquirir apólices de 
        seguro. Quanto às classes de ocupações, foram definidos três grupos de risco: baixo, médio e alto. 
        A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco. Dados nome, 
        idade e grupo de risco de um pretendente, determinar e imprimir seus dados e categoria. Caso a 
        idade não esteja na faixa necessária, imprimir uma mensagem informando que ele não se enquadra 
        em nenhuma das categorias ofertadas.*/

    public Integer idade;
    public String nome;
    public Character grupoRisco;

    public void categoriaSeguro(String nome, Integer idade, Character grupoRisco){
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

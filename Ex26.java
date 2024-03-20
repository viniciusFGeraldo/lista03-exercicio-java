import utilidades.*;


public class Ex26 {
    public static void executar(){
        /*26. Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado. 
        Somente pessoas com pelo menos 17 anos e não mais que 70 anos podem adquirir apólices de 
        seguro. Quanto às classes de ocupações, foram definidos três grupos de risco: baixo, médio e alto. 
        A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco. Dados nome, 
        idade e grupo de risco de um pretendente, determinar e imprimir seus dados e categoria. Caso a 
        idade não esteja na faixa necessária, imprimir uma mensagem informando que ele não se enquadra 
        em nenhuma das categorias ofertadas.*/

        Seguradora cliente1 = new Seguradora();
        cliente1.nome = Prompt.lerLinha("Informe o nome do cliente: ");
        cliente1.idade = Prompt.lerInteiro("Informe a idade do cliente: ");
        
        if(cliente1.idade < 17 || cliente1.idade > 70){
            Prompt.imprimir("Este cliente não possui idade adequada para apólices de seguro.");
        }else{
            cliente1.grupoRisco = Prompt.lerCaractere("Informe o grupo de risco(b-baixo, m-médio, a-alto): ");
            cliente1.categoriaSeguro(cliente1.nome, cliente1.idade, cliente1.grupoRisco);
        }

    }    
}

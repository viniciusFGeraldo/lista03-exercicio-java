public class Intervalo {

    Integer[] num = new Integer[5];
    Integer contador = 0;

    public void lerNumeros(){
        for(int i = 0;i < 5;i++) {
            num[i] = Prompt.lerInteiro("Informe o " + (i + 1) + "° valor: ");
        }
    }

    public Integer qtdNoIntervalo(){
        for (Integer elemento : num) {
            if(elemento >=10 && elemento <= 150){
                contador++;
            }
        }
        return contador;
    }
    
}

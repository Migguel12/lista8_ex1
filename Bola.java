public class Bola {
    
    private String cor;
    double circunferencia;
    String material = "Borracha";

    Bola(String cor){
        this.cor = cor;
    }

    public void trocaCor(String novaCor){

        cor = novaCor;
    }

    public String mostraCor(){
        return cor;
    }
}

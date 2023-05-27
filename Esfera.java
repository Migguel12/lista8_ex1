public class Esfera extends Bola {
    double peso;
    String densidade;

    Esfera(String cor, String densidade) {
        super(cor);
        material = "Chumbo";
        this.densidade = densidade;
    }
    
}

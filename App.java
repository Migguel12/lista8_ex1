public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Bola bola1 = new Bola("Azul");
        Esfera bolaDeCanhao = new Esfera("Preta", "Soft");

        bola1.trocaCor("Vermelho");

        System.out.println(bola1.material);
        System.out.println(bola1.mostraCor());
        System.out.println("");

        System.out.println(bolaDeCanhao.mostraCor());
        System.out.println(bolaDeCanhao.material);
        System.out.println((bolaDeCanhao.densidade));
    }
}

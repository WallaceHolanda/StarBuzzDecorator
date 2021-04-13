import pedido.Bebida;
import pedido.CafeBlend;
//import pedido.CafeTradicional;
import pedido.Leite;
import pedido.Chocolate;

public class App {
    public static void main(String[] args) throws Exception {
        Bebida minhaBebida = new CafeBlend();
        minhaBebida = new Leite(minhaBebida);
        minhaBebida = new Chocolate(minhaBebida);

        System.out.println("==========================");

        System.out.println("Bebida: " + minhaBebida.getDescricao());
        System.out.println("Preço R$: " + minhaBebida.calcularPreco());

        System.out.println("==========================");


    }
}

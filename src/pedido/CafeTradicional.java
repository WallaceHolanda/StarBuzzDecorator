package pedido;

public class CafeTradicional extends Bebida {
    
    public CafeTradicional(){
        descricao = "Café Tradicional";
    }

    public float calcularPreco(){
        return (float) 2.0;
    }

}

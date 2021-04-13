package pedido;

public class Leite extends AdicionalDecorator{
    Bebida bebida;

    public Leite(Bebida b){
        this.bebida = b;
    }

    public String getDescricao(){
        return bebida.getDescricao() + ", Leite";
    }

    public float calcularPreco(){
        return (float) (2.0 + bebida.calcularPreco());
    }

}

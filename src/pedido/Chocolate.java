package pedido;

public class Chocolate extends AdicionalDecorator{
    Bebida bebida;

    public Chocolate(Bebida b){
        this.bebida = b;
    }
    
    public String getDescricao(){
        return bebida.getDescricao() + ", Chocolate";
    }

    public float calcularPreco(){
        return (float) (bebida.calcularPreco() + 3.0);
    }

}

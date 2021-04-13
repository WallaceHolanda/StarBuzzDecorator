package pedido;

public abstract class Bebida {
    String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String desc) {
        this.descricao = desc;
    }

    public abstract float calcularPreco();

}

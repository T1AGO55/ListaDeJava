public class PedidoDTO {
    private int id;
    private double valorTotal;

    public PedidoDTO(int id, double valorTotal) {
        this.id = id;
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getId() {
        return id;
    }
}

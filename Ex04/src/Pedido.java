public class Pedido {
    private int id;
    private String cliente;
    private double ValorTotal;

    public Pedido(int id, String cliente, double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.ValorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public String getCliente() {
        return cliente;
    }
}

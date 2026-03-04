public abstract class ItemLoja implements Vendavel{
    protected int id;
    protected String nome;
    protected double preco;
    public ItemLoja(int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}

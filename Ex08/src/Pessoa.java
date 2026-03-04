public class Pessoa implements Descritivel{
    private String nome;
    private String descricao;

    public Pessoa(String nome,String descricao){
        this.nome = nome;
        this.descricao=descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}

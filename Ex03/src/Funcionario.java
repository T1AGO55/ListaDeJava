public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    public Funcionario(String nome,int idade,String cargo, double salario) {
        super(nome,idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }
}

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }
}

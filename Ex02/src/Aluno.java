public class Aluno {
    private String nome;
    private double nota;
    private int idade;

    public Aluno(String nome, double nota, int idade) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }
}


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();


        alunos.add(new Aluno("Claudio",8,18));
        alunos.add(new Aluno("Fernando",10,33));
        alunos.add(new Aluno("Charles",10,20));
        alunos.add(new Aluno("Montagne",5,17));

        List<Aluno> alunosAcimaMedia = alunos.stream().filter(a -> a.getNota()>= 7).sorted(Comparator.comparing(Aluno::getNota).reversed().thenComparing(Aluno::getIdade)).toList();


        List<String> listaAlunos = alunosAcimaMedia.stream().map(Aluno::getNome).toList();

        listaAlunos.forEach(System.out::println);


    }
}
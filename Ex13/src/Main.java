import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Lobo mal","Tiago",120));
        livros.add(new Livro("Tres Porquinhos","Nicolas",50));
        livros.add(new Livro("Arcanjo","Tiago",200));
        livros.add(new Livro("Minecraft: Aether","Deniel",450));


        List<Livro> precoCrescente = livros.stream().sorted(Comparator.comparing(Livro::getPreco)).toList();
        List<Livro> nomeAlfabetico = livros.stream().sorted(Comparator.comparing(Livro::getAutor)).toList();


        System.out.println("====================================");
        precoCrescente.forEach(p-> System.out.println("nome: " + p.getTitulo() + " : Valor: " + p.getPreco()));
        System.out.println("====================================");


        System.out.println("\n\n====================================");
        nomeAlfabetico.forEach(p-> System.out.println("nome: " + p.getTitulo() + " : Autor: " + p.getAutor()));
        System.out.println("====================================");


        System.out.println("\n\n====================================");
        List<String>titulosLivro = livros.stream().map(Livro::getTitulo).toList();
        titulosLivro.forEach(titulos -> System.out.println("Titulo: "+titulos));
        System.out.println("====================================");

        String titulosJuntos = titulosLivro.stream().collect(Collectors.joining(" | "));

        System.out.println("\n\n====================================");
        System.out.println(titulosJuntos);
        System.out.println("====================================");

    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Fatima", "VIP"));
        pessoas.add(new Pessoa("Lucas", "Novo cliente"));
        pessoas.add(new Pessoa("Mariana", "Assinante premium"));
        pessoas.add(new Pessoa("Carla", "VIP"));
        pessoas.add(new Pessoa("João", "Assinante básico"));
        pessoas.add(new Pessoa("Rafael", "Novo cliente"));

        List<String> listaDescricao = pessoas.stream().map(Pessoa::getDescricao).toList();
        System.out.println("====================================");
        System.out.println("Listando todas as Descricoes:");
        listaDescricao.forEach(System.out::println);
        System.out.println("====================================\n\n");

        String listaDescricaoConcatenada = listaDescricao.stream().collect(Collectors.joining(", "));

        System.out.println("====================================");
        System.out.println("Descricao de clientes separadas por virgula: ");
        System.out.println(listaDescricaoConcatenada);
        System.out.println("====================================");



    }
}
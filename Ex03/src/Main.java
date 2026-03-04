import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Fernando", 20, "Estagiario", 800));
        funcionarios.add(new Funcionario("Lucas", 28, "Analista", 2500));
        funcionarios.add(new Funcionario("Mariana", 32, "Coordenadora", 4500));
        funcionarios.add(new Funcionario("Carla", 25, "Assistente", 1800));
        funcionarios.add(new Funcionario("Rafael", 30, "Desenvolvedor", 3200));
        funcionarios.add(new Funcionario("Beatriz", 27, "Analista", 2800));
        funcionarios.add(new Funcionario("João", 35, "Gerente", 6000));
        funcionarios.add(new Funcionario("Sofia", 24, "Estagiario", 1200));
        funcionarios.add(new Funcionario("Pedro", 29, "Desenvolvedor", 3500));
        funcionarios.add(new Funcionario("Amanda", 31, "Coordenadora", 5000));


        Map<String, List<Funcionario>> funcionarioCargo = funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getCargo));

        List<String> funcionariosNomes = funcionarios.stream().map(Funcionario::getNome).toList();

        Map<String, Double> funcionariosMediaCargo = funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getCargo, Collectors.averagingDouble(Funcionario::getSalario)));
        System.out.println("=========================================");
        System.out.println("Funcionarios por cargo:");
        funcionarioCargo.forEach((cargo, lista) -> {
            System.out.println("=========================================");
            System.out.println("Cargo: " + cargo);
            lista.forEach(l -> System.out.println("Nome: " + l.getNome()));
        });
        System.out.println("=========================================");
        System.out.println("\n\n=========================================");
        System.out.println("Lista de Nomes: ");
        funcionariosNomes.forEach(System.out::println);
        System.out.println("=========================================");


        funcionariosMediaCargo.forEach((cargo, media) -> {
            System.out.println("=========================================");
            System.out.println("Cargo: " + cargo);
            System.out.println("Media Salarial do Cargo: R$" + media);
        });
        System.out.println("=========================================");


    }
}

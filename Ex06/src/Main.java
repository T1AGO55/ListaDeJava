import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Fernando", 40));
        clientes.add(new Cliente("Lucas", 28));
        clientes.add(new Cliente("Mariana", 32));
        clientes.add(new Cliente("Carla", 25));
        clientes.add(new Cliente("João", 35));


        List<Cliente> clientesMaior18 = clientes.stream().filter(c -> c.getIdade() > 18).toList();
        System.out.println("====================================");
        System.out.println("Clientes acima de 18 anos:");
        clientesMaior18.forEach(c -> System.out.println("Nome: " + c.getNome() + "| Idade: " + c.getIdade()));
        System.out.println("====================================");

        long clientesMaior30 = clientes.stream().filter(c -> c.getIdade() > 30).count();
        System.out.println("\n\n====================================");
        System.out.println("Quatidade de clientes que possuem mais de 30 anos: " + clientesMaior30);
        System.out.println("====================================");

        List<String> listaNome = clientes.stream().map(Cliente::getNome).toList();
        System.out.println("\n\n====================================");
        listaNome.forEach(System.out::println);
        System.out.println("====================================");
    }
}
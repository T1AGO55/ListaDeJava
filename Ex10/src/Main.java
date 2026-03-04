import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Vendedor> vendedores = new ArrayList<>();

        vendedores.add(new Vendedor("Cleiton", 30000));
        vendedores.add(new Vendedor("katia", 10000));
        vendedores.add(new Vendedor("Sandro", 15000));
        vendedores.add(new Vendedor("Felipe", 50000));

        List<Vendedor> vendedoresmais10K = vendedores.stream().filter(v -> v.getTotalVendas()> 10000).toList();

        Vendedor vendedorMax = vendedoresmais10K.stream().collect(Collectors.maxBy(Comparator.comparing(Vendedor::getTotalVendas))).orElse(null);

        Vendedor vendedorMin = vendedoresmais10K.stream().collect(Collectors.minBy(Comparator.comparing(Vendedor::getTotalVendas))).orElse(null);



        List<String> vendedoresNomes = vendedoresmais10K.stream().map(Vendedor::getNome).toList();

        vendedoresNomes.forEach(v -> System.out.println("Nome: "+ v) );
        System.out.println("Vendedor com Maior Vendas: "+ vendedorMax.getNome());
        System.out.println("Vendedor com Menor Vendas: "+ vendedorMin.getNome());



    }
}
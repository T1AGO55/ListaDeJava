import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Esponja", 40));
        produtos.add(new Produto("Sabonete", 20));
        produtos.add(new Produto("Detergente", 35));
        produtos.add(new Produto("Pano de Prato", 15));
        produtos.add(new Produto("Esponja de Aço", 50));
        produtos.add(new Produto("Limpa Vidros", 30));
        produtos.add(new Produto("Limpador Multiuso", 45));


        List<Double> listaPreco = produtos.stream().map(Produto::getPreco).toList();
        System.out.println("===============================");
        System.out.println("Lista do preco dos produtos:");
        listaPreco.forEach(System.out::println);
        System.out.println("===============================");

        double somaProdutos = produtos.stream().collect(Collectors.summingDouble(Produto::getPreco));
        System.out.println("\n===============================");
        System.out.println("Soma dos produtos: "+ somaProdutos);
        System.out.println("===============================");

        double mediaProdutos = produtos.stream().collect(Collectors.averagingDouble(Produto::getPreco));
        System.out.println("\n===============================");
        System.out.println("Media dos produtos: "+ mediaProdutos);
        System.out.println("===============================");









    }
}
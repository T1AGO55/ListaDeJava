import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Esponja", 40));
        produtos.add(new Produto("Sabonete", 20));
        produtos.add(new Produto("Detergente", 35));
        produtos.add(new Produto("Pano de Prato", 15));
        produtos.add(new Produto("Esponja de Aço", 50));


        Produto produtoCaro = produtos.stream().collect(Collectors.maxBy(Comparator.comparing(Produto::getPreco))).orElse(null);
        Produto produtoBarato = produtos.stream().collect(Collectors.minBy(Comparator.comparing(Produto::getPreco))).orElse(null);
        System.out.println("====================================");
        System.out.println("Produto mais caro: " + produtoCaro.getNome() + "| Preco: R$" + produtoCaro.getPreco());
        System.out.println("Produto mais barato: " + produtoBarato.getNome() + "| Preco: R$" + produtoBarato.getPreco());
        System.out.println("====================================\n\n");

        List<String> listaProdutos = produtos.stream().map(Produto::getNome).toList();
        System.out.println("====================================");
        System.out.println("Lista com apenas nomes dos produtos:");
        listaProdutos.forEach(System.out::println);
        System.out.println("====================================");


    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto(1, "Chinelo", 49));
        produtos.add(new Produto(2, "Esponja", 40));
        produtos.add(new Produto(3, "Sabonete", 20));
        produtos.add(new Produto(4, "Detergente", 35));
        produtos.add(new Produto(5, "Pano de Prato", 15));

        Map<Integer, Produto> produtoMap = produtos.stream().collect(Collectors.toMap(Produto::getId, p->p));

        produtoMap.forEach((i,p)->{
            System.out.println("ID: "+i+ " |Produto: "+p.getNome());
        });





    }
}
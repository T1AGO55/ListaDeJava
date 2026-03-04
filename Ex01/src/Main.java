import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        ArrayList<ItemLoja> items = new ArrayList<>();

        items.add(new Eletronico(1,"Tablet",400));
        items.add(new Eletronico(2,"Fone com fio",120));
        items.add(new Roupas(1,"Camiseta Polo",250));
        items.add(new Roupas(2,"Calca",50));

        List<ItemLoja> items100mais = items.stream().filter(i -> i.getPreco()>100).toList();

        List<String> itemsDescricao = items100mais.stream().map(ItemLoja::getNome).toList();


        itemsDescricao.forEach(nome-> System.out.println("Nome: " + nome) );






    }
}
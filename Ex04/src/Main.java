import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, "Fernando", 800));
        pedidos.add(new Pedido(2, "Lucas", 2500));
        pedidos.add(new Pedido(3, "Mariana", 4500));


        List<PedidoDTO> listaDTO = pedidos.stream().map(p-> new PedidoDTO(p.getId(),p.getValorTotal())).toList();

        listaDTO.forEach(p -> System.out.println("ID: "+ p.getId()+ "| Valor Total: "+ p.getValorTotal()));



    }
}
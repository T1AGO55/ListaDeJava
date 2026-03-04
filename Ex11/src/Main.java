import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new Pedido(1, "Camile", "Pago"));
        pedidos.add(new Pedido(2, "Lucas", "Pendente"));
        pedidos.add(new Pedido(3, "Mariana", "Pago"));
        pedidos.add(new Pedido(4, "Fernando", "Pendente"));
        pedidos.add(new Pedido(5, "João", "Cancelado"));
        pedidos.add(new Pedido(6, "Cidney", "Cancelado"));


        List<Pedido> pedidosPagos = pedidos.stream().filter(p->p.getStatus().equals("Pago")).toList();

        System.out.println("====================================");
        pedidosPagos.forEach(p-> System.out.println("ID: "+p.getId()+ "|Cliente: "+p.getCliente()+ "|Status: "+p.getStatus()));
        System.out.println("====================================\n\n");

        Map<String, List<Pedido>> pedidosSeparadoStatus = pedidos.stream().collect(Collectors.groupingBy(Pedido::getStatus));
        pedidosSeparadoStatus.forEach((status,lista)->{
            System.out.println("====================================");
            System.out.println("Status: "+status);
            lista.forEach(p-> System.out.println("ID: "+p.getId()+ "|Cliente: "+p.getCliente()+ "|Status: "+p.getStatus()));
        });
        System.out.println("====================================");



    }
}
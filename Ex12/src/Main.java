import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Fernando",3000,"TI"));
        funcionarios.add(new Funcionario("Joao",2500,"RH"));
        funcionarios.add(new Funcionario("Tatiana",1900,"DESIGNER"));
        funcionarios.add(new Funcionario("Gean",4000,"TI"));
        funcionarios.add(new Funcionario("Paulo",10000,"TI"));

        List<Funcionario> funcionariosTIMaisBonus = funcionarios.stream().filter(f->f.getDepartamento().equals("TI")).map(f-> new Funcionario(f.getNome(),f.getSalario()*1.1,f.getDepartamento())).toList();

        System.out.println("====================================");
        funcionariosTIMaisBonus.forEach(f-> System.out.println("Nome: "+f.getNome()+ "| Salario: R$"+f.getSalario()+"|Departamento: "+f.getDepartamento()));
        System.out.println("====================================\n\n");


        Map<String,Double> listatotalsalarioporDepartamento = funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getDepartamento,Collectors.summingDouble(Funcionario::getSalario)));
        listatotalsalarioporDepartamento.forEach((depart,salario)->{
                    System.out.println("====================================");
                    System.out.println("Departamento: "+depart);
                    System.out.println("Soma dos salario: R$"+salario);
                });
        System.out.println("====================================");





    }
}
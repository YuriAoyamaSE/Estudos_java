package heranca;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setNome("Márcio");
        v.setSalario(1000.0f);
        v.setCpf("000000000");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(450);
        
        System.out.println("O salário do vendedor é: " + v.calcularSalario());
        
        Motorista m = new Motorista();
        v.setNome("Lucas");
        v.setSalario(2500.0f);
        v.setCpf("111111111111");
        v.setDataNascimento(new Date());
        
    }
}

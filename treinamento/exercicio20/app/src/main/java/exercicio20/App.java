package exercicio20;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float porcentagemDesconto = 0.0f;
        int totalCarros = 0;
        int totalCarrosSeminovos = 0;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        char desejaRepetir = 's';
        
        while (desejaRepetir == 's' || desejaRepetir == 'S'){
            System.out.println("Digite o ano de fabricação do veículo: ");
            anoFabricacao = leitor.nextInt();
            System.out.println("Digite o valor do veículo: ");
            valorCarro = leitor.nextFloat();
            
            if (anoFabricacao <= 2000){
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSeminovos++;
            }
            totalCarros++;
            
            valorDesconto = valorCarro * porcentagemDesconto;
            valorPagar = valorCarro - valorDesconto;
            
            System.out.println("O valor do desconto foi de: " + valorDesconto);
            System.out.println("O valor a ser pago é de: " + valorPagar);
            
            System.out.println("Desejarepetir: (s/n)");
            desejaRepetir = leitor.next().charAt(0);
        }
        System.out.println("Total de seminovos: " + totalCarrosSeminovos);
        System.out.println("Total de veículos: " + totalCarros);
        
    }
}

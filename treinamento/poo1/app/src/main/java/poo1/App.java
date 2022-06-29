package poo1;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Pessoa objetoPessoa = new Pessoa(76.0f,1.75f);
/*        
        Scanner leitor = new Scanner(System.in);        
        System.out.println("Digite o peso da pessoa: ");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite a altura da pessoa: ");
        objetoPessoa.setAltura(leitor.nextFloat());
 */      
        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}

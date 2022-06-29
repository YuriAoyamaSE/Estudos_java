package ExercicioQuinze;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int numero;
                
        Scanner leitorScanner = new Scanner(System.in);
        
        numero = leitorScanner.nextInt();
        
        if (numero > 100 && numero < 200){
            System.out.println("Número está entre 100 e 200");
        } else {
            System.out.println("Número não está entre 100 e 200");
        }
        
    }
}

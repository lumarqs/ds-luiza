
package ex8;
import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int n = entrada.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }
    
}


package ex7;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado (entre 1 e 20): ");
        int lado = scanner.nextInt();

        if (lado < 1 || lado > 20) {
            System.out.println("O tamanho deve estar entre 1 e 20.");
        } else {
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

        scanner.close();
    }
}

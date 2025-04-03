package ex5;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("Insira 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            nums[i] = entrada.nextInt();
        }


        int maiorNum1 = nums[0];
        int maiorNum2 = nums[1];


        if (maiorNum2 > maiorNum1) {
            int temp = maiorNum1;
            maiorNum1 = maiorNum2;
            maiorNum2 = temp;
        }


        for (int i = 2; i < 10; i++) {
            if (nums[i] > maiorNum1) {
                maiorNum2 = maiorNum1;
                maiorNum1 = nums[i];
            } else if (nums[i] > maiorNum2 && nums[i] != maiorNum1) {
                maiorNum2 = nums[i];
            }
        }

        if (maiorNum1 == maiorNum2) {
            System.out.println("Todos os números são iguais ou não há um segundo maior distinto.");
        } else {
            System.out.println("Os dois maiores numeros sao: " + maiorNum1 + " e " + maiorNum2);
        }

        entrada.close();
    }
}

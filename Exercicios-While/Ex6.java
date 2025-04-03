package ex6;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("Insira 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            nums[i] = entrada.nextInt();
        }

        int maiorNum = nums[0];

        for (int num : nums) {
            if (num > maiorNum) { 
                maiorNum = num;
            }
        }

        System.out.println("O maior numero e: " + maiorNum);
        entrada.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;
import java.util.Scanner;
public class Ex3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escolha um numero: ");
        int n1 = entrada.nextInt();
            System.out.println("Numeros impares de 1 ate o numero selecionado");
        for (int i = 1; i <= n1; i ++){
                if (i % 2 != 0){
                    System.out.println(i);
                }
            }
        
        System.out.println();
        System.out.println("Numeros pares de 1 ate o numero selecionado");
        for (int i = 1; i <= n1; i ++){
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
    }
    
}

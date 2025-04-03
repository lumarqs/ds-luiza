
package ex4;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a quantidade de alunos na sua classe: ");
        int alunos = entrada.nextInt();
        
        double somaNotas = 0;
        int contador = 0;
        
        while (contador < alunos) {
            System.out.println("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
            contador++;
        }
        
        double media = somaNotas / alunos;
        System.out.println("A media da turma e: " + media);
        
        scanner.close();
    }
    
}

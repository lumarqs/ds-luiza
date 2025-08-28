
package exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
        String nome = "Ana Luiza";
        int idade = 17;
        int num1 = 5;
        int num2 = 20;
        int soma = num1 + num2;
        double tempC = 35.4;
        double conversao = (tempC * 9/5) + 32;
        String cidade = "Guarulhos";
        double altura = 1.65;
        System.out.println("Bem vindo(a) " + nome + "! !");
        System.out.println("Ola ! ! Meu nome eh " + nome + ", tenho " + idade + ", sou de " + cidade + ", e tenho " + altura + "m.");
        System.out.println("A temperatura em Celsius eh: " + tempC + "C E convertido em Fahrenheit fica: " + conversao);
        System.out.println("O resultado da soma eh: " + soma);
    }
}

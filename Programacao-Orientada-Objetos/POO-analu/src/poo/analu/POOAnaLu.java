
package poo.analu;

public class POOAnaLu {

    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;


    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }


    public void setPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }


    public double calcularMenorPreco() {
        double menor = precoAno1;

        if (precoAno2 < menor) {
            menor = precoAno2;
        }
        if (precoAno3 < menor) {
            menor = precoAno3;
        }

        return menor;
    }


    public double calcularMaiorPreco() {
        double maior = precoAno1;

        if (precoAno2 > maior) {
            maior = precoAno2;
        }
        if (precoAno3 > maior) {
            maior = precoAno3;
        }

        return maior;
    }

    public void exibeInformacaoCarro() {
        System.out.println("Nome do carro: " + nomeModelo);
        System.out.println("Preço Ano 1: " + precoAno1);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        System.out.println("Menor preço: " + calcularMenorPreco());
        System.out.println("Maior preço: " + calcularMaiorPreco());
    }
}


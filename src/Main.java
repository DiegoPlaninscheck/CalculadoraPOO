import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int qtd;
        int n1, expo, n2;

        System.out.println("1- Soma\n2- Multiplicacao\n3- Divisão" +
                "\n4- Subtração\n5- Potenciacao\n6- Porcentagem\n7- Raiz");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            ArrayList<Double> listNumeros = new ArrayList<>();
            Soma soma = new Soma();
            System.out.println("Quantos numeros ira informar? ");
            qtd = sc.nextInt();
            for (int i = 0; i < qtd; i++) {
                System.out.println("Digite o numero: ");
                listNumeros.add(sc.nextDouble());
            }
            System.out.println(soma.somar(listNumeros));
        } else if (opcao == 2) {
            ArrayList<Double> listNumeros = new ArrayList<>();
            Multiplicar multiplicar = new Multiplicar();
            System.out.println("Quantos numeros ira informar? ");
            qtd = sc.nextInt();
            for (int i = 0; i < qtd; i++) {
                System.out.println("Digite o numero: ");
                listNumeros.add(sc.nextDouble());
            }
            System.out.println(multiplicar.multiplicar(listNumeros));
        } else if (opcao == 3) {
            System.out.println("Digite um numero: ");
            n1 = sc.nextInt();
            System.out.println("Digite um numero: ");
            n2 = sc.nextInt();
            Divisao divisao = new Divisao();
            System.out.println(divisao.divisao(n1, n2));
        } else if (opcao == 4) {
            ArrayList<Double> listNumeros = new ArrayList<>();
            Menos menos = new Menos();
            System.out.println("Quantos numeros ira informar? ");
            qtd = sc.nextInt();
            for (int i = 0; i < qtd; i++) {
                System.out.println("Digite o numero: ");
                listNumeros.add(sc.nextDouble());
            }
            System.out.println(menos.subtrair(listNumeros));
        } else if (opcao == 5) {
            System.out.println("Base: ");
            n1 = sc.nextInt();
            System.out.println("Expoente: ");
            expo = sc.nextInt();
            Potencia potencia = new Potencia();
            System.out.println(potencia.potencia(n1, expo));
        } else if (opcao == 6) {
            System.out.println("Digite um numero: ");
            n1 = sc.nextInt();
            System.out.println("Digite um numero: ");
            n2 = sc.nextInt();
            Porcentagem porcentagem = new Porcentagem();
            System.out.println(porcentagem.porcentagem(n1, n2));
        } else if (opcao == 7) {
            System.out.println("Digite um numero: ");
            n1 = sc.nextInt();
            Raiz raiz = new Raiz();
            System.out.println(raiz.raiz(n1));
        }
    }
}

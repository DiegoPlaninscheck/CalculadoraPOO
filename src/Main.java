import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int qtd, soma = 0, multi = 1, subtracao = 0;
        Double n;
        int n1, expo, n2, porc, div;

        System.out.println("1- Soma\n2- Multiplicacao\n3- Divisão" +
                "\n4- Subtração\n5- Potenciacao\n6- Porcentagem\n7- Raiz");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Quantos numeros ira informar? ");
            qtd = sc.nextInt();
            for (int i = 0; i < qtd; i++) {
                System.out.println("Digite o numero: ");
                n = sc.nextDouble();
                soma += n;
            }
            System.out.println(soma);
        } else if (opcao == 2) {
            System.out.println("Quantos numeros ira informar? ");
            qtd = sc.nextInt();
            for (int i = 0; i < qtd; i++) {
                System.out.println("Digite o numero: ");
                n1 = sc.nextInt();
                multi = multi * n1;
            }
            System.out.println(multi);
        } else if (opcao == 3) {
            System.out.println("Digite um numero: ");
            n1 = sc.nextInt();
            System.out.println("Digite um numero: ");
            n2 = sc.nextInt();
            div = n1 / n2;
            System.out.println(div);
        } else if (opcao == 4) {
            System.out.println("Quantos numeros ira informar? ");
            qtd = sc.nextInt();
            for (int i = 0; i < qtd; i++) {
                System.out.println("Digite o numero: ");
                n = sc.nextDouble();
                subtracao -= n;
            }
            System.out.println(subtracao);
        } else if (opcao == 5) {
            System.out.println("Base: ");
            n1 = sc.nextInt();
            System.out.println("Expoente: ");
            expo = sc.nextInt();
            System.out.println(Math.pow(n1, expo));
        } else if (opcao == 6) {
            System.out.println("Digite um numero: ");
            n1 = sc.nextInt();
            System.out.println("Digite um numero: ");
            n2 = sc.nextInt();
            porc = n1 % n2;
            System.out.println(porc);
        } else if (opcao == 7) {
            System.out.println("Digite um numero: ");
            n1 = sc.nextInt();
            System.out.println(Math.sqrt(n1));
        }
    }
}

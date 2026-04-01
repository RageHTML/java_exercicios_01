package condicional;
import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {

        double Pizza = 49.50;
        double Sushi = 11.0;
        double Hamburguer = 35.0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Inciando Sistema ...");
        System.out.println("Digite o saldo da sua conta (float) :");

        double saldo = ler.nextDouble();

        System.out.println("Sucesso ao carregar o saldo");
        System.out.printf("Saldo bancario: %.2f \n", saldo);
        System.out.println("Bem-vindo ao NoMarket\n"
                + "----- Comidas com Desconto -----\n"
                + "1. R$ 49.50 (15% OFF) | Pizza  \n"
                + "2. R$ 11.0  (35% OFF) | Sushi  \n"
                + "3. R$ 35.0  (7% OFF)  | Hamburguer\n"
                + "Digite a posicao do item : \n");

        int opcao = ler.nextInt();

        if (opcao == 1) {

            System.out.println("Quantidade de Pizzas?  \n");

            double qntd = ler.nextDouble();
            double total = qntd * Pizza;
            double desconto = total * 0.15;
            double pTotal = total - desconto;

            if (saldo >= pTotal) {
                System.out.printf("Quantidade de Pizzas: %.1f \n"
                        + "Total da compra: %.2f \n"
                        + "Obrigado volte sempre \n", qntd, pTotal);
            } else {
                System.out.println("saldo insuficiente");
            }

        } else if (opcao == 2) {

            System.out.println("Quantidade de Sushi?  \n");

            double qntd = ler.nextDouble();
            double total = qntd * Sushi;
            double desconto = total * 0.35;
            double pTotal = total - desconto;

            if (saldo >= pTotal) {
                System.out.printf("Quantidade de Sushi: %.1f \n"
                        + "Total da compra: %.2f \n"
                        + "Obrigado volte sempre \n", qntd, pTotal);
            } else {
                System.out.println("saldo insuficiente");
            }

        } else if (opcao == 3) {

            System.out.println("Quantidade de Hamburguer?  \n");

            double qntd = ler.nextDouble();
            double total = qntd * Hamburguer;
            double desconto = total * 0.07;
            double pTotal = total - desconto;

            if (saldo >= pTotal) {
                System.out.printf("Quantidade de Hamburguer: %.1f \n"
                        + "Total da compra: %.2f \n"
                        + "Obrigado volte sempre \n", qntd, pTotal);
            } else {
                System.out.println("saldo insuficiente");
            }
        }
    }
}
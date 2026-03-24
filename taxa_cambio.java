package Num;
import java.util.Scanner;
public class taxa_cambio  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor a ser convertido:\n");
		double valor = ler.nextDouble();
		System.out.println("Digite a taxa de cambio\n");
		double taxaCambio = ler.nextDouble();
		double valorConvertido = valor * taxaCambio;
		
		System.out.printf("Seu valor total: %.3f",valorConvertido);
		
	}
}

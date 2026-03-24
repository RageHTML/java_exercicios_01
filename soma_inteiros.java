package Num;
import java.util.Scanner;

public class soma_inteiros {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro Valor: \n");
		int numeroA = ler.nextInt();
		System.out.println("Digite o segundo Valor: \n");
		int numeroB = ler.nextInt();
		
		int soma = numeroA + numeroB;
		
		System.out.printf("O resultado da soma: %d",soma);
	}
}

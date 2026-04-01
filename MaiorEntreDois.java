package condicional;
import java.util.Scanner;
public class MaiorEntreDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 2 numeros, para descobrir o maior");
		System.out.println("Digite o primeiro numero");
		int pN = ler.nextInt();
		System.out.println("Digite o segundo numero");
		int sN = ler.nextInt();
		
		if (pN > sN) {
			System.out.printf("%d e o Maior",pN);
			
		} else {
			System.out.printf("%d e o Maior",sN);
		}
	}
}

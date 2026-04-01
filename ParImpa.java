package condicional;
import java.util.Scanner;
public class ParImpa {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Descubra se o numero e par ou impa");
		System.out.println("Digite o valor");
		
		int N = ler.nextInt();
		
		if (N % 2 == 0) {
			System.out.printf("%d e um numero Par",N);
		} else {
			System.out.printf("%d e um numero impar",N);
		}
		
	}
}

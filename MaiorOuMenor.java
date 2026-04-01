package condicional;
import java.util.Scanner;
public class MaiorOuMenor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o numero da condicao maior que: ");
		int numeroCondicao = ler.nextInt();
		System.out.println("Informe o numero para comparar com a condicao: ");
		int numeroBase = ler.nextInt();
		
		if (numeroBase > numeroCondicao) {
			System.out.printf("%d e maior que %d", numeroBase, numeroCondicao);
		}
		
		if (numeroBase < numeroCondicao) {
			System.out.printf("%d e menor que %d", numeroBase, numeroCondicao);
		}
	}
}

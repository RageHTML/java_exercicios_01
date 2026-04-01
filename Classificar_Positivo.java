package condicional;
import java.util.Scanner;

public class Classificar_Positivo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero positivo");
		int numeroDigitado = ler.nextInt();
		
		if (numeroDigitado > 0) {
			System.out.printf("%d e positivo", numeroDigitado);
		}
	}
}

package condicional;
import java.util.Scanner;
public class Classificar_Pa_Impa {
	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		System.out.println("Digite um numero");
		int numeroDigitado = ler.nextInt();
		
		if (numeroDigitado % 2 > 0) {
			System.out.printf("O numero %d e impa", numeroDigitado);
		}
		
		if (numeroDigitado % 2 == 0) {
			System.out.printf("O numero %d e pa", numeroDigitado);
		}
	}
}

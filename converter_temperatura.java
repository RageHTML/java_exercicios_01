package Num;
import java.util.Scanner;
public class converter_temperatura {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em celsius: \n");
		double celsius = ler.nextDouble();
		
		double fahrenheit = 9 / 5 * celsius + 32;
		
		System.out.printf("Em Fahrenheit: %.2f", fahrenheit);
		
	}
}

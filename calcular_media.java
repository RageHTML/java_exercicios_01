package Num;
import java.util.Scanner;

public class calcular_media {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira Nota:\n");
		double notaA = ler.nextDouble();
		System.out.println("Digite a segunda Nota:\n");
		double notaB = ler.nextDouble();
		System.out.println("Digite a terceira Nota:\n");
		double notaC = ler.nextDouble();
		
		double media = notaA + notaB + notaC / 3;
		
		System.out.printf("A media das notas: %.2f", media); // .2f e a mascar para mostrar apenas 2 casas decimais 
		
	}
}

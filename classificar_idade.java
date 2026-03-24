package Num;
import java.util.Scanner;

public class classificar_idade {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a sua idaide");
		
		int idade = ler.nextInt();
		
		if (idade <= 12 && idade == 0) {
			System.out.println("Crianca");
		} 
		
		if (idade > 12 && idade < 17) {
			System.out.println("Adolescente");
		}
		
		if (idade > 18 && idade < 59 ) {
			System.out.println("Adulto");
		}
		
		if (idade > 59 && idade < 100 ) {
			System.out.println("idoso");
		}
		
	}
	
	
}

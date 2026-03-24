package Num;
import java.util.Scanner;
public class par_ou_impar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro");
		
		int numero = ler.nextInt();
		
		if (numero % 2 == 0) {
			System.out.printf("O numero %d e par \n",numero);
		} else {
			System.out.printf("O numero %d e impar \n",numero);
		}
	};
}

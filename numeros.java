
package Num;


import java.util.Scanner;

public class numeros {
	


	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); // um objeto do tipo scanner que tem as classes e objetos para ler dados 

		
		System.out.println("Insira o Numero"); // println nao passa variaveis
		int numero = ler.nextInt();
		
		int sucessor = numero + 1;
		int antecessor = numero - 1;
		System.out.printf("Voce digitou: %d \n",numero); // printf passa variaveis, mas tem que colocar a mascara
		System.out.printf("o antecessor de %d : %d \n",numero,antecessor);
		System.out.printf("o sucessor de %d : %d \n",numero,sucessor);
	}
	
}


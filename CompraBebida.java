package condicional;
import java.util.Scanner;
public class CompraBebida {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a sua idade");
		int idadeCliente = ler.nextInt();
		
		System.out.println("Digite a quantidade de bebidas alcolicas voce deseja");
		int qntBebidas = ler.nextInt();
		
		System.out.println("Digite a quantidade de Refrigerente voce deseja");
		int qntRefrigerante = ler.nextInt();
		
		int prcRefri = 10;
		int prcBeb = 6;
		
		if (idadeCliente >= 18) {
			int totalBeb = qntBebidas * prcBeb;
			int totalRefri = qntRefrigerante * prcRefri;
			
			System.out.println("Obrigado e volte sempre\n");
			System.out.printf("%d - Refrigerentes Total: %d\n",qntRefrigerante, totalRefri);
			System.out.printf("%d - Bebidas Total: %d\n",qntBebidas, totalBeb);
		}
		
		if (idadeCliente > 0 && idadeCliente < 18) {
			int totalRefri = qntRefrigerante * prcRefri;
			
			System.out.println("Voce nao tem idade para comprar Bebidas Alcolicas\n");
			System.out.println("Obrigado e volte sempre\n");
			System.out.printf("%d - Refrigerentes Total: %d\n",qntRefrigerante, totalRefri);
		}
		
		
		
		
	}
}

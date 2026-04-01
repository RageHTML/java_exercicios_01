package condicional;
import java.util.Scanner;
public class comprarCarro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/* Valores dos carros */
		double Mobi = 75.000;
		double Kwid = 82.000;
		double Argo = 89.000;
		double Onix = 97.000;
		double HB20 = 105.000;
		
		System.out.println("Digite o valor do seu saldo (em float): ");
		double saldo = ler.nextDouble();
		
		System.out.printf("Seu saldo e de %.2f\n", saldo);
		System.out.println("Carros atualizados 2025");
		System.out.println(
				"1 - Fiat Mobi — R$ 75.000\n"
			  + "2 - Renault Kwid — R$ 82.000\n"
			  + "3 - Fiat Argo — R$ 89.000\n"
			  + "4 - Chevrolet Onix — R$ 97.000\n"
			  + "5 -Hyundai HB20 — R$ 105.000\n");
		System.out.println("Digite a opcao do carro desejado");
		int opcao  = ler.nextInt();
		
		if (opcao == 1 ){
			if (saldo >= Mobi) {
				System.out.println("Aproveite seu Mobi");
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else if (opcao == 2 ) {
			if (saldo >= Kwid) {
				System.out.println("Aproveite seu Kwid");
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else if (opcao == 3 ) {
			if (saldo >= Argo) {
				System.out.println("Aproveite seu Argo");
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else if (opcao == 4 ) {
			if (saldo >= Onix) {
				System.out.println("Aproveite seu Onix");
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else if (opcao == 5 ) {
			if (saldo >= HB20) {
				System.out.println("Aproveite seu HB20");
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Opcao invalida");
		}
		
	}
}

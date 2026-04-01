package condicional;
import java.util.Scanner;
public class DescubraAcesso {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Bem vindo ao painel Secreto");
		System.out.println("Qual a sua idade?");
		int Idade = ler.nextInt();
		if (Idade >= 18) {
			System.out.println("Acessando o Terminal ...");
		}  else {
			System.out.println("Fechando Terminal (erro 8123) ...");
		}
		
	}
}

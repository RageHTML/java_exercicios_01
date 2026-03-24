package Num;
import java.util.Scanner;
import java.time.LocalDate;
public class ano_nascimento {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		LocalDate hoje = LocalDate.now();
		int ano = hoje.getYear();
		System.out.println("insira o ano do seu nascimento");
		int aniversario = ano - ler.nextInt() ;
		System.out.printf("Sua idade atual: %d",aniversario);
		
	}
}

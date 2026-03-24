package Num;
import java.util.Scanner;
public class calcular_salario {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o salario do funcionario");
		
		double salario = ler.nextDouble();
		
		double novo_salario = salario + (salario * 0.10);
		
		
		System.out.printf("O novo salario do funcionario: %.3f",novo_salario);
	}
}

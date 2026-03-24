package Num;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class nascimento_ano {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o ano do seu nascimento:");
        int ano = ler.nextInt();
        System.out.println("Insira o mês do seu nascimento:");
        int mes = ler.nextInt();
        System.out.println("Insira o dia do seu nascimento:");
        int dia = ler.nextInt();
        
        LocalDate nascimento = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();
        
        int idade = Period.between(nascimento, hoje).getYears();
        
        System.out.printf("Sua idade atual é: %d anos\n", idade);
        
        ler.close();
    }
}
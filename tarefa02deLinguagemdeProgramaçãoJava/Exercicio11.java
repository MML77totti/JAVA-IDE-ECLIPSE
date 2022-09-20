package tarefa02deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio11 {

	/*
	 * 11) Escreva um algoritmo para ler as dimensões de um trapézio (base amior,
	 * base menor e altura), calcular e escrever a área do trapézio. a=(B+b).h/2
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite Base Maior do Trapezio : ");

		float baseMaior = sc.nextFloat();

		System.out.println("Digite Base Menor do Trapezio : ");
		float baseMenor = sc.nextFloat();

		System.out.println("Digite Altura do Trapezio :");
		float altura = sc.nextFloat();

		float ares = (baseMaior + baseMenor) * altura / 2;
		System.out.println("Area do seu Trapezio é : " + ares);

		sc.close();
	}
}

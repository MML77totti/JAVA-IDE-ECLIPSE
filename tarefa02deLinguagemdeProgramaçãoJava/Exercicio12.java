package tarefa02deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio12 {

	/*
	 * 12) Escreva um algoritmo para ler as dimensões de um circulo (raio), calcular
	 * e escrever a área do circulo. a=pi*r²
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Area do Circulo : ");
		double area = sc.nextDouble();

		double c = Math.PI * 2 * area;

		System.out.println("Area do circulo é : " + c);
		sc.close();
	}
}

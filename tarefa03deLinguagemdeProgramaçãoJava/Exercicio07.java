package tarefa03deLinguagemdeProgramaçãoJava;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio07 {

	/*
	 * 7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a
	 * fórmula: Volume = π*Raio2*Altura
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite Altura da Lata de Oleo : ");

		double altura = sc.nextDouble();

		System.out.println("Digite Raio da Lata de Oleo : ");
		double raio = sc.nextDouble();

		double volumeLatadeOleo = Math.PI * (raio * raio) * altura;

		System.out.println("O volume da Lat de oleo é : " + volumeLatadeOleo);

		sc.close();
	}
}

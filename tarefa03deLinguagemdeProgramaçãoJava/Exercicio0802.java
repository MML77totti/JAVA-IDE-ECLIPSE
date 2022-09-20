package tarefa03deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio0802 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double VelocidadeMedia, TempoGasto, Autonomia = 12; // Velocidade média em Km/h, Tempo gasto em horas e
															// autonomia em Km/L
		double Distancia, LitrosUsados;

		System.out.print("Programa de cálculo da quantidade de litros de combustível gasta em uma viagem\n\n"); // Por
																												// que
																												// títulos
																												// tão
																												// grandes?!

		System.out.print("Por favor, digita o tempo que você gastou em sua viagem (horas): ");
		TempoGasto = sc.nextDouble();

		System.out.print("Por favor, agora digite o Velocidade Média em que você fez o percurso (Km/h): ");
		VelocidadeMedia = sc.nextDouble();

		Distancia = VelocidadeMedia * TempoGasto;
		LitrosUsados = Distancia / Autonomia;

		System.out.print("\n\n\nResultados:\n\n");
		System.out.print("Velocidade média = " + VelocidadeMedia + " Km/h\n");
		System.out.print("Tempo gasto = " + TempoGasto + " horas\n");
		System.out.print("Distancia Percorrida = " + Distancia + " Km\n");
		System.out.print("Quantidade de Combustível utilizado: " + LitrosUsados + " litros\n");

		sc.close();
	}
}

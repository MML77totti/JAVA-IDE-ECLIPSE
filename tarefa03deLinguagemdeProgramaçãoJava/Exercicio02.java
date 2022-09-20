package tarefa03deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero total de Eleitores: ");
		float totalEleitores = sc.nextFloat();

		System.out.println("Digite o numero total de votos Brancos: ");
		float totalBrancos = sc.nextFloat();

		System.out.println("Digite o numero total de votos Nulos: ");
		float totalNulos = sc.nextFloat();

		System.out.println("Digite o numero total de votos Validos: ");
		float totalValidos = sc.nextFloat();

		float porcentagemVotosBrancos = totalBrancos / totalEleitores * 100;
		float porcentagemVotosNulos = totalNulos / totalEleitores * 100;
		float porcentagemVotosValidos = totalValidos / totalEleitores * 100;

		System.out.println("O valor da porcentagem de votos Brancos corresponde a: " + porcentagemVotosBrancos+"%");
		System.out.println("O valor da porcentagem de votos Nulos corresponde a: " + porcentagemVotosNulos+"%");
		System.out.println("O valor da porcentagem de votos Validos corresponde a: " + porcentagemVotosValidos+"%");

		sc.close();
	}
}

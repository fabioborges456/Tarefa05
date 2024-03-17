package tarefa05deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class LerNota_01e02Aluno04 {

	/*
	 * 4) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média
	 * aritmética simples e escrever uma mensagem que diga se o aluno foi ou não
	 * aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado).
	 * Escrever também a média calculada.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota da primeira avaliação: ");
		float nota01 = sc.nextFloat();

		System.out.println("Digite a nota da segunda avaliação: ");
		float nota02 = sc.nextFloat();

		float resultadoMedia = (nota01 + nota02) / 2;

		if (resultadoMedia >= 6) {
			System.out.println("O aluno Foi aprovado, pós a media foi: " + resultadoMedia);
		} else {
			System.out.println("O aluno Foi reprovado, pós a media dele foi " + resultadoMedia);
		}

		sc.close();
	}
}

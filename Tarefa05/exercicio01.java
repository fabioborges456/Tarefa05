package tarefa05deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class EscreverMaiorOuNao10_01 {

	/*
	 * 1) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for
	 * maior que 10, caso
	 * 
	 * contrário escrever NÃO É MAIOR QUE 10!
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Valor : ");
		int valor10 = sc.nextInt();

		if (valor10 > 10) {
			System.out.println("E maior que 10 o valor Digitado");
		} else {
			System.out.println("E menor que 10 o valor Digitado");
		}

		sc.close();
	}
}

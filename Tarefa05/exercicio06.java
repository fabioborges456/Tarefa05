package tarefa05deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class MaiorEntre2Numeros06 {

	/*
	 * 6) Ler dois valores (considere que não serão lidos valores iguais) e escrever
	 * o maior deles.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Primeiro Valor: ");
		int valor01 = sc.nextInt();

		System.out.println("Digite o Segundo Valor: ");
		int valor02 = sc.nextInt();

		if (valor01 > valor02) {
			System.out.println("O maior Valor é : "+valor01);
		}else {
			System.out.println("O maior valor é : "+valor02);
		}
		
		sc.close();
	}
}

package domain;
import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o primeiro valor");
		int parametroUm = lerInt(input);

		System.out.println("Digite o segundo valor");
		int parametroDois = lerInt(input);
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException exception) {
			System.out.println("Erro: " + exception.getMessage());
		}
		
	}
	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		} else {
			int diferenca = parametroDois - parametroUm;
			for(int i = 1; i <= diferenca; i++){
				System.out.println("Imprimindo a " + i + "ª interação: " + i);
			}
		}
	}

	public static int lerInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada está inválida! Por favor digite um número inteiro.");
            }
        }
    }

}
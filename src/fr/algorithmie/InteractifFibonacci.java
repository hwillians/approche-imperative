package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		// Demander à l’utilisateur de choisir un rang N
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choisissez un rang N \n");
		int nb = scanner.nextInt();
		// Ecrire un algorithme qui calcule et affiche le nombre de rang N
		int[] Fibonacci = new int[nb + 1];
		Fibonacci[0] = 0;
		Fibonacci[1] = 1;
		for (int i = 2; i <= nb; i++) {
			Fibonacci[i] = Fibonacci[i - 2] + Fibonacci[i - 1];
		}
		for (int j = 0; j < Fibonacci.length; j++) {
			System.out.print(Fibonacci[j] + " ");
		}
	}

}

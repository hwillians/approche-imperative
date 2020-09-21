package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		/*
		 * Ecrire un programme qui demande un nombre à l’utilisateur qui doit être
		 * compris entre 1 et 10. Une fois que le nombre est bien entre 1 et 10, le
		 * programme affiche la table de multiplication de ce nombre.
		 */

		int nb;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Veuillez saisir un nombre entre 1 et 10");
			nb = scanner.nextInt();
		} while (nb < 1 || nb > 10);

		for (int i = 1; i <= 10; i++) {
			System.out.println(nb + " * " + i + " = " + nb * i);
		}

	}

}

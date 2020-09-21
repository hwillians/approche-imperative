package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {

	public static void main(String[] args) {
		// Soit le tableau suivant :
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Afficher l’ensemble des éléments du tableau grâce à une boucle
		for (int i : array) {
			System.out.print(i + " ");
		}

		System.out.println("\n -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.- \n");

		// Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		for (int i = (array.length - 1); i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.- \n");

		// Créer un tableau arrayCopy et copier tous les éléments d'array dans arrayCopy
		int[] arrayCopy = Arrays.copyOf(array, array.length);

		for (int i : arrayCopy) {
			System.out.print(i + " ");
		}

	}
}

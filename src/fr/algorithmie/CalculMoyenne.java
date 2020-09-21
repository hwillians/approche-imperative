package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		// Soit le tableau suivant :
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		float somme = 0;

		// Quelle est la moyenne des éléments du tableau ?
		for (int i : array) {
			somme += i;
		}

		System.out.println("La moyenne des éléments du tableau est : " + somme / array.length);
	}
}

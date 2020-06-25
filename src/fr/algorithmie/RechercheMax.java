package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		// Soit le tableau suivant :
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int temoin = 0;
		int temoinI = 0;

		// Rechercher le plus grand élément du tableau

		for (int i = 0; i < array.length; i++) {
			if (array[i] > temoin) {
				temoin = array[i];
				temoinI = i;
			}
		}
		System.out.println("Le plus grand élémént du tableau est : " + temoin + " avec l'index : " + temoinI);

	}

}

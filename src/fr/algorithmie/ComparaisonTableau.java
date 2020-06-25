package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		// Soit les tableaux suivants :
		int[] array1 = { 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

		// Ecrire le code permettant de compter le nombre d’éléments en commun dans ces
		// 2 tableaux
		int temoin = 0;
		String s = " ";

		for (int i = 0; i < array2.length; i++) {
			if (array1[i] == array2[i]) {
				temoin++;
			}
		}

		System.out.println("Les tableaux precedents possedent " + temoin + " élément" + (s = temoin < 2 ? " " : "s ")
				+ "en commun");
	}

}

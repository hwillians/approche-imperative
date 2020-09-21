package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// Dans cette classe, on déclare un tableau d’entiers
		int[] array = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

		// Effectuez une rotation à droite des éléments.
		int l = array.length;
		int[] newArray = new int[l];

		for (int i = 1; i < l; i++) {
			if (i == l - 1) {
				newArray[0] = array[l - 1];
			}
			newArray[i] = array[i - 1];

		}
		for (int i = 0; i < l; i++) {
			System.out.print(newArray[i] + " ");
		}
	}
}

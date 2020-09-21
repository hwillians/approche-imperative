package fr.algorithmie;

public class InversionContenu {
	public static void main(String[] args) {
		// Soit le tableau suivant :
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		int[] arrayCopy = new int[array.length];

		int k = array.length - 1;

		for (int i : arrayCopy) {
			arrayCopy[i] = array[k];
			k--;
			System.out.print(arrayCopy[i] + " ");
		}

	}
}

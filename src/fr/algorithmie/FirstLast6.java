package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// Dans cette classe, on déclare un tableau d’entiers
		int[] array = {};

		/*
		 * On calcule une valeur booléenne qui contrôle le tableau de la sorte : elle
		 * vaut true si le tableau a au moins 1 élément et si le premier élément ou le
		 * dernier élément vaut 6. elle vaut false dans les autres cas
		 */
		boolean bool = false;

		if (array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6)) {
			bool = true;
		}
		System.out.println("Le premier élément ou le dernier élément du tableau vaulent 6 : " + bool);
	}

}

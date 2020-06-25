package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// Dans cette classe, on déclare un tableau d’entiers
		int[] array = { 18, 12, 17, 14, 5, -9, 0, 18 };

		/*
		 * On calcule une valeur booléenne qui contrôle le tableau de la sorte : elle
		 * vaut true si le tableau est de longueur supérieure ou égale à 1 et que le
		 * premier et le dernier élément du tableau ont la même valeur elle vaut false
		 * dans les autres cas écrire l’algo de valorisation de cette variable avec le
		 * minimum de ligne
		 */
		boolean bool = false;

		if (array.length > 0 && array[0] == array[array.length - 1]) {
			bool = true;
		}
		System.out.println(" le premier et le dernier élément du tableau ont la même valeur : " + bool);
	}

}

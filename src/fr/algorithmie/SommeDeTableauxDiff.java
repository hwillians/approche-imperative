package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		
		int [] array1 = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int [] array2 = {-1,12,17,14,5,-9,0,18};
		
		// Créer un tableau qui contient la somme des 2 précédents tableaux
		int taille = array1.length < array2.length ? array1.length : array2.length ;
		int [] arraySomme = new int [taille];
		for (int i=0; i<taille; i++ ) {
			
			arraySomme[i] = array1[i] + array2[i];
					
			System.out.print(arraySomme[i] + " ");
		}

	}

}

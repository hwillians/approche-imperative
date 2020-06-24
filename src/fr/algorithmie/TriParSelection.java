package fr.algorithmie;

public class TriParSelection {

	public static void main(String[] args) {
		// Soit le tableau suivant :
		int [] array2 = {3, -8 ,17 ,5 ,-1 ,4 ,0 ,6 ,2 ,11 ,-5 ,-4 ,8};
		int [] arrayTri = new int [array2.length];
		;
		// Implémenter la méthode tri par sélection
				
		for (int i = 1; i < arrayTri.length; i++) {
			int temoin = array2[i];
			
			for (int j = i-1; j < array2.length ; j++) {
				if(array2[i-1] < temoin) {
					temoin = array2[i-1];
				}
			}
			arrayTri[i] = temoin;
			System.out.println(arrayTri[i]);
		}	
		      
		
		
		
	}
	
}
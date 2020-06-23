package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Affichez tous les nombres de 1 à 10
		
		for (int i=1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n --------- \n");
		// Affichez 20 fois votre nom et votre prénom
		
		for (int i=1; i <= 20; i++) {
			System.out.println(i + ". WILLIANS Helvin");
		
		}
		
		System.out.println("\n --------- \n");
		
		// Affichez les éléments pairs de 2 à 100
		for (int i=2; i <= 100; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("\n --------- \n");
		
		// Affichez les éléments impairs de 1 à 99
		
		for (int i=1; i < 100; i+=2) {
			System.out.println(i);
		}
		
	}
}

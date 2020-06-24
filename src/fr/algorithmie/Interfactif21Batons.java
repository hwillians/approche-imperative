package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 2;
		int batons = 21;
	
		// Qui commence, ramdom est 1, commence l'ordi
		int ramdom = 1 +(int)(Math.random() *2);
		
		while (batons >0) {
			if (ramdom ==1) {
				int choixOrdi = min + (int)(Math.random() * ((max - min) + 1));
				batons -= choixOrdi;
				System.out.print("La machine jeue : " + choixOrdi + " il en reste : " + batons );
			}else {
				Scanner scanner = new Scanner(System.in);
				System.out.println("C\'est votre tour, choisissez entre 1, 2 ou 3 battons");
				int nb = scanner.nextInt();
				batons -= nb;
				System.out.print("Vous jeuez : " + nb + " il en reste : " + batons);
			}
			ramdom = ramdom == 1 ? 0 : ramdom == 0 ? 1 : 0;
		}
		
		
	}

}

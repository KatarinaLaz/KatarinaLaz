package d20_8_2021;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

//		1. Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza,
//		broji koliko je parnih brojeva uneto. Brojeve unosi korisnik.
//		
//		Unesite broj: 1
//		Unesite broj: 3
//		Unesite broj: 4
//		Unesite broj: 7
//		Unesite broj: 8
//		U nizu ima 2 parna broja.

		Scanner s = new Scanner(System.in);

		int[] niz = { 0, 0, 0, 0, 0 };
		int count = 0;

		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite broj: ");
			int a = s.nextInt();
			niz[i] = a;
		}
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("Ima " + count + " parna broja u nizu.");
		s.close();
	}

}

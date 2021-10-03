package d19_8_2021;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

//		(Za vezbanje) Napisati program koji ucitava N brojeva od korisnika i prikazuje koliko je K brojeva uneto.N i K unosi korisnik
//		Unesite N: 4
//		Unesite K: 1
//		Unesite broj: 1
//		Unesite broj: 2
//		Unesite broj: 4
//		Unesite broj: 1
//		Uneto je 2 broja koja imaju vrednost 1. (jer su unete dve jedinice)

		Scanner s = new Scanner(System.in);

		System.out.print("Koliko brojeva zelite da unesete? ");
		int n = s.nextInt();

		System.out.print("Koju vrednost zelite da racunate? ");
		int m = s.nextInt();

		int a;
		int count = 0;

		while (n > 0) {
			System.out.print("Unesite broj: ");
			a = s.nextInt();

			if (a == m) {
				count++;
			}
			n--;
		}
		System.out.println("Uneto je " + count + " broja sa vrednoscu " + m + ".");
		s.close();
	}

}

package d17_8_2021;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

//		(ZA vezbanje)
//
//		Napisati program koji od korisnika ucitava N brojeva i na kraju ispisuje srednju vrednost svih brojeva.
//		Unesite N: 5
//		Unesite broj: 1
//		Unesite broj: 2
//		Unesite broj: 9
//		Unesite broj: 6
//		Unesite broj: 8
//		Srednja vrednost je 5. 
//		5 jer je celobrojno deljenje!

		Scanner s = new Scanner(System.in);

		System.out.print("Koliko brojeva zelite da unesete? ");
		int N = s.nextInt();
		int a = 0;
		int sum = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Unesite broj: ");
			a = s.nextInt();
			sum = (sum + a);
		}

		System.out.println("Srednja vrednost ovih brojeva je: " + (sum / N)); // celobrojna vrednost
//		System.out.println("Srednja vrednost ovih brojeva je: " + (1.0 * sum / N)); //realna vrednost

		s.close();
	}

}

package d17_8_2021;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

//		Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve. Na kraju programa prikazati sumu.
//		Primer izvrsenja:
//		Unesite N: 5
//		Unesite broj: 1
//		Unesite broj: 2
//		Unesite broj: 9
//		Unesite broj: 6
//		Unesite broj: 8
//		Suma parnih brojeva je 16
//		Objasnjenje: 2 + 6 + 8 = 14

		Scanner s = new Scanner(System.in);

		System.out.print("Koliko brojeva zelite da unesete? ");
		int N = s.nextInt();
		int a = 0;
		int sum = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Unesite broj: ");
			a = s.nextInt();
			if (a % 2 == 0) {
				sum = sum + a;
			}
		}

		System.out.println("Suma svih parnih brojeva je: " + sum);
		s.close();
	}

}

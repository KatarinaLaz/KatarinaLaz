package d17_8_2021;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

//		Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih formira rezultujuci broj kao na primeru
//		Unesite N: 5
//		Unesite broj: 1
//		Unesite broj: 2
//		Unesite broj: 0
//		Unesite broj: 4
//		Unesite broj: 1
//		Rezultujuci broj je 12041
//		
//
//		Milanov dodatni hint:
//		
//		Unosis brojeve 1 4 6 7 8
//		
//		a i be se kroz iteracije menjaju ovako:
//		
//		a je 0, be je 1		
//		A je 1, b je 4		
//		A je 14, b je 6		
//		A je 146, b je 7		
//		A je 1467, b je 8

		Scanner s = new Scanner(System.in);

		System.out.print("Koliko brojeva zelite da unesete? ");
		int N = s.nextInt();
		int rezultat = 0;

		for (int i = N; i >= 1; i--) {
			System.out.print("Unesite broj: ");
			int a = s.nextInt();
			rezultat = rezultat * 10 + a;
		}
		System.out.println("Rezultujuci broj je " + rezultat);
		s.close();
	}

}

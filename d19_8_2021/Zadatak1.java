package d19_8_2021;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

//		Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
//		Unesite N: 5
//		Unesite broj: 1
//		Unesite broj: 32
//		Unesite broj: 121
//		Unesite broj: 1333
//		Unesite broj: 144
//		Suma je: 265

		Scanner s = new Scanner(System.in);

		System.out.print("Koliko brojeva zelite da unesete? ");
		int n = s.nextInt();
		int a;
		int suma = 0;

		while (n > 0) {
			System.out.println("Unesite broj: ");
			a = s.nextInt();

			if (a >= 100 && a < 1000) {
				suma = suma + a;
			}
			n--;
		}
		System.out.println("Zbir svih trocifrenih brojeva je " + suma);
		s.close();
	}

}

package d19_8_2021;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

//		Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula.
//		Primer izvrsenja:
//		Unesite broj: 3
//		Apsolutna vrednost je 3
//		Unesite broj: -1
//		Apsolutna vrednost je 1
//		Unesite broj: 0
//		Kraj programa jer je uneta nula.

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite broj: ");
		int a = s.nextInt();

		if (a < 0) {
			a = -a;
		}

		while (a != 0) {
			System.out.println("Apsolutna vrednost ovog broja je " + a);
			System.out.print("Unesite broj: ");
			a = s.nextInt();

			if (a < 0) {
				a = -a;
			}
		}
		System.out.println("Kraj programa jer je uneta nula");
		s.close();
	}

}

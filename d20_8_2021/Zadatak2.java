package d20_8_2021;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

//		2. Napisati program koji ucitava niz A duzine N,
//		i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
//		
//		Primer izvrsenja:
//		Unesite broj: 1
//		Unesite broj: -4
//		Unesite broj: 3
//		Unesite broj: -7
//		Unesite broj: 9
//
//		Brojevi veci od nule u nizu A su: 1, 3, 9,

		Scanner s = new Scanner(System.in);

		int[] nizA = { 0, 0, 0, 0, 0 };
		int a = 1;

		for (int i = 0; i < nizA.length; i++) {
			System.out.print("Unesite broj u niz: ");
			a = s.nextInt();
			nizA[i] = a;
		}
		System.out.print("Brojevi veci od nule u nizu A su: ");
		for (int i = 0; i < nizA.length; i++)
			if (nizA[i] > 0) {
				System.out.print(nizA[i] + ", ");
			}
		s.close();
	}

}

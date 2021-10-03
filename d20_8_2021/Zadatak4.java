package d20_8_2021;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

//		4. (Za vezbanje) Napisati program koji ucitava niz a duzine N.
//		Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
//		a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
//
//		Unesite broj: 1
//		Unesite broj: 5
//		Unesite broj: 2
//		Unesite broj: 7
//		Unesite broj: 8
//		Unesite broj: -1
//
//		Niz a: 1, 5, 2, 7, 8, -1
//		Niz b: 1, 5, 2, 1, 1, 1

		Scanner s = new Scanner(System.in);

		int[] nizA = { 0, 0, 0, 0, 0, 0, 0 };
		int[] nizB = nizA;

		for (int i = 0; i < nizA.length; i++) {
			System.out.print("Unesite broj za niz: ");
			int a = s.nextInt();
			nizA[i] = a;
		}
		System.out.print("Niz A: ");
		for (int i = 0; i < nizB.length; i++) {
			System.out.print(nizA[i] + ", ");
		}

		System.out.println("");
		System.out.print("Niz B: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(nizB[i] + ", ");
		}

		for (int i = 3; i < nizB.length; i++) {
			nizB[i] = 1;
			System.out.print(nizB[i] + ", ");
		}
		s.close();
	}

}

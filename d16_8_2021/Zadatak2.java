package d16_8_2021;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

//		2.  Napisati program koji za unetu vrednost x odredjuje i prikazuje vrednost funkcije y. Funkcija y je definisana kao:
//		     (x,       x < 2
//		y =  (2,      2 <= x < 10
//		     (x - 1, x >= 10
//		
//		Primer izvrsenja 1:
//		Unesite x: -3
//		y = -3
//
//		Primer izvrsenja 2:
//		Unesite x: 5
//		y = 2
//
//		Primer izvrsenja 3:
//		Unesite x: 30
//		y=29

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite x: ");
		int x = s.nextInt();
		int y;

		if (x < 2) {
			y = x;
		} else if (x >= 2 && x < 10) {
			y = 2;
		} else {
			y = x - 1;
		}

		System.out.println("y = " + y);

		s.close();
	}

}

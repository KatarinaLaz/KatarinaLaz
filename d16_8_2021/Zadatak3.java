package d16_8_2021;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

//		3. (za vezbanje) Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #)
//		tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.
//		
//		Primer izvrsenja 1:
//		Unesite a: 10
//		Unesite b: -2
//		Unesite c: -1
//		Unesite d: 9
//		String p ime vrednost = -1 -2 # 10 9

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite broj a: ");
		int a = s.nextInt();
		System.out.print("Unesite broj b: ");
		int b = s.nextInt();
		System.out.print("Unesite broj c: ");
		int c = s.nextInt();
		System.out.print("Unesite broj d: ");
		int d = s.nextInt();
		String p = "#";

		if (a < 0) {
			p = a + " " + p;
		} else {
			p = p + " " + a;
		}
		if (b < 0) {
			p = b + " " + p;
		} else {
			p = p + " " + b;
		}
		if (c < 0) {
			p = c + " " + p;
		} else {
			p = p + " " + c;
		}
		if (d < 0) {
			p = d + " " + p;
		} else {
			p = p + " " + d;
		}

		System.out.println(p);

		s.close();
	}

}

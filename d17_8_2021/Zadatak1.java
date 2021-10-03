package d17_8_2021;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

//		(Switch) Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature
//		(operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu
//		odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.
//		
//		Primer 1:                                            Primer 2:
//		Unestite a: 6                                        Unestite a: 6
//		Unesite b: 3                                         Unesite b: 3
//		Unesite operator: +                             	 Unesite operator: /
//		Rezultat: 9                                          Rezultat: 2

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite prvi broj: ");
		int a = s.nextInt();
		System.out.print("Unesite drugi broj: ");
		int b = s.nextInt();
		System.out.print("Unesite operator (+ , -, *, /): ");
		String operator = s.next();

		switch (operator) {
		case "+":
			System.out.println("Rezultat je " + (a + b));
			break;
		case "-":
			System.out.println("Rezultat je " + (a - b));
			break;
		case "*":
			System.out.println("Rezultat je " + (a * b));
			break;
		case "/":
			System.out.println("Rezultat je " + (1.0 * a / b));
			break;
		default:
			System.out.println("Nije validan operator.");
		}

		s.close();

	}

}

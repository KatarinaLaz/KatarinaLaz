package d12_8_2021;

public class Zadatak2 {

	public static void main(String[] args) {

//	Napisati program koji racuna procenat b od vrednosti a i smesta vrednost u promenljivu c.
//	Ispisati vrednost promenljive c na ekranu.
//	Smatrati da je b u rasponu od 0 do 100. Na primer: 
//	primer 1: a = 100, b=15 rezultat c = 15. (15 procenata od 100 je 15)
//	primer 2: a = 50, b=20 rezultat c = 10. (20 procenata od 50 je 10)
//	primer 3: a = 5, b=50 rezultat c =  2.5 (50 procenata od 5 je 2.5)

		int a = 125;
		double b = 25.0;
		double c;

		c = a * b / 100;

		System.out.println(b + "% od " + a + " je " + c);

	}

}

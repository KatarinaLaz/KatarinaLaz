package d23_8_2021;

public class Zadatak1 {

	public static void main(String[] args) {

//		Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca
//		Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

		int broj = stampajVrednostZa10Vecu(2);
		int brojJedan = stampajVrednostZa10Vecu(3);
		int brojDva = stampajVrednostZa10Vecu(4);
		int brojTri = stampajVrednostZa10Vecu(5);

		System.out.println(broj);
		System.out.println(brojJedan);
		System.out.println(brojDva);
		System.out.println(brojTri);

	}

	public static int stampajVrednostZa10Vecu(int a) {
		int rezultat = a + 10;
		return rezultat;
	}

}

package d26_8_2021;

public class Zadatak1 {

	public static void main(String[] args) {

//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//		
//		i metode:
//				
//		1. stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		2. povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//		Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//		3. vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//		a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena.
//		Smatrati da je parametar popust u opsegu od 0 do 100.
//		4. racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//		Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

		double povecanje = 1999.99;
		int popust = 25;

		Proizvod p1 = new Proizvod();
		p1.ime = "Ender 3 Pro";
		p1.cena = 32000.0;
		p1.tezina = 4300;
		p1.povecanjCenu(povecanje);
		p1.povecanjCenu(povecanje);
		p1.stampa();
		System.out.println("Cena sa popustom od " + popust + "% je " + p1.vratiCenuSaPopustom(popust));
		System.out.println("Postarina za ovaj proizvod je " + p1.racunajPostarinu() + " din");
		System.out.println();

		Proizvod p2 = new Proizvod();
		p2.ime = "PLA filament";
		p2.cena = 1200.0;
		p2.tezina = 500;
		p2.povecanjCenu(povecanje);
		p2.stampa();
		System.out.println("Cena sa popustom od " + popust + "% je " + p2.vratiCenuSaPopustom(popust));
		System.out.println("Postarina za ovaj proizvod je " + p2.racunajPostarinu() + " din");
		System.out.println();

	}

}

package d26_8_2021;

public class Proizvod {

//	Napisati klasu Proizvod koja ima atribute
//	
//	naziv proizvoda (String)
//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double)

	public String ime;
	public double cena;
	public double tezina;

//		METODE:
//		
//		1. stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}

	public void stampa() {
		System.out.println("Naziv proizvoda: " + this.ime);
		System.out.println("Cena proizvoda: " + this.cena + " din.");
		System.out.println("Tezina proizvoda: " + this.tezina + "kg.");
	}

//		2. povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//		Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.

	public void povecanjCenu(double povecanje) {
		this.cena = this.cena + povecanje;
	}

//		3. vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//		a povratnu vrednost je cena proizvoda kada se uračuna popust. Ova funkcije ne menja atribut cena.
//		Smatrati da je parametar popust u opsegu od 0 do 100.

	public double vratiCenuSaPopustom(double procenat) {
		double popust = this.cena - this.cena * procenat / 100;
		return popust;
	}

//		4. racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//		Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din

	public double racunajPostarinu() {
		double postarina = 0;
		if (this.tezina <= 100) {
			postarina = 200;
		} else if (this.tezina <= 500) {
			postarina = 400;
		} else {
			postarina = 1000;
		}
		return postarina;
	}

}

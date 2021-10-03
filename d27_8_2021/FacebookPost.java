package d27_8_2021;

public class FacebookPost {

//	ATRIBUTI-----------------------------------

//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja

	private String imeKoJeObjavio;
	private String imeGdeJeObjavljeno;
	private String tekst;
	private int lajkovi;
	private int deljenja;

//	KONSTRUKTORI---------------------------

//	konstruktori koji su potrebni i logicni

	public FacebookPost(int lajkovi, int deljenja) {
		this.lajkovi = lajkovi;
		this.deljenja = deljenja;
	}

	public FacebookPost(String ime, String profil, String tekst, int lajkovi, int deljenja) {
		this.imeKoJeObjavio = ime;
		this.imeGdeJeObjavljeno = profil;
		this.tekst = tekst;
		this.lajkovi = lajkovi;
		this.deljenja = deljenja;
	}

//	METODE------------------------------------

//	1. like(), koja povecava broj lajkova za 1.

	public void like() {
		this.lajkovi = this.lajkovi + 1;
	}

//	2. dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)

	public void dislike() {
		if (this.lajkovi > 0) {
			this.lajkovi = this.lajkovi - 1;
		}
	}

//	3. share(), koja povecava broj deljenja za 1

	public void share() {
		this.deljenja = this.deljenja + 1;
	}

//	4. print(), koja stampa objavu u formatu:
//		
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)
//	
//	Primer stampanja:
//	Milan Jovanovic >>> Pera Peric
//	Ovo je tekst objave
//	Likes 3 | Shares 1

	public void print() {
		System.out.println(this.imeKoJeObjavio + " >>> " + this.imeGdeJeObjavljeno);
		System.out.println(tekst);
		System.out.println("Likes " + this.lajkovi + " | Shares " + this.deljenja);
		System.out.println();
	}

//	GETTERS & SETTERS------------------------

//	korisnik moze da procita bilo koji atribut 
//	ali ne moze da menja broj lajkova i broj deljenja

	public void setImeKoJeObjavio(String ime) {
		this.imeKoJeObjavio = ime;
	}

	public String getImeKoJeObjavio() {
		return this.imeKoJeObjavio;
	}

	public void setImeGdeJeObjavljeno(String profil) {
		this.imeGdeJeObjavljeno = profil;
	}

	public String getImeGdeJeObjavljeno() {
		return this.imeGdeJeObjavljeno;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public String getTekst() {
		return this.tekst;
	}

	public int getLajkovi() {
		return this.lajkovi;
	}

	public int getDeljenja() {
		return this.deljenja;
	}

}

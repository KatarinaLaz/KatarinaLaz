package d27_8_2021;

public class Zadatak1 {

	public static void main(String[] args) {

//		1.Kreirati klasu FacebookPost koja ima:
//		
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//		
//			  Od gettera i settera:
//			korisnik moze da procita bilo koji atribut 
//			ali ne moze da menja broj lajkova i broj deljenja
//		
//			 Konstruktore:
//				konstruktori koji su potrebni i logicni
//		
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1

		FacebookPost p1 = new FacebookPost("Katarina Lazic", "Slavisa Tutus", "Otiso si, a sarmu probo nisi. Kuce laje, a ja mislim ti si!", 1, 0);
		p1.like();
		p1.like();
		p1.dislike();
		p1.share();
		p1.share();
		p1.dislike();
		p1.dislike();
		p1.dislike();
		p1.print();
		
		FacebookPost p2 = new FacebookPost("Slavisa Tutus", "Katarina Lazic", "Katarina, ne s*ri.", 95, 129);
		p2.like();
		p2.like();
		p2.like();
		p2.like();
		p2.share();
		p2.like();
		p2.like();
		p2.like();
		p2.dislike(); // <- Katarina
		p2.share();
		p2.share();
		p2.like();
		p2.print();
		p1.setImeKoJeObjavio("Katarina Lazic :(");
		
		FacebookPost p3 = new FacebookPost(15, 6);
		p3.setImeKoJeObjavio("Drugarica 1");
		p3.setImeGdeJeObjavljeno("Drugarica 2");
		p3.setTekst("Ti vidis sta ono dvoje pisu??? :O :O :O");
		System.out.println(p3.getImeKoJeObjavio() + " >>> " + p3.getImeGdeJeObjavljeno());
		System.out.println(p3.getTekst());
		System.out.println("Likes " + p3.getLajkovi() + " | Shares " + p3.getDeljenja());
		
		
	}

	
	
	
	
}

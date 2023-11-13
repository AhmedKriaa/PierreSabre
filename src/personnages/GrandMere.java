package humain;

import java.util.Random;

import samourai.Traitre;

public class GrandMere extends Humain {
	private Humain[] memoire = new Humain[30];
	int nbrHumain=0;
	
	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
		
	}

	private String humainHasard() {
		Random random = new Random();
		int randomValue = random.nextInt(4);
		String value="";
		
		switch (randomValue) {
		case 0:
			value = "Commercant";
			break;
		case 1:
			value="Ronin";
			break;
		case 2:
			value="Yakuza";
			break;
		case 3:
			value="Samourai";
			break;
		}
		return value;
	}
	
	public void faireConnaissanceAvec(Humain h) {
		if (nbrHumain<30) {
			System.out.print("\n");
			h.direBonjour();
			direBonjour();
			parler("Ravie de faire ta connaissance !");
			memoire[nbrHumain]=h;
			nbrHumain++;
		}
		else {
			parler("Nombre maximale de connaissance atteint" );
		}
	}
	
	public void ragoter() {
		for (int i=0;i<nbrHumain;i++) {
			if (memoire[i] instanceof Traitre) {
				parler("Je sais que "+memoire[i].getNom()+" est un traitre !");
			}
			else {
				parler("Je crois que "+memoire[i].getNom()+" est un "+humainHasard());
			}
		}
	}
}

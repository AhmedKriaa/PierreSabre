package samourai;

import humain.Commercant;
import humain.Humain;

public class Ronin extends Humain{
	
	int honneur =1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		
	}

	public void donner(Commercant c,int valeur) {
		parler(+valeur +" sont pour toi "+c.getNom()+".");
		c.recevoir(valeur );
		perdreArgent(valeur );
	}
	
	
	public void provoquer(Yakuza y) {
		int d=2*honneur;
		if (d>y.reputation) {
			ajouterArgent(y.getArgent());
			y.perdre();
			honneur++;
			parler("J'ai gagne contre "+y.getNom());
		}
		else {
			honneur--;
			y.gagner();
			parler("J'ai perdu contre "+y.getNom());
			}
	}

}

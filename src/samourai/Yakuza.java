package samourai;

import humain.Commercant;
import humain.Humain;

public class Yakuza extends Humain {
	String clan;
	int reputation=0;

	public Yakuza(String nom, String boisson, int argent,String clan) {
		super(nom, boisson, argent);
		this.clan=clan;
		
	}
	
	public void direBonjour() {
		super.direBonjour();
		System.out.println(" je fais parti du clan "+getClan()+"!");
	}
	
	
	public String getClan() {
		return clan;
	}
	
	
	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant c) {
		ajouterArgent(c.getArgent());
		c.seFaireExtorquer();
		reputation=getReputation()+1;
		parler("Je viens d'extorquer "+c.getNom());
	}
	
	public void gagner() {
		reputation=getReputation()+1;
		parler("Victoire !");
	}
	
	public int perdre() {
		reputation=getReputation()-1;
		parler("J'ai perdu mon duel et mon "+getArgent()+" sont ...");
		perdreArgent(getArgent());
		return getArgent();
	}
	
}

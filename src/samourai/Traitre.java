package samourai;

import humain.Commercant;
import humain.Humain;

public class Traitre extends Samourai {
	public float niveauMaitrise=0;
	public Traitre(String nom, String boisson, int argent, String seigneur) {
		super(nom, boisson, argent, seigneur);
		
	}
	
	public void ranconner(Commercant c) {
		if (niveauMaitrise<3) {
			ajouterArgent(c.getArgent());
			c.seFaireExtorquer();
			niveauMaitrise=niveauMaitrise+1;
			parler("Je viens d'extorquer "+c.getNom());
		}
		else {
			parler("Tu as de la chance "+c.getNom());
		}
	}
	
	public void direBonjour() {
		super.direBonjour();
		System.out.println("Et mon niveau de maitrise est de "+niveauMaitrise+".");
	}
	
	public void faireLeGentil(Humain h,int valeur) {
		h.ajouterArgent(valeur);
		perdreArgent(valeur);
		niveauMaitrise=(float) (niveauMaitrise-(valeur*0.1));
		if (niveauMaitrise<0)
			niveauMaitrise=0;
		parler("Voila "+h.getNom()+" "+valeur +" sont pour toi, je fais ami-ami");
	}
		

}

package humain;

public class Commercant extends Humain {

	public Commercant(String nom,  int Argent) {
		super(nom, "the", Argent);
		
	}
	
	public int seFaireExtorquer() {
		perdreArgent(getArgent());
		parler("J'ai perdu tout mon argent ! le monde est vraiment trop injuste");
		return getArgent();
	}
	
	public void recevoir(int valeur) {
		ajouterArgent(valeur );
		parler("Merci");
	}
	
}

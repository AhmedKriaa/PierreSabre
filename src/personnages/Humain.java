package humain;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	/**
	 * @param nom
	 * @param boisson
	 * @param Argent
	 */
	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public void parler(String texte) {
		System.out.println("("+ nom +") "+"- "+ texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+ nom +", j'aime boire du "+ boisson +" et j'ai "+argent+" sous en poche");
	}
	
	public void boire() {
		parler("Ahhh, un bon verre de "+boisson+" ! GLOUPS !");
	}

	
	public String getNom() {
		return nom;
	}

	
	public String getBoisson() {
		return boisson;
	}

		public int getArgent() {
		return argent;
	}

	
	public void ajouterArgent(int valeur) {
		argent= argent+ valeur;
	}
	
	public void perdreArgent(int valeur) {
		argent= argent-valeur ;
	}
	
	
}

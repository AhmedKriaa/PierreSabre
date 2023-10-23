package samourai;

public class Samourai extends Ronin {
	String seigneur;
		
	public Samourai(String nom, String boisson, int argent,String seigneur) {
		super(nom, boisson, argent);
				this.seigneur=seigneur;
	}
	
	public void direBonjour() {
		super.direBonjour();
		System.out.println("Et je sers le seigneur "+seigneur+"!");
	}
	
	public void boire(String boisson) {
		parler("Ahhh, un bon verre de " +boisson+" ! GLOUPS !");		
	}
	

}

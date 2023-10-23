package main;

import humain.Commercant;
import humain.GrandMere;
import humain.Humain;
import samourai.Ronin;
import samourai.Traitre;
import samourai.Yakuza;

public class MonHistoire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Humain humain=new Humain("Prof","kombucha",10);
		humain.direBonjour();
		humain.boire();
		Commercant c=new Commercant("Marchand",35);
		c.direBonjour();
		Yakuza y= new Yakuza("Yakusa","bierre", 50,"Warsong");
		y.extorquer(c);
		y.direBonjour();
		Ronin r=new Ronin("Roro","sake",61);
		r.direBonjour();
		r.donner(c, 10);
		r.provoquer(y);
		Traitre t=new Traitre("Itachi", "Coca", 30, "uchiha");
		t.ranconner(c);
		t.faireLeGentil(y, 7);
		GrandMere g=new GrandMere("ma_grand-mere", 50);
		g.faireConnaissanceAvec(r);
		g.faireConnaissanceAvec(y);
		g.faireConnaissanceAvec(t);
		g.ragoter();
	}

}

package pkgCore;

import pkgCore.Hand;
import pkgCore.Deck;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class cMain {

	public static void main(String[] args) throws Exception {
		
		Deck d = new Deck();
		Card a = d.draw();
		Card b = d.draw();
		System.out.print(a.geteRank());
		System.out.println(a.geteSuit());
		System.out.print(b.geteRank());
		System.out.println(b.geteSuit());
		
		System.out.println(d.getRemaining(a.geteRank()));
		System.out.println(d.getRemaining(b.geteSuit()));
		
		
		
		

	}

}

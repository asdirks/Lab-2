package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.math3.analysis.function.Add;

import pkgEnum.eRank;

public class Hand {

	private int iScore;
	private ArrayList<Card> hand = new ArrayList<Card>();
	//private Deck shoe = new Deck(6);
	
	public Hand() throws Exception
	{
		//Draw(shoe);
		//Draw(shoe);
	}
	
	
	public int[] ScoreHand()
	{
		
		int [] iScore = new int[2];
		
		iScore[0] = 5;
		iScore[1] = 10;
		
		int[] scoreHand = new int[2];
		int points = 0;
		boolean aceInHand = false;
		int numAces	= 0;
		for (Card c: hand)
		{	
			if(c.geteRank() == eRank.ACE) {
				aceInHand = true;
				numAces ++;
				
			}
			int cardValue = c.geteRank().getiRankNbr();
			
			points += cardValue;
			if(points > 21) {
				if(aceInHand) {
					points -= 10;
				}
			}
			scoreHand[0] = points;
			
		}
		
		return scoreHand;
	}
	
	public void Draw(Deck d) throws Exception
	{
		hand.add(d.draw());
	}
	
	private void AddCard(Card c)
	{
		hand.add(c);
	}
	
}

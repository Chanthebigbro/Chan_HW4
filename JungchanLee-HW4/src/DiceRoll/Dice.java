package DiceRoll;

import java.util.Random;

public class Dice {


	int sides;
	
	Dice(int sides)
	{
		
		this.sides = sides;
		
	}
	
	int roll()
	{
		
		double doublenumber;
		int intnumber;
		
		Random r = new Random ();
		
		doublenumber = Math.sqrt(Math.pow((r.nextInt()),2))%(sides-1);
		
		intnumber = (int) Math.round(doublenumber);
		
		return intnumber+1;
		
	}
	
}

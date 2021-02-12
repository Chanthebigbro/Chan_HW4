package DiceRoll;

public class Driver {

	public static void main(String[] args) {
	
		System.out.println("hello world");
		
		Dice d6 = new Dice(6);
		
		for(int i = 0 ; i < 10; i++)
		{
			System.out.println(d6.roll());
		}
		
	}

}

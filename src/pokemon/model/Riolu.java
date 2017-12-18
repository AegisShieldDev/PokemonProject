package pokemon.model;

public class Riolu extends Pokemon implements Fighting
{
	public Riolu(int number, String name)
	{
		super(number, name);
	}
	
	public String brickBreak(int level)
	{		
		return "This move is level: " + level;
	}
	public String closeCombat(int level)
	{		
		return "This move is level: " + level;
	}
	public String auraSphere(int level)
	{		
		return "This move is level: " + level;
	}
}

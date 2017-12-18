package pokemon.model;

public class Lucario extends Pokemon implements Fighting, Steel
{
	public Lucario(int number, String name)
	{
		super(number, name);
	}
	
	public String metalClaw(int level)
	{		
		return "This move is level: " + level;
	}
	public String flashCannon(int level)
	{		
		return "This move is level: " + level;
	}
	public String ironTail(int level)
	{		
		return "This move is level: " + level;
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

package pokemon.model;

public class Lucario extends Pokemon implements Fighting, Steel
{
	public Lucario()
	{
		super(448, "Lucario");
		setup();
	}
	
	public Lucario(String name)
	{
		super(448, name);
		setup();
	}
	
	public Lucario(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(225);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.50);
		this.setHealthPoints(70);
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

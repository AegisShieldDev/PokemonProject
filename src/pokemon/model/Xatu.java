package pokemon.model;

public class Xatu extends Pokemon implements Flying, Psychic
{
	public Xatu()
	{
		super(178, "Xatu");
		setup();
	}
	
	public Xatu(String name)
	{
		super(178, name);
		setup();
	}
	
	public Xatu(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(170);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.50);
		this.setHealthPoints(65);
	}
	
	public String aerialAce(int level)
	{		
		return "This move is level: " + level;
	}
	public String braveBird(int level)
	{		
		return "This move is level: " + level;
	}
	public String fly(int level)
	{		
		return "This move is level: " + level;
	}
	
	public String psyshock(int level)
	{		
		return "This move is level: " + level;
	}
	public String psychoCut(int level)
	{		
		return "This move is level: " + level;
	}
	public String confusion(int level)
	{		
		return "This move is level: " + level;
	}
}

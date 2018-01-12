package pokemon.model;

public class Natu extends Pokemon implements Flying, Psychic
{
	public Natu()
	{
		super(177, "Natu");
		setup();
	}
	
	public Natu(String name)
	{
		super(177, name);
		setup();
	}
	
	public Natu(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(120);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.50);
		this.setHealthPoints(40);
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

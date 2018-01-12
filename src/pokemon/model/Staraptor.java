package pokemon.model;

public class Staraptor extends Pokemon implements Flying
{
	public Staraptor()
	{
		super(398, "Staraptor");
		setup();
	}
	
	public Staraptor(String name)
	{
		super(398, name);
		setup();
	}
	
	public Staraptor(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(170);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.50);
		this.setHealthPoints(85);
	}
	
	public String aerialAce(int level)
	{		
		return "This move is level: " + level;
	}
	public String fly(int level)
	{		
		return "This move is level: " + level;
	}
	public String braveBird(int level)
	{		
		return "This move is level: " + level;
	}
}

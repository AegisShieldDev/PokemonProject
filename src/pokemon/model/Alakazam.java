package pokemon.model;

public class Alakazam extends Pokemon implements Psychic
{
	public Alakazam()
	{
		super(65, "Alakazam");
		setup();
	}
	
	public Alakazam(String name)
	{
		super(65, name);
		setup();
	}
	
	public Alakazam(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(185);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.50);
		this.setHealthPoints(55);
	}
	
	public String confusion(int level)
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
}

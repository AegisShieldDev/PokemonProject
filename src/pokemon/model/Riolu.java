package pokemon.model;

public class Riolu extends Pokemon implements Fighting
{
	public Riolu()
	{
		super(447, "Riolu");
		setup();
	}
	
	public Riolu(String name)
	{
		super(70, name);
		setup();
	}
	
	public Riolu(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(105);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.50);
		this.setHealthPoints(40);
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

package pokemon.model;

public class Xatu extends Pokemon implements Flying, Psychic
{
	public Xatu(int number, String name)
	{
		super(number, name);
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

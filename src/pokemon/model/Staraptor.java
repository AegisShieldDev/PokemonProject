package pokemon.model;

public class Staraptor extends Pokemon implements Flying
{
	public Staraptor(int number, String name)
	{
		super(number, name);
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

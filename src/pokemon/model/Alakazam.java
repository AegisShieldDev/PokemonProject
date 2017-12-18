package pokemon.model;

public class Alakazam extends Pokemon implements Psychic
{
	public Alakazam(int number, String name)
	{
		super(number, name);
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

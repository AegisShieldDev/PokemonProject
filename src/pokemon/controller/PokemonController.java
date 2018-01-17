package pokemon.controller;


import pokemon.model.Pokemon;
import pokemon.view.PokemonFrame;
import pokemon.model.*;
import java.util.List;

import java.util.ArrayList;

public class PokemonController
{
	private List<Pokemon> pokedex;
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		PokemonFrame myFrame = new PokemonFrame(this);
	}
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(input);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Error, invalid int");
		}
		
		return valid;
	}
	
	public boolean isValidDouble(String input)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(input);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Error, invalid double");
		}
		
		return valid;
	}
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
	}
	
	public void buildPokedex()
	{
		pokedex.add(new Xatu());
		pokedex.add(new Natu());
		pokedex.add(new Lucario());
		pokedex.add(new Riolu());
		pokedex.add(new Staraptor());
		pokedex.add(new Alakazam());
	}
	
	public void start()
	{
		buildPokedex();
	}
}

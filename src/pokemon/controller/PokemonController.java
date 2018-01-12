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
	
	public boolean isValidInteg(String input)
	{
		return false;
	}
	
	public boolean isValidDouble(String input)
	{
		return false;
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

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
	
	public void buildPokedex()
	{
		pokedex.add(new Xatu(1,""));
		pokedex.add(new Natu(1,""));
		pokedex.add(new Lucario(1,""));
		pokedex.add(new Riolu(1,""));
		pokedex.add(new Staraptor(1,""));
		pokedex.add(new Alakazam(1,""));
	}
	
	public void start()
	{
		buildPokedex();
	}
}

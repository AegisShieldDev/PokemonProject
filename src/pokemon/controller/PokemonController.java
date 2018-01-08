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
	
	public void buildPokedex()
	{
		
		pokedex.add(new Xatu(1,""));
	}
	
	public void start()
	{
		buildPokedex();
	}
}

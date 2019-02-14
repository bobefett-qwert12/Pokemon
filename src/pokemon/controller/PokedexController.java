package pokemon.controller;

import pokemon.model.Pokemon;
import java.util.ArrayList;

public class PokedexController
{	
	public ArrayList<Pokemon> pokemonList;
	
	public PokedexController()
	{
		this.pokemonList = new ArrayList<Pokemon>(5);
	}
	
	public void start()
	{
		
	}
	
	public String[] buildPokedexText()
	{
		String [] names = new String[pokemonList.size()];
		for(int index = 0; index < pokemonList.size(); index++)
		{
			names[index] = pokemonList.get(index).getName();
		}
		return names;
	}
	
	public void updatePokemon(int index, String [] data)
	{
		if(data.length == 5)
		{
			Pokemon current = pokemonList.get(index);
			current.setAttackPoints(Integer.parseInt(data[0]));
			current.setEnhancementModifier(Double.parseDouble(data[1]));
			current.setHealthPoints(Integer.parseInt(data[2]));
			current.setName(data[3]);
			current.setCanEvolve(Boolean.parseBoolean(data[4]));
		}
	}
	
	public boolean isInt(String maybeInt)
	{
		try
		{
			Integer.parseInt(maybeInt);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		catch(NullPointerException e)
		{
			return false;
		}
		return true;
	}
	
	public boolean isDouble(String maybeDouble)
	{
		try
		{
			Double.parseDouble(maybeDouble);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		catch(NullPointerException e)
		{
			return false;
		}
		return true;
	}
}

package pokemon.controller;

import pokemon.model.Ivysaur;
import pokemon.model.Flareon;
import pokemon.model.Charizard;
import pokemon.model.Pikachu;
import pokemon.model.Squirtle;
import pokemon.model.Pokemon;
import pokemon.model.Samus;
import java.util.ArrayList;
import pokemon.view.PokedexFrame;

public class PokedexController
{	
	public ArrayList<Pokemon> pokemonList;
	public PokedexFrame frame;
	public Pikachu Pikachu;
	public Charizard Charizard;
	public Ivysaur Ivysaur;
	public Flareon Flareon;
	public Squirtle Squirtle;
	public Samus Samus;
	
	public PokedexController()
	{
		this.pokemonList = new ArrayList<Pokemon>(5);
		this.frame = new PokedexFrame(this);
		this.Pikachu = new Pikachu(25, "Pikachu");
		this.Squirtle = new Squirtle(7, "Squirtle");
		this.Charizard = new Charizard(6, "Charizard");
		this.Flareon = new Flareon(136, "Flareon");
		this.Ivysaur = new Ivysaur(2, "Ivysaur");
		this.Samus = new Samus(999, "Samus Aran");
		buildPokemonList();
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
	
	public void buildPokemonList()
	{
		pokemonList.add(Ivysaur);
		pokemonList.add(Flareon);
		pokemonList.add(Charizard);
		pokemonList.add(Pikachu);
		pokemonList.add(Squirtle);
		pokemonList.add(Samus);
	}
	
	public PokedexFrame getFrame()
	{
		return this.frame;
	}
	
	public ArrayList<Pokemon> getPokemonList()
	{
		return pokemonList;
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

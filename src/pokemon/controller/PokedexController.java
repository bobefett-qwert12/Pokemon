package pokemon.controller;

import pokemon.model.Ivysaur;
import pokemon.model.Flareon;
import pokemon.model.Charizard;
import pokemon.model.Pikachu;
import pokemon.model.Squirtle;
import pokemon.model.Pokemon;
import pokemon.model.Samus;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import pokemon.view.PokedexFrame;
import java.io.*;

public class PokedexController
{	
	public ArrayList<Pokemon> pokemonList;
	public PokedexFrame frame;
	public String saveFile = "backup.pokemon";
	public Pikachu Pikachu;
	public Charizard Charizard;
	public Ivysaur Ivysaur;
	public Flareon Flareon;
	public Squirtle Squirtle;
	public Samus Samus;
	
	public PokedexController()
	{
		this.pokemonList = new ArrayList<Pokemon>(6);
		buildPokemonList();
		this.frame = new PokedexFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public String getPokemonData(int pokemonIndex, int index)
	{
		Pokemon pokemon = pokemonList.get(pokemonIndex);
		switch(index)
		{
			case 1:
				return pokemon.getHealthPoints();
			case 2:
				return pokemon.getAttackPoints();
			case 3:
				return (int)pokemon.getEnhancementModifier();
			case 4:
				return pokemon.getNumber();
			case 5:
				return pokemon.getName();
			case 6:
				if(pokemon.isCanEvolve())
				{
					return "True";
				}
				else
				{
					return "False";
				}
			default:
				return 0;
		}
	}
	
	public void savePokedex()
	{
		try
		{
			FileOutputStream saveStream = new FileOutputStream(saveFile);
			ObjectOutputStream output = new ObjectOutputStream(saveStream);
			output.writeObject(pokemonList);
			output.close();
			saveStream.close();
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(frame, e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void loadPokedex()
	{
		try
		{
			ArrayList<Pokemon> saved = new ArrayList<Pokemon>();
			FileInputStream inputStream = new FileInputStream(saveFile);
			ObjectInputStream input = new ObjectInputStream(inputStream);
			saved = (ArrayList<Pokemon>)input.readObject();
			input.close();
			inputStream.close();
			pokemonList = saved;
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(frame,  "No Save File", "Loading Pokemon", JOptionPane.INFORMATION_MESSAGE);
		}
		catch(ClassNotFoundException e)
		{
			JOptionPane.showMessageDialog(frame, e.getMessage(), "Type Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public String[] buildPokedexText()
	{
		String [] names = new String[pokemonList.size() + 1];
		for(int index = 1; index < pokemonList.size() + 1; index++)
		{
			names[index] = pokemonList.get(index - 1).getName();
		}
		names[0] = "Select a Pokemon";
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
		this.Pikachu = new Pikachu(25, "Pikachu");
		this.Squirtle = new Squirtle(7, "Squirtle");
		this.Charizard = new Charizard(6, "Charizard");
		this.Flareon = new Flareon(136, "Flareon");
		this.Ivysaur = new Ivysaur(2, "Ivysaur");
		this.Samus = new Samus(999, "Samus");
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

package pokemon.model;

import javax.swing.JOptionPane;

public class Ivysaur extends Bulbasaur implements PoisonType
{
	public Ivysaur(int number, String name)
	{
		super(number, name);
		this.setCanEvolve(true);
	}
	
	public void sludgeBomb()
	{
		JOptionPane.showMessageDialog(null, "The pokemon tosses a sludge bomb!");
	}
	
	public void toxic()
	{
		JOptionPane.showMessageDialog(null, "The pokemon releases a toxic cloud!");
	}
}

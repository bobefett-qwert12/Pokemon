package pokemon.model;

import javax.swing.JOptionPane;

public class Charmander extends Pokemon implements FireType
{
	public Charmander(int number, String name)
	{
		super(number, name);
		this.setCanEvolve(true);
	}
	
	public void flamethrower()
	{
		JOptionPane.showMessageDialog(null, "The pokemon breathes fire at the opponent!");
	}
	
	public void ember()
	{
		JOptionPane.showMessageDialog(null, "The pokemon kicks an ember at the opponent!");
	}
}

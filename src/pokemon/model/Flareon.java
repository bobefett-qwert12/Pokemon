package pokemon.model;

import javax.swing.JOptionPane;

public class Flareon extends Eevee implements FireType
{
	public Flareon(int number, String name)
	{
		super(number, name);
		this.setCanEvolve(false);
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

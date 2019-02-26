package pokemon.model;

import javax.swing.JOptionPane;

public class Bulbasaur extends Pokemon implements GrassType
{
	public Bulbasaur(int number, String name)
	{
		super(number, name);
		this.setCanEvolve(true);
	}
	
	public void solarBeam()
	{
		JOptionPane.showMessageDialog(null, "The pokemon charged up and fired a Solar Beam!");
	}
	
	public void razorLeaf()
	{
		JOptionPane.showMessageDialog(null, "The pokemon tosses a leaf to cut the opponent!");
	}
}

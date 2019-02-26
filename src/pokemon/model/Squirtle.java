package pokemon.model;

import javax.swing.JOptionPane;

public class Squirtle extends Pokemon implements WaterType
{
	public Squirtle(int number, String name)
	{
		super(number, name);
		this.setCanEvolve(true);
	}
	
	public void splash()
	{
		JOptionPane.showMessageDialog(null, "The pokemon splashed with water!");
	}
	
	public void surf()
	{
		JOptionPane.showMessageDialog(null, "The pokemon surfs into battle!");
	}
}

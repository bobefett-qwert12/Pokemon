package pokemon.model;

import javax.swing.JOptionPane;

public class Charizard extends Charmeleon implements FlyingType
{
	public Charizard(int number, String name)
	{
		super(number, name);
		this.setCanEvolve(false);
	}
	
	public void airCutter()
	{
		JOptionPane.showMessageDialog(null, "The pokemon leaps into the air and slashes at the opponent!");
	}
	
	public void hurricane()
	{
		JOptionPane.showMessageDialog(null, "The pokemon creates a devastating hurricane!");
	}
}

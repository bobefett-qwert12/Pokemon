package pokemon.model;

import javax.swing.JOptionPane;

public class Samus extends Pokemon implements FlyingType, MetalType
{
	public Samus(int number, String name)
	{
		super(number, name);
		this.setCanEvolve(true);
	}
	
	public void airCutter()
	{
		JOptionPane.showMessageDialog(null, "The pokemon leaps into the air and slashes at the opponent!");
	}
	
	public void hurricane()
	{
		JOptionPane.showMessageDialog(null, "The pokemon creates a devastating hurricane!");
	}
	
	public void screwAttack()
	{
		JOptionPane.showMessageDialog(null, "The pokemon leaps into the air, surrounded by energy!");
	}
	
	public void speedBooster()
	{
		JOptionPane.showMessageDialog(null, "The pokemon dashes with incredible speed into the opponent!");
	}
}

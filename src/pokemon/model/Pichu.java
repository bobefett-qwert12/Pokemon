package pokemon.model;

import javax.swing.JOptionPane;

public class Pichu extends Pokemon implements ElectricType
{
	public Pichu(int number, String name)
	{
		super(number, name);
		this.setCanEvolve(true);
	}
	
	public void voltTackle()
	{
		JOptionPane.showMessageDialog(null, "The pokemon charges up some static, then tackles the opponent!");
	}
	
	public void thunderBolt()
	{
		JOptionPane.showMessageDialog(null, "The pokemon zaps the opponent with electricity!");
	}
}

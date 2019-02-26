package pokemon.model;

import javax.swing.JOptionPane;

public class Eevee extends Pokemon implements NormalType
{
	public Eevee(int number, String name)
	{
		super(number, name);
		this.setCanEvolve(true);
	}
	
	public void tackle()
	{
		JOptionPane.showMessageDialog(null, "The pokemon tackles the opponent!");
	}
	
	public void quickAttack()
	{
		JOptionPane.showMessageDialog(null, "The pokemon dashes into the opponent!");
	}
}

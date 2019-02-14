package pokemon.model;

public class Ivysaur extends Bulbasaur implements PoisonType
{
	public Ivysaur(int number, String name)
	{
		super(number, name);
		this.setCanEvolve(true);
	}
	
	public void sludgeBomb()
	{
		
	}
	
	public void toxic()
	{
		
	}
}

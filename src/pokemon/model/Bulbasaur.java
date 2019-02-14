package pokemon.model;

public class Bulbasaur extends Pokemon implements GrassType
{
	public Bulbasaur(int number, String name)
	{
		super(number, name);
		this.setCanEvolve(true);
	}
	
	public void solarBeam()
	{
		
	}
	
	public void razorLeaf()
	{
		
	}
}

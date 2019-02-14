package pokemon.model;

public class Pikachu extends Pichu
{
	public Pikachu(int number, String name)
	{
		super(number, name);
		this.setCanEvolve(true);
	}
}

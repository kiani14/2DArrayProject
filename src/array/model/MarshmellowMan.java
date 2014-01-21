package candy.model;

public class MarshmellowMan 
{
	//Declaration section
	private String name;
	private int arms;
	private int legs;
	private int eyes;
	private boolean hasButton;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setArms(int arms)
	{
		this.arms = arms;
	}
	public void setLegs(int legs)
	{
		this.legs = legs;
	}
	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}
	public void setHasButton(boolean hasButton)
	{
		this.hasButton = hasButton;
	}
	
	public String getName()
	{
		return name;
	}
	public int getArms()
	{
		return arms;
	}
	public int getLegs()
	{
		return legs;
	}
	public int getEyes()
	{
		return eyes;
	}
	public boolean getHasButton()
	{
		return hasButton;
	}

	public MarshmellowMan()
	{
		name = "Smooshy";
		arms = 2;
		legs = 2;
		eyes = 3;
		hasButton = true;
	}
	/**
	 * Create a MarshmellowMan
	 * @param name The name of the creature.
	 * @param eyes The number of eyes the man has.
	 * @param legs The number of legs the man has.
	 * @param arms The number of eyes the man has.
	 * @param hasButton Whether or not the man has a button.
	 */
	public MarshmellowMan(String name, int eyes, int legs, int arms, boolean hasButton)
	{
		this.name = name;
		this.arms = arms;
		this.legs = legs;
		this.eyes = eyes;
		this.hasButton = hasButton;
		
	}
}

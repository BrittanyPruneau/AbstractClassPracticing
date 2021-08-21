package cutter;


public class ElectricPruningShears extends PruningShears 
{
	private boolean power; 

	public ElectricPruningShears(int size) 
	{
		super(size);
	}
	
	public Boolean isOn()
	{
		return power; 
	}
	
	public void onOff()
	{
		power = !power; 
	}
	
	@Override
	public String cut() 
	{
		if(isOn())
			return super.cut(); 
		else 
			return ""; 
	}

	@Override
	public String toString() 
	{
		return super.toString() + "power=" + (power ? "on" : "off");
	}
	
	
	
}

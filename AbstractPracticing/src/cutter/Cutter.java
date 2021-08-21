package cutter;

public abstract class Cutter 
{
	private int size;

	/**
	 * @param size
	 */
	public Cutter(int size) 
	{
		this.size = size;
	}

	/**
	 * @return the size
	 */
	public int getSize() 
	{
		return size;
	} 
	
	/** Returns a string that describes how this object cuts. 
	 * 
	 * @return a dscription how the object cuts 
	 */
	
	public abstract String cut();

	/**
	 * returns a string of the following format:
	 * {name of class size] = {size}
	 * 
	 */
	@Override
	public String toString() 
	{
		return "Cutter size =" + size + "\"";
	}
	
	

}

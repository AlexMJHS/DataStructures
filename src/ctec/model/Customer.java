package ctec.model;

/**
 * 
 * @author Alejandro Magallanes
 * @version 0.1 May 6, 2016
 *
 */
public class Customer
{
	private boolean hasOrder;
	private String name;
	private double total;
	
	/**
	 * 
	 * @param hasOrder
	 * @param name
	 * @param total
	 */
	public Customer(boolean hasOrder, String name, double total)
	{
		this.hasOrder = hasOrder;
		this.name = name;
		this.total = total;
	}
	
	/**
	 * 
	 * @return the hasOrder
	 */
	public boolean isHasOrder()
	{
		return hasOrder;
	}
}

/*
This class is to get the total number of items , total quantity , total price and total tax of the order
*/
public class Invoice
{
	private long totalNumberOfLineItems;
	private long totalQuantity;
	private double totalPrice;
	private double totalTax;
	
	public Invoice(long totalNumberOfLineItems , long totalQuantity , double totalPrice , double totalTax)
	{
		this.totalNumberOfLineItems = totalNumberOfLineItems;		
		this.totalQuantity = totalQuantity;
		this.totalPrice = totalPrice;
		this.totalTax = totalTax;
	}
	
	public long getTotalOfLineItems()
	{
		return this.totalNumberOfLineItems;
	}
	
	public long getTotalQuantity()
	{
		return this.totalQuantity; 
	}
	
	public double getTotalPrice()
	{
		return this.totalPrice;
	}
	
	public double getTotalTax()
	{
		return this.totalTax;
	}
}
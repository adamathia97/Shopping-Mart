/*
This class is create an item with specific unit price and quantity
*/
public class LineItem
{
	private String productName;
	private long quantity;
	private double unitPrice;
	
	public LineItem(String productName , long quantity , double unitPrice)
	{
		this.productName = productName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	public String getProductName()
	{
		return this.productName;
	}
	
	public long getQuantity()
	{
		return this.quantity;
	}
	
	public double getUnitPrice()
	{
		return this.unitPrice;
	}
}
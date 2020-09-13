/*
This class is to generate total tax of the order
*/
public class TaxCalculator
{
	private double taxRate;
	
	public TaxCalculator(double taxRate)
	{
		this.taxRate = taxRate;
	}
	
	public TaxCalculator()
	{
		this.taxRate = 0.2;
	}
	
	public double calculateTax(Order order)
	{
		LineItem[] l1 = order.getAllLineItems();
		double tax = 0;
		if(l1.length <= 6)
		{
			for(int i = 0 ; i < l1.length ; i++)
			{
				tax+= l1[i].getQuantity()*l1[i].getUnitPrice();
			}
			tax = tax * 0.2;
			return tax;
		}
		else
		{
			return tax;
		}
	}
}
/*
This class is to get Total tax , total price and total quantity on the order
*/
public class InvoiceCalculator
{
	private TaxCalculator taxCalculator;
	
	public InvoiceCalculator(TaxCalculator taxCalculator)
	{
		this.taxCalculator = taxCalculator;
	}
	
	public Invoice generateInvoice(Order order)
	{
		LineItem[] l1 = order.getAllLineItems();
		long totalQuantity = 0;
		double totalPrice = 0;
		double totalTax = 0;
		for(int i = 0 ; i < l1.length ; i++)
		{
			totalQuantity += l1[i]. getQuantity();
			totalPrice += l1[i].getQuantity()*l1[i].getUnitPrice();
		}
		totalTax = taxCalculator.calculateTax(order);
		Invoice invoice = new Invoice(l1.length , totalQuantity , totalPrice , totalTax);
		return invoice;
	}
}
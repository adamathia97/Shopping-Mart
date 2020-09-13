/*
This class is to just print the whole invoice
*/
public class InvoicePrinter
{
	public void print(Invoice invoice)
	{
		System.out.println("Total number of Products : " + invoice.getTotalOfLineItems());
		System.out.println("Total Quantity : " + invoice.getTotalQuantity());
		System.out.println("Total Price : " + invoice.getTotalPrice());
		System.out.println("Total Tax : " + invoice.getTotalTax());
	}
}
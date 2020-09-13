import java.util.Scanner;

public class test2
{
	public static void main(String[] args) 
	{
		TaxCalculator taxCalculator = new TaxCalculator();
		InvoiceCalculator invoiceCalculator = new InvoiceCalculator(taxCalculator);
		OrderPrinter items = new OrderPrinter();
		InvoicePrinter invoices = new InvoicePrinter();
		Order order1 = new Order();
		order1.addLineItem("Lord of the Rings" , 30 , 20.5);
		order1.addLineItem("Bible" , 5 , 5);
		order1.removeLineItem("Harry Potter");
		order1.addLineItem("Lord of the Rings"  , 22.5);
		order1.addLineItem("Harry Potter" , 3 , 10);
		CheckoutService checkoutService = new CheckoutService(invoiceCalculator , items , invoices);
		checkoutService.checkout(order1);
	}
}
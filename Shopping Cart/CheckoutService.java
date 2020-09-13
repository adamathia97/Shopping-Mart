/*
This class is used to display the invoice of the order
*/
public class CheckoutService
{
	private InvoiceCalculator invoiceCalculator;
	private OrderPrinter orderPrinter;
	private InvoicePrinter invoicePrinter;
	
	public CheckoutService (InvoiceCalculator invoiceCalculator,OrderPrinter orderPrinter,InvoicePrinter invoicePrinter)
	{
		this.invoiceCalculator = invoiceCalculator;
		this.orderPrinter = orderPrinter;
		this.invoicePrinter = invoicePrinter;
	}
	
	public void checkout(Order order)
	{
		Invoice invoice ;
		invoice = invoiceCalculator.generateInvoice(order);
		orderPrinter.print(order);
		invoicePrinter.print(invoice);
	}
}
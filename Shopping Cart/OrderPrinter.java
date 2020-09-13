/*
This class is to display the order including each items name , unit price and quantity
*/
public class OrderPrinter
{
	private void printHeader(LineItem item)
	{
		System.out.println("Product name : " + item.getProductName() + " , Quantity : " + item.getQuantity() + " , Unit Price : " + item.getUnitPrice());
	}
	
	public void print(Order order)
	{
		LineItem[] l1 = order.getAllLineItems();
		for(int i = 0; i < l1.length ; i++)
		{
			printHeader(l1[i]);
		}
	}
}
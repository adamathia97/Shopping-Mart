import java.util.Scanner;

public class test1
{
	public static void main(String[] args) 
	{
		Order order1 = new Order();
		Order order2 = new Order();
		order1.addLineItem("Lord of the Rings" , 30 , 20.5);
		order1.addLineItem("Bible" , 50 , 5);
		order1.addLineItem("Lord of the Rings"  , 22.5);
		order1.addLineItem("Harry Potter" , 300 , 10);
		order1.removeLineItem("Harry Potter");
		OrderPrinter items = new OrderPrinter();
		items.print(order1);
		items.print(order2);
	}
}
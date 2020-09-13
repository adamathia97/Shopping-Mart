/*
This class is to generate the full order with items 
*/
import java.util.ArrayList;

public class Order
{
	private ArrayList<LineItem> lineItems;
	
	public Order()
	{
		this.lineItems = new ArrayList<LineItem>();
	}
	
	public void addLineItem(String productName, long quantity, double unitPrice)
	{
		boolean same = false;
		int k = 0;
		LineItem l1 = new LineItem(productName , quantity , unitPrice);
		for(int i = 0; i < this.lineItems.size() ; i++)
		{
			if(this.lineItems.get(i).getProductName() == productName)
			{
				same = true;
				k = i;
				break;
			}
		}
		if(!same)
		{
			this.lineItems.add(l1);
		}
		else
		{
			this.lineItems.remove(k);
			this.lineItems.add(l1);
		}
	}
	
	public void addLineItem(String productName , double unitPrice)
	{
		boolean same = false;
		int k = 0;
		LineItem l1 = new LineItem(productName , 1 , unitPrice);
		for(int i = 0; i < this.lineItems.size() ; i++)
		{
			if(this.lineItems.get(i).getProductName() == productName)
			{
				same = true;
				k = i;
				break;
			}
		}
		if(!same)
		{
			this.lineItems.add(l1);
		}
		else
		{
			this.lineItems.remove(k);
			this.lineItems.add(l1);
		}
	}
	
	public void removeLineItem(String productName)
	{
		for(int i = 0; i < this.lineItems.size() ; i++)
		{
			if(this.lineItems.get(i).getProductName() == productName)
			{
				this.lineItems.remove(i);
				break;
			}
		}
	}
	
	public LineItem[] getAllLineItems()
	{
		LineItem[] l1 = this.lineItems.toArray(new LineItem[0]);
		return l1;
	}
}
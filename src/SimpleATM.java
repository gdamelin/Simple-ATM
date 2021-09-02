import java.util.*;
public class SimpleATM
{
	private HashMap <String, Double> map = new HashMap <> ();
	public double checkBalance(String AccountID)
	{
		if(map.containsKey(AccountID)) {
			return map.get(AccountID);
		}
		else
		{
			throw new IndexOutOfBoundsException("No such ID exists");
		}
	}
	public void withdraw(String id,double amount)
	{
		if (map.containsKey(id))
		{
			if(map.get(id)<amount)
			{
				System.out.println("please don't steal money from us");
			}
			else {
			double oldValue = map.remove(id);
			double newValue = oldValue - amount;
			map.put(id, newValue);
			}
		}
		else
		{
			throw new IndexOutOfBoundsException("no such id exists");
		}
	}
	public void deposit (String id, double amount)
	{
		if (amount > 0)
		{
			if (map.containsKey(id))
			{
				double oldValue = map.remove(id);
				double newValue = oldValue + amount;
				map.put(id, newValue);
			}
			else
			{
				map.put(id, amount);
			}
		}
	}
}

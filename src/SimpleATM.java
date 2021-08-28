import java.util.*;

public class SimpleATM
{
	private HashMap <String, Double> map = new HashMap <> ();
	
	public void deposit (String id, double amount)
	{
		if (amount > 0)
		{
			if (map.containsKey(id))
			{
				double oldValue = map.get(id);
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

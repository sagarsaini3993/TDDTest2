
import java.util.Arrays;

public class TTC {
	
	
	
	public double calculateTotal(String[] from, String[] to)
	{
		
		
		String[] Z1 = {"DonMills","Leslie"};
		String[] Z2 = {"Sheppard","Finch"};
		
		
		
		
		boolean fromZone1 = Arrays.stream(Z1).anyMatch(from[0]::equals);
		boolean toZone1 = Arrays.stream(Z1).anyMatch(to[0]::equals);

		boolean fromZone2 = Arrays.stream(Z2).anyMatch(from[0]::equals);
		boolean toZone2 = Arrays.stream(Z2).anyMatch(to[0]::equals);
		
		if(fromZone1 == true && toZone1 == true)
		{
			return 2.5;
		}
		
		else if(fromZone2 == true && toZone2 == true)
		{
			return 3.00;
		}
		
		else if(fromZone1 == true && toZone2 == true)
		{
			return 3.00;
		}
		
		
		
		
		
		
	
		
		return 0;
	}
	

}

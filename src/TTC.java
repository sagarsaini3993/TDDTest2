
public class TTC {
	
	
	
	public double calculateTotal(String[] from, String[] to)
	{
		
		
		String[] Z1 = {"DonMills","Leslie"};
		String[] Z2 = {"Sheppard","Finch"};
		if(from[0] == Z1[1] && to[0] == Z1[0]) {
			
			return 2.5;
			
		}
		else if(from[0] == Z2[0] && to[0] == Z2[1]) {
		
			return 3.00;
		}
		
		return 0;
	}
	

}

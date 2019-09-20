package AlgorithmPrograms;

public class VendingMachine 
{
	public static void main(String[] args)
	{
		Utility u = new Utility();
		int choice = 0;
		try 
		{
			do
			{
				int[] notes = { 1000,500,100,50,10,5,2,1};
	
	
				//Utility utility=new Utility();
	
				//ask the user enter the money
				System.out.println("Enter the Amount:");
				int money = u.inputInteger();
	
				// call the calculate method of utility class
				u.calculate(money,notes,0);
				
				System.out.println("Total Number of Notes are :"+u.total);
				System.out.println("press 1 for continue");
				choice = u.inputInteger();
			}while(choice == 1);
		}
		catch(Exception e) 
		{
			System.out.println("Invalid input "+e);
		}
	}
}

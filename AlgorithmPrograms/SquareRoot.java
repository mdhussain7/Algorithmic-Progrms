package AlgorithmPrograms;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Utility u = new Utility();
		  System.out.println("Enter the number for which you want to calculate the root:");
	      double c = u.inputDouble();
	      double epsilon = 1e-15; 
	      u.squareRoot(c,epsilon);
	}
}

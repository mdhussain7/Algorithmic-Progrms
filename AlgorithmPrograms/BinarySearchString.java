package AlgorithmPrograms;

public class BinarySearchString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();
		System.out.println("Enter the number of words you want to insert in Sorted order:");
	    int n = u.inputInteger();
	    String listofWords[] = u.arrayString(n);
	    System.out.println("Enter the Key element:");
	    String stringToFind = u.inputString();
	    int lowestIndex = 0;
	    int highestIndex = listofWords.length-1;
	    int middleIndex = 0;
	    u.binarySearchString(lowestIndex,highestIndex,middleIndex,listofWords,stringToFind);
	}
}

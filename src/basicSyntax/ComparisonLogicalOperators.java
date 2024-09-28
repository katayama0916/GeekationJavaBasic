package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a=2;
		int b=1;
		boolean isGreater=(a>b);
		System.out.println(isGreater);
		
		
	    boolean isSunny = true; 
		boolean isWarm = true;  
		
		boolean andResult1 =(isSunny && isWarm);
		System.out.println(andResult1);
		
		int x= 2;
		int y= 4;
		boolean andResult2 =(x >= 0 && y % 2 == 0);
	    System.out.println(andResult2);
	    
	    boolean hasPermission =false;
	    
	    boolean notResult = !(hasPermission);
	    System.out.println(notResult);
		
		
		

	}

}

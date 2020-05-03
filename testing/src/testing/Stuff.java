package testing;

public class Stuff {
	
	public static void main (String []args) {
		
	System.out.println(sum(5));
	System.out.println(sum(-1));
		
	}
		 
		 
	
	
	
static int sum(int boundary) {
	int i, sum = 0;
	for(i = 1; i<= boundary;i++) {
		sum+=i;
	}
	 return sum;
}
}

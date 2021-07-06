
public class RandomNumber {

	
	
	public static void chooseRandom (int a , int b) {
		
		int min = (a<b)?a: b;
		 int max =( b>=a)?b:a;
		double result=Math.floor (Math.random() * (max - min) + min);
		
	    int finalResult = (int) Math.round(result); 
		
		System.out.println(finalResult);	 
		
		
	}
	
public static void main (String arg[])	{
	

	chooseRandom (1,360);
	
}
	
	
	
	
	
	
}

import java.util.Scanner;

public class Assigment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner (System.in);
		
		int n =in.nextInt();
		int [][] arr = new int[n][n];
		
		for (int i=0 ;i<n;i++) {
			
			for(int j=0; j<n;j++) {
				
			arr[i][j]=in.nextInt();	
				
			}
			
				}
		
		for(int j=0; j<n;j++) {
			
			for (int i=n-1 ;i>=0;i--) {
				System.out.print("\t"+arr[i][j]);
				
			}
			System.out.println();
			 
					
		}
		
		}

}

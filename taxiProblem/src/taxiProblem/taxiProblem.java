package taxiProblem;

import java.util.Scanner;

public class taxiProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
	Scanner in = new Scanner (System.in);	

	
	int n = in.nextInt();
	
	//4 4 4 4 4
	// 3 3 3 3 1 1 1 1
	//  2 2 2 2	//  1 1 1 2

	int taxi =0;
	int freq1=0;
	int freq2=0;
	int freq3=0;
	int freq4=0;
	
	for (int i=0;i<n;i++) {
		
	int	g=in.nextInt();
	if (g== 4) 
		freq4++;
		
	else if (g==3)
		
		freq3++;
	else if (g==2)
		
		freq2++;
	
	else if (g==1)
		
		freq1++;
	
	}
	
	taxi+=freq4;
	taxi+=freq3;
	
	freq1-=freq3;
	if (freq1<0)
		freq1=0;
	
	
	if (freq2%2==0) {
		
		taxi+=freq2/2;
		}
	else {
		taxi+=freq2/2 +1;
		freq1-=2;
	if (freq1<0)
		freq1=0;
 }	
	
	if (freq1%4==0)
		taxi+=freq1/4;
	else
		taxi+=(freq1/4)+1;
		
	
		
	System.out.println("number of taxies : " + taxi)	;
	// just to commite	
	}

}

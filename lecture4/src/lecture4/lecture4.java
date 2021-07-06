package lecture4;

import java.util.Scanner;

public class lecture4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		int length = in.nextInt();
		int []studentGrades = new int [length];
		int sum = 0 ;
		double avg = 0;
		int grade ;
		int stuAbove=0;
		for (int i =0 ; i<length ; i++) {
			grade = in.nextInt();
			studentGrades[i]=grade;
				sum +=grade;
		}
		avg = sum /(double) length;
		System.out.println("the avg is "+ " : " + avg);
		
		for (int i =0 ; i<length ; i++) {
			
			if (studentGrades[i]>avg) 
			{
				stuAbove++;
				System.out.println(" this grade above the avg :" +studentGrades[i]);
				
			}
		}
		
		System.out.println("no of stu above the avg :" + stuAbove);
	}

}

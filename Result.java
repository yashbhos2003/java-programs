import java.util.Scanner;

class Result{
     public static void main(String []args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Score: ");
	 int score=sc.nextInt();s

	String result= (score>=90)? "Excellent"
		      :(score>=75)? "Good"
		      :(score>=50)? "Average"	
		      : "Poor";	

	System.out.println(result);    
     }		
}
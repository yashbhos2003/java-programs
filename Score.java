import java.util.Scanner;

class Score{
     public static void main(String []args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Score: ");
	 int score=sc.nextInt();
	
	if(score>=40){
	  System.out.println("Pass");
	}else{
	   System.out.println("Fail");
	}
     }		
}
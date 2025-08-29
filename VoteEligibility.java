import java.util.Scanner;

class VoteEligibility{
     public static void main(String []args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age: ");
	 int age=sc.nextInt();

	if(age>=18 && age<=120){
	  System.out.println("Candidate is eligible to cast his/her vote");
	}else{
	   System.out.println("Candidate is not eligible to cast his/her vote");
	}
     }		
}
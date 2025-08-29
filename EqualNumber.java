import java.util.Scanner;

class EqualNumber{
     public static void main(String []args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first num: ");
	 int num1=sc.nextInt();
	System.out.println("Enter second num: ");
	 int num2=sc.nextInt();

	if(num1==num2){
	  System.out.println("The given number are equal");
	}else{
	   System.out.println("The given number are not equal");
	}
     }		
}
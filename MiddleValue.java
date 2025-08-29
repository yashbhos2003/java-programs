import java.util.Scanner;

class MiddleValue{
      public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first input:");
	  int p=sc.nextInt();
	System.out.println("Enter second input:");
	  int q=sc.nextInt();
	System.out.println("Enter third input:");
	  int r=sc.nextInt();

	String output=((p+q)/2==r)? "Middle number is: "+r
	              :((p+r)/2==q)? "Middle number is: "+q
		      :((q+r)/2==p)? "Middle number is: "+p
		      :	"No middle number found";	
	
	System.out.println(output);
    }	
 }
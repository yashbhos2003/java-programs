//give perfect square number in range
import java.util.Scanner;

class SquareNumber{
      public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	  int range=sc.nextInt();
	 for(int i=1;i<=range;i++){
		int squareNumber=i*i;
	     if(squareNumber<=range){
	System.out.println(squareNumber);
	     }		
       	 }

     }
}
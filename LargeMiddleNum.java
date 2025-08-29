import java.util.Scanner;

class LargeMiddleNum{
      public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any three digit number:");
	  int number=sc.nextInt();
	  int first,middle,last;	
	
	     int rem1=number%10;	
	     last=rem1;
	     number=number/10;		
	
	
	     int rem2=number%10;	
	     middle=rem2;
	     number=number/10;	
             
	     int rem3=number%10;	
	     first=rem3;
	     number=number/10;	
	
	String output=(first+last==middle)? "Equal or not Greater "
		       :(first+last<middle)? "not greater"
		       :"greater";
	System.out.println(output);	
    }	
}
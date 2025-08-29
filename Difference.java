import java.util.Scanner;

class Difference{
      public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first input:");
	  int num1=sc.nextInt();
	System.out.println("Enter second input:");
	  int num2=sc.nextInt();
	
	  int diff=num1-num2;
           if(diff <0){
              diff=-(diff);
             }
	System.out.println(diff);
  
	//diff=Math.abs(diff);
	//System.out.println(diff);
	String output=(diff>10)? "Number is greater than 10"
	               :"Number is not greater than 10";
	System.out.println(output);
    }	
 }
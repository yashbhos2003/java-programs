import java.util.Scanner;

class MiniumNumber{
     public static void main(String []args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first num: ");
	 int num1=sc.nextInt();
	System.out.println("Enter second num: ");
	 int num2=sc.nextInt();
	System.out.println("Enter sthird num: ");
	 int num3=sc.nextInt();

	if(num1<num2 && num1<num3 ){
	  System.out.println(num1+" is a minimum number");
	}else if(num2<num1 && num2< num3){
	   System.out.println(num2+" is a minimum number");
	}else {
	   System.out.println(num3+" is a minimum number");
	}
     }		
}
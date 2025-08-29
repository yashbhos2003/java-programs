import java.util.Scanner;
class Triangle {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first angle:");
      int firstAngle =sc.nextInt();
    System.out.println("Enter first angle:");
      int secondAngle =sc.nextInt();
    System.out.println("Enter first angle:");
      int thirdAngle =sc.nextInt();
    if((firstAngle+secondAngle+thirdAngle)==180){
	  System.out.println("the tringle is valid ");
	  	  	
	}else{
	  System.out.println("the tringle is not valid");
	 
	}
    	
    }
}
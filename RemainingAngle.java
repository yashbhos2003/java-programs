import java.util.Scanner;
class RemainingAngle {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first angle:");
      int firstAngle =sc.nextInt();
    System.out.println("Enter first angle:");
      int secondAngle =sc.nextInt();
    int thirdAngle=180-(firstAngle+secondAngle);
    System.out.println("Third angle is: "+thirdAngle);    	
    }
}
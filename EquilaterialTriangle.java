import java.util.Scanner;
class EquilaterialTriangle {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first Side:");
      int firstSide =sc.nextInt();
    System.out.println("Enter first Side:");
      int secondSide =sc.nextInt();
    System.out.println("Enter first Side:");
      int thirdSide =sc.nextInt();
    if(firstSide==secondSide && secondSide==thirdSide){
	  System.out.println("the tringle is Equilaterial");
	  	  	
	}else{
	  System.out.println("the tringle is not Equilaterial");
	 
	}
    	
    }
}
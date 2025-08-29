import java.util.Scanner;

class Bonus{
      public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rating:");
	  int rating=sc.nextInt();
        
	if(rating>8){
	  System.out.println("bonus is 15%");
	}else if(rating<8 && rating >5){
	  System.out.println("bonus is 10%");
	 }else{
	  System.out.println("no bonus");
	}
      }
}
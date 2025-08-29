import java.util.Scanner;
class Cab{
	public static void main(String []args){
	Scanner sc =new Scanner(System.in);
	int input=sc.nextInt();
	
	while(input>0){
	 int firstCabPrice=sc.nextInt();
	 int secondCabPrice=sc.nextInt();
	 	
	if(firstCabPrice==secondCabPrice){
	   System.out.println("Any");
	}else if(secondCabPrice>firstCabPrice){
	    System.out.println("First");
	}else{
	    System.out.println("Second");
	}
	input--;	
	}
	}
}
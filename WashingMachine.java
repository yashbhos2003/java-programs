import java.util.Scanner;
class WashingMachine{

    static String washingMachine(int input){
       if(input<=7000 && input>0){
	if(input<=2000){
	  return "25 minutes";
	}else if(input >=2001 && input <=4000){
	  return "35 minutes";
	}else{
	  return "45 minutes";
	}	
	}
	return "Invalid input";
     }  	
    public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a weight");
	int weight=sc.nextInt();
	String result=washingMachine(weight);
	System.out.println(result);
    }
}
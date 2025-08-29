import java.util.Scanner;

class PerfectSquare{
     public static void main(String []args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number: ");
	 int num=sc.nextInt();
	 Boolean isPerfect=false;
	for(int i=0;i*i<=num;i++){
	    if(i*i==num){
		isPerfect =true;
		break;
            }	
	}

	String result= (isPerfect)? "Perfect Square"
		       : "Not perfect square";	

	System.out.println(result);    
     }		
}
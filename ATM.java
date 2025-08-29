import java.util.Scanner;
class ATM{
	public static void main(String []args){
	Scanner sc =new Scanner(System.in);
		
	 int amountToWithdrow=sc.nextInt();
	 double accountBalance=sc.nextDouble();
		
	if(amountToWithdrow % 5==0 && accountBalance>amountToWithdrow){
	  double result= accountBalance-amountToWithdrow-0.50;
	   System.out.println(result);
	}else{
	    System.out.println(accountBalance);
	}
		
	}
}
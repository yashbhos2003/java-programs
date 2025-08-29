import java.util.Scanner;
class CREDPrograms{
	public static void main(String []args){
	Scanner sc =new Scanner(System.in);
	 
	 int validCreditScore=750;
	 int creditScore=sc.nextInt();
		
	if(creditScore>=validCreditScore){
	   System.out.println("YES");
	}else{
	    System.out.println("NO");
	}	
	}
}
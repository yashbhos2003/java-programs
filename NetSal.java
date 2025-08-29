import java.util.Scanner;

class NetSal{
      public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter basic salary:");
	  int basicSalary=sc.nextInt();
        System.out.println("Enter tax rate:");
	  int taxRate=sc.nextInt();
	
	double netSalary=basicSalary-(basicSalary*0.12);
	System.out.println("NetSalary: "+netSalary);
      }
}
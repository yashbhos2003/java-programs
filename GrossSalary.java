import java.util.Scanner;

class GrossSalary{
     public static void main(String []args){
	
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter basic salary: ");
	 double basicSalary=sc.nextDouble();
	
	if(basicSalary<=1000){
		double HRA= basicSalary*(20.0/100);
		double DA= basicSalary*(80.0/100);
		double grossSalary =basicSalary+HRA+DA;
	  System.out.println("GrossSalary: "+grossSalary);
	}else if(basicSalary<=2000){
		double HRA= basicSalary*(25.0/100);
		double DA= basicSalary*(90.0/100);
		double grossSalary =basicSalary+HRA+DA;
	  System.out.println("GrossSalary: "+grossSalary);
	}else if(basicSalary>2000){
		double HRA= basicSalary*(30.0/100);
		double DA= basicSalary*(95.0/100);
		double grossSalary =basicSalary+HRA+DA;
	  System.out.println("GrossSalary: "+grossSalary);
	}
     }		
}
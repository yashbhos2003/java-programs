import java.util.Scanner;

class Student{
      public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter percentage of student:");
	  int percentage=sc.nextInt();
	System.out.println("Enter income of student:");
	  int income=sc.nextInt();
	if(percentage>=75 && income<200000){
	  System.out.println("Eligible");	
	}else{
	  System.out.println("Not Eligible");	
	}
    }	
 }
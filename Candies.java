import java.util.Scanner;
class Candies{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    
      int n =10; //capacity of jar
      int w =sc.nextInt(); //candies served to customers
      int k=5;  //k is number of minimum candies that must be inside JAR ever.
	  	
    	if(w>0 && w<n && (n-w)>=k ){
	  System.out.println("Number of candies sold "+w);
	  System.out.println("Number of candies left "+(n-w));	  	
	}else{
	  System.out.println("Invalid Input");
	  System.out.println("Number of candies left "+n);
	}
    	
    }
}
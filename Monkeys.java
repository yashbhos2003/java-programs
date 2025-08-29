import java.util.Scanner;
class Monkeys{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter total number of monkeys");
      int n =sc.nextInt(); 
    System.out.println("enter number of eatable bananas");	
      int k =sc.nextInt();
    System.out.println("enter number of eatable peanuts");	
      int j =sc.nextInt();
    System.out.println("enter total number of Bananas");	
      int m =sc.nextInt();
    System.out.println("enter total number of peanuts");	
      int p =sc.nextInt();
      int a=0;//total no of monkey who eat bananas
      int b=0;//total no of monekey who eat peanuts  	  	
    for(int i=0;i<=m;i++){
       if(i*k==m){
          a=i;
          break;
       }
    }
    for(int i=0;i<=m;i++){
       if(i*j==p){
          b=i;
          break;
       }
    }

    System.out.println("Number of Monkeys left on the tree:"+(n-(a+b)));	    	
    }
}
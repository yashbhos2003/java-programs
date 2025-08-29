import java.util.Scanner;
class EvenSum{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=2;
    int sum=0; 
    while(i<=n){
     sum+=i;
      i+=2;
   } 
   System.out.println("sum of Even number "+sum);    
    }
}
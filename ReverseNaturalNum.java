import java.util.Scanner;
class ReverseNaturalNum{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=0; 
    while(n>=i){
      System.out.print(n+" ");
      n--;
   } 
   System.out.println();    
    }
}
import java.util.Scanner;
public class FactorsOfNum{
       public static void main(String []args){
         Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          int i=1;        
         while(i<=num/2){ 
           if(num%i==0){
             System.out.println(i);
           } 
          i++;
        }
         
       }

}
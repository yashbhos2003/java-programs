import java.util.Scanner;
public class PowerOfNum{
       public static void main(String []args){
         Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          int power=sc.nextInt();
          int result=1;        
         while(power>0){ 
             result=result*num;   
             power--;
        }
         System.out.println(result);
       }

}
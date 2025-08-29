import java.util.Scanner;
public class FirstAndLastDigit{
       public static void main(String []args){
         Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
           int last=0,first=0,count=0,val=0;
           int x=num;
  
         while(x>0){
          count++; 
           x/=10;       
         }

          while(num>0){
          int rem=num%10;
          val++; 
          if(val==1){
             last=rem;
          }
          if(val==count){
              first=rem;
          }

           num/=10;       
         }
        System.out.println(first);
        System.out.println(last);
       }

}
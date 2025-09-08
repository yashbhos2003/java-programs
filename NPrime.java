import java.util.Scanner;
public class NPrime{
     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int count=1;
       int num=2;
         while(count<=n){
           boolean flag=false; 
          for(int j=2;j<=num/2;j++){
             if(num%j==0){
              flag=true;
             }
          }
           
          if(flag==false){
          count++;
          System.out.println(num);

          } 
         num++;
       }
     }
}
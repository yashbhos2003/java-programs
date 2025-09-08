import java.util.Scanner;
public class NDuck{
    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      for(int i=1;i<=n;i++){
           int val=i;
         while(val>0){
          int rem=val%10;
          if(rem==0){
            System.out.print(i+" " );
            break;
          } 
           val=val/10;
         }
      }         
    }

}
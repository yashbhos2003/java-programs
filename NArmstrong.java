import java.util.Scanner;
public class NArmstrong{
          static int count(int x){
              int p=0;
              while(x>0){
               p++;
               x/=10;
              }
            return p;
          }
     
          static int mult(int rem,int power){
              int mul=1;  
               while(power>0){
                 mul*=rem;  
                 power--;  
               }
            return mul;
          }
  
    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      for(int i=1;i<=n;i++){
           int val=i;
           int z=i;
           int power=count(val);
           int sum=0; 
            while(val>0){
               int rem=val%10;
               int mul=mult(rem,power);
               
              sum+=mul;
              val/=10;
            }
          
          if(z==sum){
            System.out.println(z);
          }
       }         
    }

}
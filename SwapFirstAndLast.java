import java.util.Scanner;
 class SwapFirstAndLast{
       public static void main(String []args){
         Scanner sc=new Scanner(System.in);
           System.out.println("Enter a number");
             int num=sc.nextInt();
             int first=0;int mid=0;int count=0; 
             int last=num%10;
             num=num/10; 
             
             int x=num;
             while(x>0){
              x=x/10;
             count++;
             }
            int p=1;
            while(count>1){
             p=p*10;
             count--;
            }
             mid=num%p;
             num=num/p; 
            first=num;
            //System.out.println(p);
           int result=(last*10*p)+(mid*10)+first;
           System.out.println(result);                       
       }

}
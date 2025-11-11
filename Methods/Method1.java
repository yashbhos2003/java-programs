/*Q20. Write a java program to swap first and last digits of a number.*/

 class Method1{

         int swap(int num){
            int a=num,count=0,b=num,div=1;
            while(a>0){
              count++;
              a/=10;
            }
            int rem1=b%10;
            b/=10;
          
            while(count>2){
               div*=10;
              count--;
            }

            int rem2=b%div;
             b/=div;
            //System.out.println(rem1);
            //System.out.println(rem2);
            //System.out.println(b);
            int ans= rem1*10*div+rem2*10+b;
            return ans;
            
         }
      public static void main(String args[]){
           Method1 m=new Method1();
           int result=m.swap(1234);
           System.out.println(result);
      }
 }

import java.util.Scanner;
class NeonNum{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt(); 

    int square=num*num;
    int sq=square; 
    int sum=0;
    while(sq>0){
      int rem=sq%10;
          sum+=rem;
          sq/=10;
    }

    String result=(sum==num)? "number is neon"
                  :"number is not neon";

    System.out.println(result);
    }
}
import java.util.Scanner;
class Celcius{
      public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter choice [celcius,fahrenheit]");
       String choice=sc.nextLine();
       switch(choice){
       case "celcius":
       System.out.println("Eneter value as celcius to convert int fahrenheit");
       int val=sc.nextInt();
       int fahrenheit=(val*9/5)+32;
       System.out.println(fahrenheit+" fahrenheit");
       break;

       case "fahrenheit":
       System.out.println("Eneter value of fahrenheit to convert int celcius");
       int val2=sc.nextInt();
       int celcius=(val2-32)*5/9;
       System.out.println(celcius+" celcius");
       break;
 
       default:
         System.out.println("Choose correct input please"); 
        } 
      } 
}
import java.util.Scanner;
class Bank{
    public static void  main(String[]args){
     Scanner sc=new Scanner(System.in);
     int balance;
     System.out.println("Enter a balance");
      balance =sc.nextInt();
     
     char ch='y';
     while(ch=='y'){
        System.out.println("enter a choice from /n 1.deposite /n 2.withdraw /n 3.check balance /n exist");
         int choice=sc.nextInt();

     switch(choice){
       case 1:
         System.out.println("Enter a amount to deposite");
         int deposite=sc.nextInt();
         balance=balance+deposite;  
         System.out.println("Your amount can deposited succesfully"); 
          break;
       case 2:
         System.out.println("Enter a amount to withdraw");
         int withdraw=sc.nextInt();
         if(balance>(balance-withdraw)){ 
         balance=balance-withdraw;
         System.out.println("your amount rs."+withdraw+"withdraw succesfully"); 
          break;
         }
       case 3:
         System.out.println("Enter a pin");
         int pin=sc.nextInt();
         if(pin==1234){
         System.out.println("Your account balance is: "+balance);
          break;
         } 
      case 4:
         System.out.println("do you want to exit enter [yes-y,No-n]");
         ch=sc.next().charAt(0);
         break;

      default:
          System.out.println("wrong choice"); 
     }
     ch='n';
    }  
    }
}
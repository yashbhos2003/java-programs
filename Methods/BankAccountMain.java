/*Q2. Bank Account System
Concepts Used: Abstract class, runtime polymorphism
 Operations:
Abstract class BankAccount
Fields: accountNo, balance
Abstract methods:
calculateInterest()
Child classes:
SavingsAccount → 4% interest
CurrentAccount → 2% interest
Add interest to balance
Display updated balance
📌 Explanation:
 Abstract method ensures every account type defines its own interest rule.*/


abstract class BankAccount{
     int accountNumber;
     int balance;

     BankAccount(int accountNumber,int balance){
         this.accountNumber=accountNumber;
         this.balance=balance;
     }

     abstract double calculateInterest();
          
     void display(){
         System.out.println(accountNumber+" "+balance);
     }
}

class SavingsAccount extends BankAccount{
      public static final double interest1=0.04;
      
      SavingsAccount(int accountNumber,int balance){
          super(accountNumber,balance);
      }

      double calculateInterest(){
           double updatedBal=balance+(balance*interest1);
           return updatedBal; 
      }

      void display(){
         System.out.println(accountNumber+" "+balance+" "+calculateInterest());
      }
} 
class CurrentAccount extends BankAccount{
     
     public static final double interest2=0.02;
      
      CurrentAccount(int accountNumber,int balance){
          super(accountNumber,balance);
      }

      double calculateInterest(){
           double updatedBal=balance+(balance*interest2);
           return updatedBal; 
      } 
     
      void display(){
         System.out.println(accountNumber+" "+balance+" "+calculateInterest());
      }    
}

class BankAccountMain{
      public static void main(String[]args){
          BankAccount b1=new SavingsAccount(1,200);
          BankAccount b2=new CurrentAccount(2,200);
          b1.display(); 
          b2.display();
      }
}
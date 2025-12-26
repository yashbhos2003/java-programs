/*accountNumber
name
balance
Initialize these using a parameterized constructor.
Create a method withdraw(int amount) that checks:
Amount must be greater than 0
Amount must be <= balance
After withdrawal, update balance
If invalid → print message accordingly
Explanation:
You must apply multiple logical checks together:*/

class Bank{
     private int accountNumber;
     private String name;
     private int balance;

     Bank(int accountNumber,String name,int balance){
         this.accountNumber=accountNumber;
         this.name=name;
         this.balance=balance;
     }

      String withdraw(int amount){
        if(balance>0 && amount<=balance){
           balance=balance-amount;
           return amount+" withdraw succesfully";
        }else{
           return balance+" insufficient amount";
        }
     }
}

public class BankApp{
     public static void main(String []args){
         Bank b=new Bank(123,"yash",5000);
         System.out.println(b.withdraw(6000));
         
     }
}


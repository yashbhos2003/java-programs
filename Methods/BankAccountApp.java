/*2. Question:
 Create a class BankAccount with a method calculateInterest(). Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes.*/


class BankAccount{
      int amt;
      BankAccount(int amt){
         this.amt=amt;
      }
    
     void calculateInterest(){
         int interest=amt%0;
         System.out.println(interest);
     }
}

class SavingsAccount extends BankAccount{

         SavingsAccount(int amt){
             super(amt);
         }

         void calculateInterest(){
            double interest=amt*0.05;
            System.out.println((amt+interest));
         }      
}

class CurrentAccount extends BankAccount{

         CurrentAccount(int amt){
             super(amt);
         }

         void calculateInterest(){
            double interest=amt*0.03;
            System.out.println((amt+interest));
         }      
}

class BankAccountApp{
     public static void main(String [] args){
        SavingsAccount sa=new SavingsAccount(20000);
        CurrentAccount ca=new CurrentAccount(10000);
       
          sa.calculateInterest();
          ca.calculateInterest(); 
     }
}
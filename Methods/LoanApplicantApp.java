/*Q14. Create a class LoanApplicant with:
Fields: name, age, annualIncome, creditScore, existingLoans
Constructor: Initialize all fields.
Logic Method: isEligible()
 Return true only if all the following conditions match:
age between 21 and 55
annualIncome ≥ 3,50,000
creditScore ≥ 700
existingLoans < 3
If creditScore is between 650–699 → income must be ≥ 5,00,000
If existingLoans = 2 → creditScore must be ≥ 750
Task:
 Create 3 applicants and check eligibility for each.
Focus: Compound conditions + nested logic + constructor handling.*/

class LoanApplicant{

      private String name;
      private int age;
      private int annualIncome;
      private int creditScore;
      private int existingLoans;

      LoanApplicant(String name,int age,int annualIncome,int creditScore,int existingLoans){
         this.name=name;
         this.age=age;
         this.annualIncome=annualIncome;
         this.creditScore=creditScore;
         this.existingLoans=existingLoans;
      }

      boolean existingLoans(){
         
         if(existingLoans==2 && creditScore>=750){
            return true;
         }
            return false;   
      }
      
      boolean creaditScore(){
           
            if((creditScore>=650 && creditScore<=699) && annualIncome>=500000){
               return true;
            }
            return false;
      }
      boolean isEligible(){
            boolean flag=false;
            if(age>=21 && age<=55){
               if(annualIncome>=350000 && (creditScore>=700  || creaditScore())){
                  if(existingLoans<3){
                    if(existingLoans==2){
                      flag=existingLoans();
                    }else{
                      flag=true;
                    }
                  } 
               }
            } 
            return flag;           
      }
}

public class LoanApplicantApp{
      public static void main(String [] args){
         LoanApplicant a1 = new LoanApplicant("Ravi", 30, 400000, 720, 1);
                     LoanApplicant a2 = new LoanApplicant("Neha", 45, 600000, 680, 0);
                     LoanApplicant a3 = new LoanApplicant("Amit", 40, 800000, 740, 2);
        
         System.out.println("Ravi Eligible: " + a1.isEligible());
                    System.out.println("Neha Eligible: " + a2.isEligible());
                     System.out.println("Amit Eligible: " + a3.isEligible());
      }
}
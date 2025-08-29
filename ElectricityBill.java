import java.util.Scanner;
class ElectricityBill {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter units:");
      int unit =sc.nextInt();
      double bill;
    if(unit<=50 && unit>0){
      bill=unit*0.50; 
      bill=bill+0.20;    
    }else if(unit<=150){
      bill=unit*0.75; 
      bill=bill+0.20;   
    }else if(unit<=250){
      bill=unit*1.20; 
      bill=bill+0.20;   
    }else{
      bill=unit*1.50; 
      bill=bill+0.20;  
    }
     System.out.println(bill);         	
    }
}
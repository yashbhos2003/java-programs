/*Q1. Scenario:
A shopping application has two discount types: Festival Discount and Regular Discount.
You have to design a system where the main class depends only on parent class reference and objects can be swapped easily → Loose Coupling.
Requirement:
Create a parent class Discount.
Create child classes FestivalDiscount and RegularDiscount.
Using parent reference, assign child objects and calculate discount.
Input : Original Price: 1000
Choose Discount Type: Festival
Output : Final Price after Festival Discount: 800

Explanation:
You should write code where the main method refers to Discount d = new FestivalDiscount();
Later you can switch to new RegularDiscount() without changing any other code.
This demonstrates loose coupling.*/


class Discount{
     double getFinalPrice(double originalPrice) {
        return originalPrice;  
    }     
}

class FestivalDiscount extends Discount{
     double getFinalPrice(double originalPrice) {
        return (originalPrice- (originalPrice*0.20));  
    }
}

class RegularDiscount extends Discount{
     double getFinalPrice(double originalPrice) {
        return (originalPrice- (originalPrice*0.10));  
    }
}

class DiscountApp{
     public static void main(String [] args){
        Discount d=new  RegularDiscount();
        System.out.println(d.getFinalPrice(1000)); 
     }
}
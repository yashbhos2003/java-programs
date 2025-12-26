/*Q5. Problem  
Write a java to Create class name as Food with using data memberfid,fname,fprice, fcategory using do while and switch case.
create array of object of size 5 ,store the food details in it and perform following operations.
	
	1 : Add All Food details.
	2 : Display All Food details.
	3 : Display Bill Details :
		1 :  Bill Without Gst.
		2 : Bill With 18% Gst.*/
import java.util.*;
class Food{
   private int memberId;
   String name;
   int price;
   String category;

   void setMemberId(int memberId){
      this.memberId=memberId;
   } 
   int getMemberId(){
      return memberId;
   }

   void setName(String name){
      this.name=name;
   } 
   String getName(){
      return name;
   }

   void setPrice(int price){
      this.price=price;
   }
   int getPrice(){
     return price;
   }

   void setCategory(String category){
       this.category=category;
   }
   String getCategory(){
       return category;
   }
}

class FoodApp{
     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       Food f[]=new Food[3];
       int ch;
       do{
            System.out.println("\n=========== MENU ===========");
            System.out.println("1 : Add All Food Details");
            System.out.println("2 : Display All Food Details");
            System.out.println("3 : Display Bill Details");
            System.out.println("4 : Exit");
            System.out.println("============================");
            System.out.print("Enter choice: ");
            ch = sc.nextInt(); 

           switch(ch){

             case 1:
                   for(int i=0;i<f.length;i++){
                      f[i]=new Food();
                      System.out.println("enter  memberid,name,price, category");
                      int memberId=sc.nextInt();
                      String name=sc.next();
                      int price=sc.nextInt();
                      String category=sc.next();
                      f[i].setMemberId(memberId);
                      f[i].setName(name);
                      f[i].setPrice(price);
                      f[i].setCategory(category);
                   }
                   break;

            case 2:
                  System.out.println("2 : Display All Food Details");
                  for(int i=0;i<f.length;i++){
                     System.out.println(f[i].getMemberId()+" "+f[i].getName()+" "+f[i].getPrice()+" "+f[i].getCategory());
                  }
                  break;

            case 3:
                  int ch2;
                  do{
                    System.out.println("1 : bill without gst");
                    System.out.println("2 : bill with 18% gst");
                    System.out.println("enter choice:");
                    ch2=sc.nextInt();
                    switch(ch2){
                               
                         case 1:
                                int total=0;
                                for(Food x:f){
                                   total+=x.getPrice();
                                }
                                System.out.println("bill without gst is:"+total);
                                break;
                        
                        case 2:
                              int total1=0;
                               for(Food x:f){
                                  total1+=x.getPrice();
                               }
                              double gst=(double)total1*0.18;
                              System.out.println("2 : bill with 18% gst is"+gst); 
                              break;

                    }

                  }while(ch2!=2);

              case 4:
                    System.out.println("exit...");
                    break;

             default:
                  System.out.println("enter valid input ");  
                  
           }
        
       }while(ch!=4);
        
     }
}
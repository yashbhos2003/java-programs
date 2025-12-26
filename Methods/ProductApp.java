/*Q28. WAP to create POJO class name as Product with field id, name and price and create 5
product objects using array of objects and search product using its id 
Means you have to input id from keyboard and search product present in array of object or not
using its id.*/

import java.util.Scanner;
class Product
{
    private int id;
    private String name;
    private int price;

    void setId(int id)
     {
       this.id=id; 
    }
    int getId(){
       return id;
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
   
}

class AllProducts{
     private Product p[];
     
       AllProducts(Product ...p)// single obj, multiple obj, arrray of obj
          {
            this.p=p;
          }
    /*
       AllProducts(Product []p)//  arrray of obj
          {
            this.p=p;
          }
   */
     void print(){
         for(int i=0;i<p.length;i++){
            System.out.println(p[i].getId()+" "+p[i].getName()+" "+p[i].getPrice());
         }
     }

     Boolean search(int searchId){
       for(int i=0;i<p.length;i++){
          if(p[i].getId()==searchId){
            return true;
          }
       }
       return false;
     }
}

class ProductApp{
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);     
 
        
        Product p[]=new Product[3];  //array of object // array of reference variable
        
        for(int i=0;i<p.length;i++){
           p[i]=new Product();
            System.out.println("Enter id, name and price of product");
                int id=sc.nextInt();
                String nm=sc.next();
                int price=sc.nextInt();
                       p[i].setId(id);
                       p[i].setName(nm);
                       p[i].setPrice(price);
        }
        AllProducts ap=new AllProducts(p);
               ap.print();
        System.out.println("Enter id to search product details");
              int key=sc.nextInt();
              String result=ap.search(key)? "product found":"Product not found";
        System.out.println(result);                 
    }
}


/*Q25. Suppose consider we are working on billing Application and we have following types of classes 
1. Product with field id,name and price and it is POJO class 
2. Customer with field id, name address,email , contact and it is POJO class
3. Shop with following methods 
void storeProducts(Customer c,Product …p): this method can accept infinite product list
void calBill(): this method can calculate bill with grand total and your output should be
*/

class Product{
     int id;
     String name;
     int price;
     
     void setName(String name){
          this.name=name;
      }
      String getName(){
          return name;
      }
      void setId(int id){
          this.id=id;
      }
      int getId(){
          return id;
      }
      void setPrice(int price){
          this.price=price;
      }
      int getPrice(){
          return price; 
      }
}

class Customer{
     int id;
     String name;
     String email;
     String contact;
     
     void setName(String name){
          this.name=name;
      }
      String getName(){
          return name;
      }
      void setId(int id){
          this.id=id;
      }
      int getId(){
          return id;
      }
      void setEmail(String email){
          this.email=email;
      }
      String getEmail(){
          return email; 
      }
      void setContact(String contact){
          this.contact=contact;
      }
      String getContact(){
          return contact; 
      }
}

class CustomerProduct{
       Customer c;
       Product []p;
     void storeProducts(Customer c,Product ...p){
         this.c=c;
         this.p=p;   
     }

     void calBill(){
         System.out.println(c.getId()+" "+c.getName()+" "+c.getEmail()+" "+c.getContact());
         int total=0;
         for(int i=0;i<p.length;i++){
            System.out.println(p[i].getId()+" "+p[i].getName()+" "+p[i].getPrice());
            total=total+p[i].getPrice();
         }
         System.out.println("total bill: "+total);
     }
}

class CustomerProductApp{      
      public static void main(String []args){

        Customer c=new Customer();
        c.setId(1);
        c.setName("Yash");
        c.setEmail("yashbhos2003@gmail.com");
        c.setContact("3757829039");

        Product p=new Product();
        p.setId(1);
        p.setName("sugar");
        p.setPrice(100);

        Product p1=new Product();
        p1.setId(2);
        p1.setName("milk");
        p1.setPrice(200);

        CustomerProduct cp=new CustomerProduct();
        cp.storeProducts(c,p,p1);
        cp.calBill();
        
      }
}
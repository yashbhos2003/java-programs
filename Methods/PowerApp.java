/*Q2. WAP to create class name as Power with function 
  void setNum(): this function accept two values first is base and second is index 
  void showPower(): this function can calculate the power of two numbers and display it.
=====================================================================*/

class Power{
    int base;
    int index;
    void setNum(int base,int index ){
     this.base=base;
     this.index=index;
    }
     
    void showPower(){
      int pow=1;
      while(index>0){
        pow=pow*base;
        index--;
      }
     System.out.println(pow);
    }
}

class PowerApp{
     public static void main(String [] args){
     Power p=new Power();
     p.setNum(3,2);
     p.showPower();
     Power p1=new Power();
     p1.setNum(4,2);
     p1.showPower();
     }
} 
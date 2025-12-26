/*Q10. WAP to create class name as FindMax with two functions 
void setValue(int …x): this function accept infinite parameter from calling
int  getMax(): this function can find the value from the function and return it*/


class FindMax{
     int x[];
     void setValue(int ...x){
         this.x=x;
     }

     int findMax(){
        int max=x[0];
        for(int i=0;i<x.length;i++){
           if(x[i]>max){
             max=x[i];
           }
        } 
      return max;
     }
}

class FindMaxApp{
     public static void main(String [] args){
     FindMax f= new FindMax();
     f.setValue(1,2,3,4,5);
     f.findMax();
     }
}

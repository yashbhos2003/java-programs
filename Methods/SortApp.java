/*Q11. WAP to create class name as Sort with two functions 
void setValue(int …x): this function can accept infinite value 
void sort(): this function can perform sorting on variable argument array
void display(): this function can display the data of array before sorting and after
sorting.
*/

class Sort{
     int x[];
     void setValue(int ...x){
        this.x=x; 
     }

     void display(){
        System.out.println("before sorting");
        for(int i=0;i<x.length;i++){
           System.out.print(x[i]+" ");
        }
        
        for(int i=0;i<x.length;i++){               //insertion sort
            for(int j=i+1;j<x.length;j++){
                if(x[i]>x[j]){
                  int temp=x[i];
                  x[i]=x[j];
                  x[j]=temp;
                }
            }
        } 
        System.out.println();
        System.out.println("After sorting");
        for(int i=0;i<x.length;i++){
           System.out.print(x[i]+" ");
        } 
     }
}

class SortApp{
      public static void main(String [] args){
      Sort s=new Sort();
      s.setValue(2,5,7,3,9,4); 
      s.display(); 
      }
}
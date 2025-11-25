/*8.    Shift Array Elements to the Left
o   Write a class to create a method to shift all elements in an array one position to the left.
 Explanation: Work with array indexes and element reassignment.*/

class ShiftLeft{
     void shift(int arr[]){
          int first=arr[0];
          for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];  
          } 
          arr[arr.length-1]=first;

          for(int x:arr){
             System.out.println(x);
          } 
     }
}

class ShiftLeftApp{
    public static void main(String []args){
    int arr[]={1,2,3,4,5};
    ShiftLeft s=new ShiftLeft();
    s.shift(arr);
    }
}
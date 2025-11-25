/*6.    Sort an Array (Bubble Sort)
o   Write a class to implement a method to sort an integer array using bubble sort.
 Explanation: Learn basic sorting algorithms and their implementation.*/

class BubbleSort{

     int []sort(int arr[]){
     for(int j=0;j<arr.length-1;j++){
       for(int i=0;i<arr.length-1-i;i++){
          if(arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
          }
       } 
        
     }
     return arr;
    }
     void print(int []x){
         for(int i=0;i<x.length;i++){
           System.out.println(x[i]);
         }
     }
     
}

class BubbleSortApp{
      public static void main(String []args){
      int arr[]={1,2,3,4,5,6,2,4,3,9};
      BubbleSort b=new BubbleSort();
      
      int y[]=b.sort(arr);
      b.print(y);
      }
}
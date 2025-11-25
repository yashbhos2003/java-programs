/*5.    Find Duplicates in an Array
o   Write a class to create a method to identify and display duplicate elements in an integer array.
 Explanation: Practice nested loops to compare elements.*/

class Duplicate{
     void duplicate(int arr[]){
      for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
             if(arr[i]==arr[j]){
               System.out.println(arr[i]+" ");
             }
         }
      }
     }
}

class ArrayDuplicate{
      public static void main(String []args){
      int arr[]={1,2,3,4,5,6,2,4,3,9};
      Duplicate d=new Duplicate();
      d.duplicate(arr);
      }
}
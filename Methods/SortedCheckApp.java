/*9.    Check if an Array is Sorted
o   Write a class to implement a method to check whether an integer array is sorted in ascending order.
 Explanation: Understand conditions and comparisons in loops.*/

class SortedCheck{
     boolean check(int arr[]){
          boolean flag=true;
          for(int i=0;i<arr.length-1;i++){
              if(arr[i]>arr[i+1]){
                 flag=false;               
              }
          }
          return flag; 
     }
}

class SortedCheckApp{
    public static void main(String []args){
    int arr[]={1,2,3,4,5,6};
    SortedCheck s=new SortedCheck();
    System.out.println(s.check(arr));
    }
}
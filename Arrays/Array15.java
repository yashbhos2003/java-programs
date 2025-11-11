/* Date :- 24-09-2025

Q2. Write a program in java to find the majority element of an array ?

	A majority element in an array of size n is an element that appears more than n/2 times (and

	hence there is at most one such element).

	Expected Output:

	The given array is: 4  8  4  6  7  4  4  8

	There are no Majority Elements in the given array
  */


class Array15{
     public static void main(String []args){
        
           int arr[]={4,8,4,6,7,4,4,8,4,4};                    
           boolean flag=false;
           int ele=0;
          for(int i=0;i<arr.length;i++){
               int count=1;
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                 count++;
                 
               }
            }
            if(count>arr.length/2){
               flag=true;
               ele=arr[i];
            }
          }
         if(flag){
           System.out.println(ele+" is the majority element");
               
         } else{
           System.out.println("There are no Majority Elements in the given array");

         }  
      }
}
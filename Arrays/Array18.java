/*Date :- 29-09-2025

Q1. Write a program in java to print next greater elements in a given unsorted array. Elements for which no greater element exists, consider the next greater element as -1.
		Expected Output :
		The given array is : 5 3 10 9 6 13
		Next Bigger Elements are:
		Next bigger element of 5 in the array is: 10
		Next bigger element of 3 in the array is: 10
		Next bigger element of 10 in the array is: 13
		Next bigger element of 9 in the array is: 13
		Next bigger element of 6 in the array is: 13
		Next bigger element of 13 in the array is: -1
		Next Bigger Elements Array:
		10 10 13 13 13 -1*/

class Array18{
     public static void main(String[]args){
         int arr[]={5,3,10,9,6,13};
         int arr2[]=new int[arr.length];
         int val=-1,ind=0;
         for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]<arr[j]){
                  arr2[ind++]=arr[j];
                  System.out.println("Next bigger element of "+arr[i]+" in the arrays:"+arr[j]);                                                                  
                   break;
               }
              
            }
              if(arr[i]==arr[arr.length-1]){
                   arr2[ind++]=val;
                  System.out.println("Next bigger element of "+arr[i]+" in the arrays:"+val);
               }
         }

           for(int i=0;i<arr2.length;i++){
              System.out.println(arr2[i]);
           }                   
     }
}
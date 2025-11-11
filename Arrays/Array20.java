/*Q3. Write a program in java to move all zeroes to the end of a given array.
		Expected Output :
		The given array is : 2 5 7 0 4 0 7 -5 8 0
		The new array is:
		2 5 7 8 4 -5 7 0 0 0*/

class Array20{
     public static void main(String[]args){
         int arr[]={2,5,7,0,4,0,7,-5,8,0};
          int count=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i]==0){
               count++;
             }
          }
         for(int i=0,j=arr.length-1;i<arr.length;i++){
             if(arr[j]==0){ 
                j--;
                count--;
             }
            if(arr[i]==0 && arr[j]!=0){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             j--;
             count--;
             if(count==0){
               break;
             }
            }
         }

          for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
          }                              
     }
}
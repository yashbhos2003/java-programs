/*Q3. Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.*/

class Array17{
     public static void main(String[]args){
         int arr[]={1,2,4,5,7,10};
         
        
         for(int i=arr[0];i<=arr[arr.length-1];i++){
               boolean flag=false;
             for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                  flag=true;
                }  
             }
             if(!flag){
               System.out.print(i+" ");
             }else{
              // System.out.print(i+" ");
             }
          }
                   
     }
}
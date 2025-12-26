/*Q19. Rearrange an array such that arr[i] = i
Given an array of elements of length n, ranging from 0 to n – 1. 
All elements may not be present in the array.
 If the element is not present then there will be -1 present in the array. 
 Rearrange the array such that arr[i] = i and if i is not present, display -1 at that place.
Examples: 
Input: arr[] = [-1, -1, 6, 1, 9, 3, 2, -1, 4, -1]
Output: [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
Explanation: In range 0 to 9, all except 0, 5, 7 and 8 are present. Hence, we print -1 instead of
them.
Input: arr[] = [0, 1, 2, 3, 4, 5] 
Output: [0, 1, 2, 3, 4, 5]
Explanation: In range 0 to 5, all numbers are present.
Your Task: You have to create class name as ReArrange with constructor and methods 
ReArrange(int a[]): this function is used for accept array as parameter
int [] getReArrange(): this function can rearrange all arrays and return it.*/


class ReArrange{
      int a[];
     
      ReArrange(int a[]){
       this.a=a;       
      }

      int [] getReArrange(){
         int res[]=new int[a.length];
         for(int i=0;i<a.length;i++){
           // System.out.println(isPresent(a,i));
               if(isPresent(a,i)){
                 res[i]=i;
               } else{
                  res[i]=-1;
               }  
         }
         return res;  
      }

      Boolean isPresent(int arr[],int key){
           for(int i=0;i<arr.length;i++){
              if(key==arr[i]){
                return true;
              }
           }
           return false;
      }
}
public class ReArrangeApp{
      public static void main(String [] args){
            int arr1[]={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
            
            ReArrange m =new ReArrange(arr1);
            int arr[]=m.getReArrange();
            for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            }
      }
}

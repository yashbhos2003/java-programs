/*Given two arrays a[] and b[], the task is find intersection of the two arrays. Intersection of two arrays is
said to be elements that are common in both arrays. The intersection should not count duplicate
elements and the result should contain items in any order.
Input: a[] = {1, 2, 1, 3, 1},  b[] = {3, 1, 3, 4, 1}
Output: {1,  3}
Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of
common elements
Input: a[] = {1, 1, 1},  b[] = {1, 1, 1, 1, 1}
Output: {1}
Explanation: 1 is the only common element present in both the arrays.
Input: a[] = {1, 2, 3},  b[] = {4, 5, 6}
Output: {}
Explanation: No common element in both the arrays.
Your Task is : Note you have to create class name as Intersection with two methods 
void setArray(int a[],int b[]): this function is used for accept two array as parameter 
Int [] getIntersection(): this function can find the intersection of array and return it.

*/

class Intersection{
       int []a,b;
      void setArray(int a[],int b[]){
          this.a=a;
          this.b=b;
      }

      int []getIntersection(){
         int aLen=a.length;
         int bLen=b.length;
         int cLen=(aLen>bLen)? bLen:aLen;

         int c[]=new int[cLen];
         int k=0;
         for(int i=0;i<aLen;i++){
            if(isPresent(b,a[i])  && !isPresent(c,a[i])){
              c[k++]=a[i];
            }
         } 

         int res[]=new int[k];
         for(int i=0;i<res.length;i++){
            res[i]=c[i];
         } 
         return res;        
      }
      //for checking the element is present 
      boolean isPresent(int a[],int num){
          for(int i=0;i<a.length;i++){
             if(a[i]==num){
               return true;
             }
          }
          return false;
      }      
}

class IntersectionApp{
      public static void main(String [] args){
      Intersection i=new Intersection();
      int arr1[]={1,1,2,3,4};
      int arr2[]={1,2,9,1,5};
      i.setArray(arr1,arr2);
      int c[]=i.getIntersection();
      for(int j=0;j<c.length;j++){
          System.out.print(c[j]+" ");
      }
      
      }
}
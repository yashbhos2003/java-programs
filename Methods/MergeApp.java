/*10.Merge Two Integer Arrays
Write a class to write a method to merge two integer arrays into a single array.
 Explanation: Practice combining arrays and managing their sizes.*/

class Merge{
     void merge(int x[],int y[]){
         int arr[]=new int[x.length+y.length];
         int p=0;
         for(int i=0;i<x.length;i++){
            arr[p]=x[i];
            p++;
         }
         for(int i=0;i<y.length;i++){
            arr[p]=y[i];
            p++;
         }
          

         for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         } 
     }
}

class MergeApp{
    public static void main(String []args){
    int a[]={1,2,3,4,5,6};
    int b[]={7,8,9,10};
    Merge m=new Merge();
    m.merge(a,b);
    }
}
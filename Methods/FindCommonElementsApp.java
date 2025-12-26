/*Q14. Given two arrays, our task is to find their common elements. 
 Input:  Array1 = [“a”, “b”, “c”, “d”, “e”, “f”],
            Array2 = [“b”, “d”, “e”, “h”, “g”, “c”]
Output: [b, c, d, e]
Your Task 
________________________________________________________
You have to create class names s FindCommonElements with following methods 
void setArray(int a[],int b[]); this function can accept two array as parameter 
Int [] getCommonElements(): you have to create a new third array and find the common element and
return it.

*/

class FindCommonElements{
     char a[];
     char b[]; 
     void setArray(char a[],char b[]){
       this.a=a;
       this.b=b;
     }

     char []getCommonElements(){
         int count=0;
         for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                  count++;
                }
            }
         }

         char x[]=new char[count];
         int k=0;
         for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                  x[k++]=a[i];
                }
            }
         }
         return x;
     }
       
}

class FindCommonElementsApp{
      public static void main(String [] args){
      char arr1[]={'a','b','c','d','e','f'};
      char arr2[]={'b','d','e','h','g','c'};
      FindCommonElements f=new FindCommonElements(); 
      f.setArray(arr1,arr2);
      char result[]=f.getCommonElements();
      for(int i=0;i<result.length;i++){
      System.out.println(result[i]);
      }
      }
}
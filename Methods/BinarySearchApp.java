/* Q16. Binary search in a sorted array
Your Task
 _________________________________________________________
You have to create class name as BinarySearch with two methods 
void setArray(int a[]): this function is used for accept array as parameter 
int getIndex(int key): this function accepts a key for search and return index of search element and
returns -1 when the element is not found and show the element at function calling point using index if
index is not -1
*/

class BinarySearch{
     int a[];
     
     void setArray(int []a){
         this.a=a;
     }
     
     int getIndex(int key){
        int start=0;
        int end=a.length-1;

        while(start<=end){
          int mid=(start+end)/2;
          if(a[mid]==key){
            return mid; 
          }
          if(a[mid]<key){
            start=mid+1;
          }else{
            end=mid-1;
          }

        }
       return -1;
     }
}

class BinarySearchApp{
     public static void main(String[]args){
     BinarySearch b=new BinarySearch();
     int arr[]={1,2,3,4,5};
     b.setArray(arr);
     int ind=b.getIndex(5);
     System.out.println(ind);
     }
}
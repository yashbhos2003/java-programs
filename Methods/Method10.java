/*Q5.Write a Java program that finds the sum of even and odd elements in an array using functions.
Example Input:
arr = {10, 15, 8, 7, 9, 12}
Output:
Sum of Even: 30  
Sum of Odd: 31
*/

class Method10{
          int evenSum(int a[]){
                int sum=0;
             for(int i=0;i<a.length;i++){
                 if(a[i]%2==0){
                    sum+=a[i];
                 }
             }
             return sum;
          }
           
          int oddSum(int a[]){
                int sum=0;
             for(int i=0;i<a.length;i++){
                 if(a[i]%2!=0){
                    sum+=a[i];
                 }
             }
             return sum;
          }
     public static void main(String []args){
      int arr[]={10, 15, 8, 7, 9, 12};
      Method10 m=new Method10();
      int evensum= m.evenSum(arr);
      int oddsum= m.oddSum(arr);
      System.out.println(evensum);
      System.out.println(oddsum);

     }
}
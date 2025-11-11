/*Q15. Write a Java program to return the count of duck elements present in an integer array.*/

class Methos10{
           int duckElement(int a[]){
               int count=0; 
               for(int i=0;i<a.length;i++){
                  int num=a[i];
                   boolean flag1=false;
                   boolean flag2=false;
                  while(num>0){
                    
                     int rem=num%10;
                     if(rem==0){
                       flag1=true;
                     }
                      if(flag1 && rem!=0){
                        flag2=true;
                      }
                     num/=10;
                  } 
                  if(flag1 && flag2){
                    count++;
                    System.out.println(a[i]);
                  }           
               }
              return count;
           }
     public static void main(String []args){
           int arr[]={10,200,0022,45,201,57,88,2000,000440 ,102}; 
           Methos10 m=new Methos10();
           int x=m.duckElement(arr);
           System.out.println(x);
     }
}
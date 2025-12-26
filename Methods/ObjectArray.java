class ObjectArray{
         static int i=0;
        static int setNum(int num){
             int i=0;
           System.out.println(i);
           return num;
           
        }

      void print(){
         System.out.println(setNum(15)); 
          //System.out.println(i);
      }
     public static void main(String []args){
    
     Object arr[]=new Object[5];
     
     arr[0]=1;
     arr[1]='c';
     arr[2]="string";
     arr[3]=6.7;
     arr[4]=30;

     for(Object x:arr){
        System.out.println(x);
     }

     ObjectArray obj= new ObjectArray();
    
     obj.print();
     System.out.println(i);
     }
}
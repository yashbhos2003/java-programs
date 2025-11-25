class ObjectArray{
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
     }
}
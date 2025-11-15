import java.util.Scanner;
class input{
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String str=sc.next();
        System.out.println(x); 
        System.out.println(str); 
        int y=input.x(); 
        System.out.println(y);
     }

    static int x(){
       int arr[]={1,2,3,4};
       for(int i=0;i<arr.length;i++){
          return arr[i];
       }
       return 10;
    }
}
import java.util.*;
class Table{
        
        void table(int num){
            for(int i=1;i<=10;i++){
               System.out.println(num*i);
            }
        }
       public static void main(String []args){
           Scanner sc=new Scanner(System.in);
           int x=sc.nextInt();
           Table t=new Table();
           t.table(x);
       }
}
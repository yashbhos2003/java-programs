class Recursion{

          void print(int x){
               if(x<0)
                 return;
             System.out.println(x);
             print(x-1);
         }

      public static void main(String[]args){
         Recursion rs=new Recursion();
         rs.print(5);
      }

}

public class Pattern16{
      public static void main(String [] args){
         int row=5;
         int col=5;
         for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
             
               if(i==j || i==1 || j==1)
                System.out.print("#  ");
               else
                System.out.print("   ");
            }
                        
         System.out.println();
         }
      }
}
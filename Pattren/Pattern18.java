
public class Pattern18{
      public static void main(String [] args){
         int row=5;
         int col=9;
         for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
             
               if( j==6-i || i==5 || j==4+i)
                System.out.print("* ");
               else
                System.out.print("  ");
            }
                        
         System.out.println();
         }
      }
}
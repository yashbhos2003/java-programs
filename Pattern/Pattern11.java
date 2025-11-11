// reverse triangle pattern
public class Pattern11{
      public static void main(String [] args){
         int row=5;
         int col=9;
         for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
             
               if((j>=i) && (j<=10-i))
               System.out.print("* ");
              else
                System.out.print("  "); 
            }
                        
         System.out.println();
         }
      }
}
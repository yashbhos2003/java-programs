//triangle pattern
public class Pattern9{
      public static void main(String [] args){
         int row=5;
         int col=9;
         for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
             // if((j>=(row-i+1) && j<=5)|| (j>5) && (j<=col-(5-i)) )
               if((j<=4+i)  && (j>=6-i))
               System.out.print("* ");
              else
                System.out.print("  "); 
            }
                        
         System.out.println();
         }
      }
}
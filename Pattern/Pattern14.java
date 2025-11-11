
public class Pattern14{
      public static void main(String [] args){
         int row=13;
         int col=7;
         for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
             
               if((j<=col-i+1) || (i>7)&& (j<=i-6))
               System.out.print("*");
            }
                        
         System.out.println();
         }
      }
}
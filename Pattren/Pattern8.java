public class Pattern8{
     public static void main(String [] args){
       int row=5,col=5;
       
      /* for(int i=1;i<=row;i++){
          for(int j=1;j<=row-i;j++){
            System.out.print("  ");    
          }
          for(int k=1;k<=i;k++){
            System.out.print("* ");    
          }

         System.out.println();
       }*/

        for(int i=1;i<=row;i++){
           for(int j=1;j<=col;j++){
             if(j>=(row-i+1))
              System.out.print("* ");
             else
              System.out.print("  ");  
           }
         System.out.println();
        }
     
     }
}
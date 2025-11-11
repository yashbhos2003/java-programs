
public class Pattern20{
      public static void main(String [] args){
         int row=7;
         int col=7;
         for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
               
               if(j==1||j==7 ||j==i||j==8-i){
                System.out.print("* ");
                }else{
                System.out.print("  ");
                } 
            }
                        
         System.out.println();
         }
      }
}
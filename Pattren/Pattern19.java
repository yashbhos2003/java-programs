
public class Pattern19{
      public static void main(String [] args){
         int row=5;
         int col=9;
         for(int i=1;i<=row;i++){
              boolean flag=true;
            for(int j=1;j<=col;j++){
               
               if((j>=i) && (j<=10-i) && flag){
                System.out.print("* ");
                 flag=false;
                }else{
                System.out.print("  ");
                 flag=true;
                } 
            }
                        
         System.out.println();
         }
      }
}
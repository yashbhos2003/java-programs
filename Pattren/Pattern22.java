
public class Pattern22{
      public static void main(String [] args){
         int row=6;
         int col=11;
         for(int i=1;i<=row;i++){
              boolean flag=true;
            for(int j=1;j<=col;j++){
               
               if(((j>=7-i) && (j<=5+i)) && flag){
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
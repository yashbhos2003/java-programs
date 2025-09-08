
public class Pattern12{
      public static void main(String [] args){
         int row=5;
         int col=5;
         for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
             if(j<=col-i+1){
               if(i%2==1)
               System.out.print("# ");
              else
                System.out.print("* "); 
            }
          }              
         System.out.println();
         }
      }
}
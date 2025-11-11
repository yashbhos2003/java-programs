class Multiplication{
           static int mul=1;
           int mult(int num){
                 if(num<=0){
                   return mul;
                 } 
                 mul=mul*num;
                
                 return mult(num - 1);  
           } 
           
   public static void main(String[]args){
        Multiplication ml=new Multiplication();
        int result=ml.mult(5);
        System.out.println(result);
   }
}
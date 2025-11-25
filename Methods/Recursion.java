class Recursion{

       int  getFact(int n){
          if(n<=1){
             return n;
          }else{
            
             return n*getFact(n-1); 
          }
       }
       
     public static void main(String args[]){
     Recursion r=new Recursion();
     System.out.println(r.getFact(5));
     }
}
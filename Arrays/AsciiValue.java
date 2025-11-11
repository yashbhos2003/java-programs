
class AsciiValue{
        void printAscii(int x){
           while(x<=127){
              System.out.println(x+"="+(char)x);
              x++;
           }
       }
       public static void main(String []args){
           AsciiValue as=new AsciiValue();
            as.printAscii(1);
       }

}
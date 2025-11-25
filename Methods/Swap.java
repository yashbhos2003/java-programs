class SwapLastFirst{
     int swap(int num){
        int last=num%10;
        num/=10;
        int x=num,count=0;
        while(x>0){
         x/=10;
         count++;
        }
        
        int digit=1;
        while(count>1){
         digit=digit*10;
         count--;
        }
        //System.out.println(digit);
        int mid=num%(digit);
        num/=digit;

        int first=num;
        num=0;
        //System.out.println(first);
        //System.out.println(mid);
        //System.out.println(last);
        num=(last*digit*10)+mid*10+first;
        return num;
     }  
}

class Swap{
    public static void main(String []args){
    SwapLastFirst s=new SwapLastFirst();
    System.out.println(s.swap(1234));
    }
}
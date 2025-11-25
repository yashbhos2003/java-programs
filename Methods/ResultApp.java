/*Q1. Problem:
Exam class with marks of 5 subjects.
 Rules:
Pass only if each subject ≥ 40
Division based on percentage:
≥ 75 → Distinction
≥ 60 → First
≥ 45 → Second
Else → Pass


Functions:
isPass()
calculatePercentage()
getDivision()
=========================================================================================*/


class Result{
   private int mark1;
   private int mark2;
   private int mark3;
   private int mark4;
   private int mark5;
 
   public void setMark1(int mark1){
         this.mark1=mark1;
   }
   public int getMark1(){
        return mark1;
   }
   
   public void setMark2(int mark2){
         this.mark2=mark2;
   }
   public int getMark2(){
        return mark2;
   }
   public void setMark3(int mark3){
         this.mark3=mark3;
   }
   public int getMark3(){
        return mark3;
   }
   public void setMark4(int mark4){
         this.mark4=mark4;
   }
   public int getMark4(){
        return mark4;
   }
   public void setMark5(int mark5){
         this.mark5=mark5;
   }
   public int getMark5(){
        return mark5;
   }
} 

class Methods{
    Result s;
    void setObject(Result s){
      this.s=s;
    }

    String isPass(){
       boolean flag=false;
      if(s.getMark1()>=40 && s.getMark2()>=40 && s.getMark3()>=40 && s.getMark4()>=40 && s.getMark5()>=40){  
         flag=true;
      }
      if(flag){
        return "pass";
      }else{
        return "fail";
      }
    } 

    double calculatePercentage(){ 
        int add=s.getMark1()+s.getMark2()+s.getMark3()+s.getMark4()+s.getMark5();
        double per=(add/500.0)*100;
        return per;
    }

    String getDivision(double per){
       if(per>=75){
         return "Distinction";
       }else if(per>=60){
         return "First";
       }else if(per>=45){
         return "second";
       } else if(per>=40){
          return "pass";
       }else{
          return "fail";
       }
    }
}

class ResultApp{
      public static void main(String [] args){
      Result s=new Result();
      s.setMark1(50);
      s.setMark2(60);
      s.setMark3(70);
      s.setMark4(80); 
      s.setMark5(90);

      Methods m=new Methods();
       m.setObject(s);
       System.out.println(m.isPass());
       double per=m.calculatePercentage();
       System.out.println(per);
       System.out.println(m.getDivision(per));
      }
}
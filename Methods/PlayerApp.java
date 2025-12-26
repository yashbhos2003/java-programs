/*Q30. WAP to create POJO class name as Player with field id,name and run and find player
detail whose run is second highest*/
import java.util.Scanner;
class Player{
    private int id;
    private String name;
    private int run;

    void setId(int id){
       this.id=id;
    }
    int getId(){
       return id;
    }
    void setName(String name){
       this.name=name;
    }
    String getName(){
       return name;
    }
    void setRun(int run){
       this.run=run;
    }
    int getRun(){
       return run;
    }
}

class AllPlayers{
    Player p[];

   AllPlayers(Player p[]){
     this.p=p;
   }

   void secondHighest(){
       int hrun=p[0].getRun();
       for(int i=0;i<p.length;i++){
          if(hrun<p[i].getRun()){
            hrun=p[i].getRun();
          }
       }
       int srun=p[0].getRun();
       for(int i=0;i<p.length;i++){
          if(srun<p[i].getRun() && p[i].getRun()<hrun){
            srun=p[i].getRun();
          }
       }

     System.out.println(srun);
   }
   
}

class PlayerApp{
     public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     Player p[]=new Player[3];

     for(int i=0;i<p.length;i++){
        p[i]=new Player();
        System.out.println("enter id,name,run");
        int id=sc.nextInt();
        String name=sc.next();
        int run=sc.nextInt();
        p[i].setId(id);
        p[i].setName(name);
        p[i].setRun(run);
     }

     AllPlayers al=new AllPlayers(p);
     al.secondHighest();
     }
}
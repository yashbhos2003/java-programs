/*Q1. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations:
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks. You practice object encapsulation (POJO) and multiple computations.*/
import java.util.*;
class Student{
    private int rollNo;
    private String name;
    private int[] marks;

    void setRollNo(int rollNo){
       this.rollNo=rollNo;
    }
    int getRollNo(){
       return rollNo;
    }
    void setName(String name){
       this.name=name;
    }
    String getName(){
       return name;
    }
    void setMarks(int []marks){
       this.marks=marks;
    }
    int[] getMarks(){
       return marks;
    }

}

class AllStudents{
      Student s[];
      AllStudents(Student []s){
       this.s=s;
      }

      void average(){
          double maxAvg=0;  
         for(int i=0;i<s.length;i++){
            double sum=0;
            double avg=0;
            for(int j=0;j<s[i].getMarks().length;j++){
               sum=sum+s[i].getMarks()[j];
               avg=sum/s[i].getMarks().length;
            }
           System.out.println(sum);
           if(maxAvg<avg){
             maxAvg=avg;
           }
         }
         System.out.println(maxAvg);
      } 

      void failList(){
          for(int i=0;i<s.length;i++){
             for(int j=0;j<s[i].getMarks().length;j++){
                if(s[i].getMarks()[j]<35){
                  System.out.println(s[i].getName());
                  break;
                } 
             }
          }
      }   
}

class StudentApps{
     public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     
     Student[] s=new Student[3];

     for(int i=0;i<s.length;i++){
        s[i]=new Student(); 
        System.out.println("enter rollno,names,marks");
        
        int rollNo=sc.nextInt();
        String name=sc.next();
        int []marks=new int[3];
        for(int j=0;j<marks.length;j++){
           System.out.println("enter marks of 3 subject");
           marks[j]=sc.nextInt();
        }

        s[i].setRollNo(rollNo);
        s[i].setName(name);
        s[i].setMarks(marks);
     }

     AllStudents as=new AllStudents(s);
     as.average();
     as.failList();
     }
}
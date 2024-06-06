import java.util.*;
public class Student_grade_calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int totalsubjects = sc.nextInt();
        int total =0;
        for(int i=0;i<totalsubjects ;i++){
            System.out.println("Enter marks obtained in Subject " +i +" : ");
            int marks = sc.nextInt();
            total+=marks;
            
        }
        
        float averagemarks = (float)total/totalsubjects;
        String Grade;
        if(averagemarks>=90){
            Grade="O";
        }
        else if(averagemarks>=80 && averagemarks<90){
            Grade="A+";
        }
        else if(averagemarks>=70 && averagemarks<80){
            Grade="A";
        }
        else if(averagemarks>=60 &&averagemarks<70){
            Grade="B+";
        }
        else if(averagemarks>=50 &&averagemarks<60){
            Grade="B";
        }
        else{
            Grade="P";
        }
        System.out.println("Total Marks scored is " + total);
        System.out.println("Average marks :" + averagemarks);
        System.out.println("Grade : " + Grade);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.*;


class Student{
    String name;
    int prnNo;
    private Trainer tnr[];

    public Student(String name, int prnNo,Trainer[] tnr) {
        this.name = name;
        this.prnNo = prnNo;
        this.tnr = tnr;
        
    }
    
    void studentdetails()
    {
        System.out.println("Student details");
        System.out.println("name: "+name+" prnNo : "+prnNo);
        
        for(Trainer t:tnr)
            System.out.println(t);
    }

};

class Trainer{
    String Tname;

    public Trainer(String Tname) {
        this.Tname = Tname;
    }

    @Override
    public String toString() {
        return "Trainer{" + "Tname=" + Tname + '}';
    }
    
};

 class Assignment {
    String title;
    String dt;
    String description;
    String assignee;
    
    
      
    Trainer t1[]={new Trainer("Kaur Mam"),new Trainer("Sarvat Mam"),new Trainer("Anup Sir")};
    
    Student s1=new Student("Rutuja",20,t1);
    
    public void assignmentdetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter assignment details -");
        System.out.println("enter title :");
        title=sc.next();
        System.out.println("enter date :");
        dt=sc.next();
        System.out.println("enter description :");
        description=sc.next();
        System.out.println("enter name of an assignee :");
        assignee=sc.next();
        
    }
        
       
}

public class AssignmentManager extends Assignment{
    public static void main(String[] args) {
        
        AssignmentManager am=new AssignmentManager();
        
        
        System.out.println("Following are the tasks to manage the assignment");
        System.out.println("1. Create an assignment");
        System.out.println("2. Add an assignment");
        System.out.println("3. Show assignment given to a student");
        System.out.println("4. Save assignment to file");
        System.out.println("5. load assignment to file");
        
        System.out.println("Enter the task which you want to perform : ");
        Scanner sca=new Scanner(System.in);
        int ch=sca.nextInt();
        
        switch(ch)
        {
            case 1 :
                System.err.println("create an assignment");
                am.createAssignment();
                break;
               
            case 2 :
                System.err.println("Add an assignment");
                
                am.addAssignment();
                break;
               
            case 3:
                System.err.println("Show assignment given to a student");
                am.showAssignment();
                break;
                
            case 4:
                break;
                
            case 5:
                break;
                
            default: 
                System.out.println("Enter valid choice");
        }
        
    }
    
    void createAssignment()
    {
        Assignment a1=new Assignment();
        a1.assignmentdetails();
    }
    
    void addAssignment()
    {
        Assignment a2=new Assignment();
        List lt=new ArrayList();
        lt.add(0,a2);
        //System.out.println(lt.get(0));
        a2.assignmentdetails();
    }
    
    void showAssignment()
    {
        s1.studentdetails();
    }
}

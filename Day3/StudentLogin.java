package Day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentLogin {

    ArrayList<Student> al=new ArrayList<>();
    
    void store(){
        al.add(new Student(1,"Dhananjay","Pune","9356628136"));
        al.add(new Student(2,"Prem","Nandurbar","9119528136"));
        al.add(new Student(3,"Kunal","Mumbai","9763628136"));
        al.add(new Student(4,"Gaurav","Nashik","8329976618"));
    }
    
    Student searchById(int id){
        for(int i=0;i<al.size();i++){
            if(al.get(i).id == id){
                return al.get(i);
            }
        }
        return null;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        StudentLogin sl=new StudentLogin();
        sl.store();
        
        //Collections.sort(sl.al,new SortByName());

        // Iterator<Student> i=sl.al.iterator();

        // while(i.hasNext()){
        //     Student s = i.next();
        //     System.out.println(s);
        // }



        // System.out.println("Enter id to Search : ");
        // int id=0 ;
        // try{
        //     id= sc.nextInt();
        //     System.out.println("*********** "+sl.searchById(id)+" ************");
        // }
        // catch(InputMismatchException e){
        //     System.out.println("Enter Correct Input");
        // }

        TreeSet<Student> ts=new TreeSet<>(sl.al);
        System.out.println(ts);
    }
    
}

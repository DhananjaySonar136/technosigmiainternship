package Day3;

public class Student implements Comparable<Student>{
    int id;
    String name;
    String address;
    String mobile;

    Student(){
        System.out.println("Student Environment");
    }

    Student(int id,String name,String address,String mobile){    //parameterized Constructor
        this.id=id;            
        this.name=name;        
        this.address = address;
        this.mobile = mobile;  
    }

    public String toString(){
        return "ID :"+id +"  Name :"+ name +"  Address :"+ address +"  Mob No. :" +mobile;
    }

    void display(){         //Instance Method
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Mobile : " + mobile);   
    }

    public int compareTo(Student s1){
        return this.id - s1.id;
    }
}
                                                                                                           
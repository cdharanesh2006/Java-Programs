class Student {
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    void get(){
        System.out.println(name+" "+rollno);
    }
}
public class program8{
    public static void main(String[] args) {
        Student s=new Student("Dharanesh",123);
        s.get();
    }
}

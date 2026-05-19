class Student{
    void display(){
        System.out.println("Medical");
    }
    Student(){
        System.out.println("Engineering");
    }
}
public class program6 {
    public static void main(String[] args) {
        Student s=new Student();
        s.display();
    }
}
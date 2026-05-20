class Student{
    void display(){
        System.out.println("Java Programming");
        System.out.println("Assignment Completed");
        System.out.println("III Year");
    }
}
class Trainer extends Student{
    void details(){
        System.out.println("All Students are pass their exam");
    }
}
public class Program10{
    public static void main(String[] args) {
        Trainer t = new Trainer();
        t.details();
        t.display();
    }
}

interface A{
    void display();
}
interface B{
    void show();
}
class C implements A,B{
    public void display(){
        System.out.println("Definition of A");
    }
    public void show(){
        System.out.println("Definition of B");
    }
}

public class Multipleinheritence {
    public static void main(String[] args) {
        C a=new C();
        a.display();
        a.show();
    }
     
}
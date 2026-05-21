class Parent{
    final void show(){
        System.out.println("Program");
    }
}
class Child extends Parent{
    final void show(){
        System.out.println("Java");
    }
}
public class Finalmethod {
    public static void main(String[] args) {
        Child pr=new Child();
        pr.show();
    
        

    }
}

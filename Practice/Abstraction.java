import java.util.*;
abstract class Picture{
    abstract void area(int side);
    void fun(){
        System.out.println("Java Program");
    }
}
class Square extends Picture{
    void area(int side){
        System.out.println(side*side);
    }
}
public class Abstraction {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int sq=sc.nextInt();
            Square st=new Square();
            st.area(sq);
            st.fun();
        }
    }


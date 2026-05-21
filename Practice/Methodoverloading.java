class raven{
    void display(int a,int b){
        System.out.println(a+b);
    }
    void display(int a){
        System.out.println(a);
    }
}
public class Methodoverloading{
    public static void main(String[] args) {
        raven a=new raven();
        a.display(10,30);
        a.display(89);
    }
}
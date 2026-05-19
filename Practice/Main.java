import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        int age=scan.nextInt();
        scan.nextLine();
        String address=scan.nextLine();
        System.out.println("My Name Is:"+name);
       System.out.println("My Age Is:"+age);
       System.out.println("My Address Is:"+address);
    }
}
import java.util.Scanner;
public class program5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        if (num % 2==0){
            System.out.println("The Factor");
        }else {
            System.out.println("Not Factor");
        }
        sc.close();
    }
}
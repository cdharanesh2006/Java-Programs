import java.util.Scanner;
public class Main1 {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int amount=0;
        if(a > b){
        System.out.println("Trasaction Succesfull");
        }
        else {
            System.out.println("Transaction Failled");
        }
        amount=a-b;
        System.out.println(amount);
        scan.close();
    }
}

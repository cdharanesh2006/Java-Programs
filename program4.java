import java.util.Scanner;
public class program4 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the singal:");
        String name=sc.nextLine();
        switch(name){
            case "Green":
                {
                    System.out.println("Goo");
                    break;
                }
                case "Yellow":{
                    System.out.println("Waitt");
                    break;
                }
                case "Red":{
                    System.out.println("Stop");
                    break;
                }
                default:{
                    System.out.println("Invalid");
                }
                System.out.println(name);
        }
        sc.close();
    }
}

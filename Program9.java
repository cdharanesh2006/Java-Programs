class Employee {
    String name;
    int employeeid;
    int experience;
    Employee(String name,int employeeid,int experience){
        this.name=name;
        this.employeeid=employeeid;
        this.experience=experience;
    }
    void get(){
        System.out.println("EmployeeName : "+name);
        System.out.println("EmployeeID : "+ employeeid);
        System.out.println("Experience : " + experience);
    }
}
public class Program9{
    public static void main(String[] args) {
        Employee e=new Employee("Meikumar", 123, 10);
        e.get();
    }
}








public class Program9 {
    
}

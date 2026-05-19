class Child{
    String team;
    int total_teammerbers;
    Child(String team, int total_teammerbers){
        this.team = team;
        this.total_teammerbers = total_teammerbers;
    }
}
class Parent extends Child{
    String name;
    String strength;
    
    Parent(String name, String strength){
        this.name = name;
        this.strength = strength;
    }

    void Sport(){
        System.out.println("Teamname : " + team);
        System.out.println("Total Teammembers : " + total_teammerbers);
        System.out.println("Player Name : " + name);
        System.out.println("Player Strength : " + strength);
    }
}
public class Program11 {
    public static void main(String[] args) {
        Parent p = new Parent("Virat", "Batting");
        p.Sport();
    }
}

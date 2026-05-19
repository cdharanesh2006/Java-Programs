class Player{
    String name;
    int playerno;
    Player(){
        name = "Virat";
        playerno = 18;
    }
    void display(){
        System.out.println(playerno+ " " + name);
    }
}
public  class program7{
    public static void main(String[] args) {
        Player p = new Player();
        p.display();
    }
}




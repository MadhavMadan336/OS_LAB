//WRITE A PROGRAM TO CREATE A PLAYER CLASS, INHERITE THE CLASSES CRICKET-PLAYER, FOOTBALL-PLAYER FROM PLAYER CLASSES

package EXPERIMENT_3;
//Class 'player' to represent a generic player
class player {
 String name;
 int age;

 // Constructor to initialize 'name' and 'age'
 player(String n, int a) {
     name = n;
     age = a;
 }

 // Method to display player information
 void show() {
     System.out.println("\n");
     System.out.println("Player name : " + name);
     System.out.println("Age : " + age);
 }
}

//Class 'cricket_player' extending 'player'
class cricket_player extends player {
 String type;

 // Constructor to initialize 'name', 'type', and 'age'
 cricket_player(String n, String t, int a) {
     super(n, a);
     type = t;
 }

 // Method to display player information, including 'type'
 public void show() {
     super.show();
     System.out.println("Player type : " + type);
 }
}

//Class 'football_player' extending 'player'
class football_player extends player {
 String type;

 // Constructor to initialize 'name', 'type', and 'age'
 football_player(String n, String t, int a) {
     super(n, a);
     type = t;
 }

 // Method to display player information, including 'type'
 public void show() {
     super.show();
     System.out.println("Player type : " + type);
 }
}

//Main class
public class player_class {
 public static void main(String args[]) {
     // Create instances of different player types
     cricket_player sachin = new cricket_player("Sachin", "cricket", 48);
     football_player ronaldo = new football_player("Ronaldo", "football", 36);

     // Display player information
     sachin.show();
     ronaldo.show();
 }
}


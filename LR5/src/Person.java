public class Person {
	public int randNum;
    public int lives; 
    String name; 
    public Person(String name) {
        this.name = name;
        this.lives = 100;
    } 
    public static void loseLives(Person player) {
    	player.lives -= 10;
    }
}
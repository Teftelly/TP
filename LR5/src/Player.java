public class Player extends Person {
	String name;
    public Player(String name) {
    	super(name);
        this.name = name;
    }

    public static void checkRandom(int num, Enemy enemy, Player player) {
    	if (player.randNum == num) {
    		Person.loseLives(player);
    		System.out.printf("Враг попал в вас! У %s осталось %d жизней!\n", player.name, player.lives);
    	}
    	else
    		System.out.println("Враг не угадал число");
    }
}

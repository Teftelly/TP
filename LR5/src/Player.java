public class Player extends Person {
	String name;
    public Player(String name) {
    	super(name);
        this.name = name;
    }

    public static void checkRandom(int num, Enemy enemy, Player player) {
    	if (player.randNum == num) {
    		Person.loseLives(player);
    		System.out.printf("���� ����� � ���! � %s �������� %d ������!\n", player.name, player.lives);
    	}
    	else
    		System.out.println("���� �� ������ �����");
    }
}

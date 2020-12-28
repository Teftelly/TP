public class Enemy extends Person {
	String name;
    public Enemy(String name) {
        super(name);
        this.name = name;
    }

    public static void checkRandom(int num, Player player, Enemy enemy) {
    	if (enemy.randNum == num) {
    		Person.loseLives(enemy);
    		System.out.printf("�� �������, ������ � ����� � ������ %s �������� %d ������!\n", enemy.name, enemy.lives);
    	}
    	else if (enemy.randNum > num)
    		System.out.println("�� �� �������! �����, ��� �� ��������� �������, ������");
    	else if (enemy.randNum < num)
    		System.out.println("�� �� �������! �����, ��� �� ��������� �������, ������");
    }
}
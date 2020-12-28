import java.util.Scanner;

public class lab_work_5 {
    public static void main(String[] args) {
        final int from = 1;
        final int to = 20;
        Scanner scan = new Scanner(System.in);
        System.out.printf("������� ��� ������: ");
        Player player = new Player(scan.nextLine());
        System.out.printf("������� ��� �����: ");
        Enemy enemy = new Enemy(scan.nextLine());
        int numPlayer = 0, numEnemy = 0;
        while (enemy.lives > 0 && player.lives > 0) {		
            enemy.randNum = from + (int) (Math.random() * to);
            player.randNum = from + (int) (Math.random() * to);
            
            while (numPlayer != enemy.randNum && numEnemy != player.randNum) {
                System.out.printf("������� ����� �� %d �� %d: ", from, to);
                numPlayer = scan.nextInt();
                Enemy.checkRandom(numPlayer, player, enemy);
                numEnemy = from + (int) (Math.random() * to);
                Player.checkRandom(numEnemy, enemy, player);
            }
        }
        scan.close();
        System.out.println("���� ��������.");
        if (enemy.lives == 0)
            System.out.printf("����� %s �������!", player.name);
        else if (player.lives == 0)
            System.out.printf("����� %s �������!", enemy.name);
    }
}
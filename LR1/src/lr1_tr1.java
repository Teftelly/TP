public class lr1_tr1 extends Thread {
    private static int number;

    @Override
    public void run() {
    	while (true) {
            number = (int) (Math.random()*10+1);
            System.out.println("Твое число - " + number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static int Get_Number() {
        return number;
    }
}
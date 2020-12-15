public class lr1_tr3 extends Thread {
    private int number, number_Change;

    @Override
    public void run() {
    	while (true) {
            Set_Number(lr1_tr1.Get_Number());
            if (number % 2 == 1) {
                number_Change = (int)Math.pow(number, 3);
                System.out.println("Куб твоего числа - " + number_Change);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void Set_Number(int number) {
        this.number = number;
    }
}
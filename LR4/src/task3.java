import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class task3 extends JFrame {
    private JButton button = new JButton("������ ����");
    private JTextField input1 = new JTextField("", 0);

    public task3() {
        super("������������ �������");
        this.setBounds(800, 300, 200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        input1.setBackground(Color.red);
        container.add(input1);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (input1.isVisible() == true) {
                input1.setVisible(false);
                button.setText("�������� ����");
            } else {
                button.setText("������ ����");
                input1.setVisible(true);
            }
        }

    }
}
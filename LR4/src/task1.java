import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class task1 extends JFrame {
    private JButton button = new JButton("�������");
    private JTextField input1 = new JTextField("", 0);
    private JTextField input2 = new JTextField("", 0);

    public task1() {
        super("������� ���������");
        this.setBounds(300, 300, 200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(input1);
        container.add(input2);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                input1.setText("������");
                input2.setText("���!");
        }
    }
}
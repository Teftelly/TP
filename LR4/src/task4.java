import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class task4 extends JFrame {

    private JButton button = new JButton("����������");
    private JTextField input1 = new JTextField("", 0);

    public task4() {
        super("���������� ����");
        this.setBounds(1000, 300, 300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(input1);
        button.addActionListener(new ButtonEventListener());
        container.add(button);

    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (input1.getText().equals("") == false)
                JOptionPane.showMessageDialog(null, input1.getText(), "����������", JOptionPane.PLAIN_MESSAGE);
        }

    }
}
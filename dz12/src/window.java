import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window extends JFrame {
    public window() {
        createGUI();
        pack();
    }

    public void createGUI() {
        JFrame frame = new JFrame("planets");

        JPanel panel = new JPanel();
        panel.setLayout(null);


        JLabel label1 = new JLabel("Choose the planet");
        label1.setBounds(0,0,150,30);
        label1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(label1);

        JComboBox comboBox = new JComboBox();
        comboBox.setEditable(true);
        comboBox.addItem("mercury");
        comboBox.addItem("venus");
        comboBox.addItem("earth");
        comboBox.addItem("mars");
        comboBox.addItem("jupiter");
        comboBox.addItem("saturn");
        comboBox.addItem("uranus");
        comboBox.addItem("neptune");
        comboBox.setBounds(0,40,120,30);
        comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(comboBox);

        JLabel label2 = new JLabel("3,72 m/s^2");
        label2.setBounds(0,80,150,30);
        label2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(label2);

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (comboBox.getSelectedIndex() == 0) {
                    label2.setText("3,72 m/s^2");
                }
                else if (comboBox.getSelectedIndex() == 1) {
                    label2.setText("8,87 m/s^2");
                }
                else if (comboBox.getSelectedIndex() == 2) {
                    label2.setText("9,77 m/s^2");
                }
                else if (comboBox.getSelectedIndex() == 3) {
                    label2.setText("3,69 m/s^2");
                }
                else if (comboBox.getSelectedIndex() == 4) {
                    label2.setText("20,87 m/s^2");
                }
                else if (comboBox.getSelectedIndex() == 5) {
                    label2.setText("7,21 m/s^2");
                }
                else if (comboBox.getSelectedIndex() == 6) {
                    label2.setText("8,43 m/s^2");
                }
                else if (comboBox.getSelectedIndex() == 7) {
                    label2.setText("10,71 m/s^2");
                }
            }
        });

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(160, 160);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {}
    }

    public static void main(String[] args) {
        new window();
    }
}
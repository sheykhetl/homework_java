import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class game extends JFrame {
    public int number;
    public int repeat=0;
    public int result=0;
    public game() {
        super();
        Random rnd = new Random();
        number = rnd.nextInt(20);
        System.out.println(number);
        JFrame frame = new JFrame("Угадай число");
        JButton button = new JButton("Проверить значение");
        button.setBackground(Color.WHITE);
        JButton button_exit = new JButton("Выйти");
        JTextField chislo = new JTextField("Текст", 25);
        chislo.setFont(new Font("Dialog", Font.PLAIN, 20));
        chislo.setHorizontalAlignment(JTextField.CENTER);
        chislo.setBackground(Color.WHITE);
        chislo.setBounds(30, 100, 320, 40);
        button.setBounds(30,160,320,40);
        button_exit.setBounds(30,260,320,40);
        button_exit.setVisible(false);
        frame.add(button);
        frame.add(chislo);
        frame.add(button_exit);
        JTextField text2 = new JTextField("Результат угадывания", 20);
        frame.add(text2);
        text2.setFont(new Font("Dialog", Font.PLAIN, 20));
        text2.setHorizontalAlignment(JTextField.CENTER);
        text2.setBackground(Color.WHITE);
        text2.setBounds(20, 230, 320, 30);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = Integer.parseInt(chislo.getText());
                if (input > number) {
                    text2.setText("Число больше необходимого");
                }
                else if (input<number) {
                    text2.setText("Число меньше необходимого");
                }
                else if (input == number){
                    text2.setText("Вы победили");
                    result = 1;
                    button_exit.setVisible(true);
                    button.setVisible(false);
                }
                repeat++;
                if ((repeat == 3) && (result != 1)) {
                    text2.setText("Вы проиграли");
                    button_exit.setVisible(true);
                    button.setVisible(false);
                }
            }
        };
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // dispose();
                System.exit(0);
            }
        };
        button.addActionListener(actionListener);
        button_exit.addActionListener(actionListener2);
    }

}
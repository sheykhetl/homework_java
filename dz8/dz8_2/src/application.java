import javax.swing.*;

public class application {

    public application(String path) {
        JFrame frame = new JFrame();
        frame.add(new ImagePanel(path));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        if (args.length > 0) {
            new application(args[0]);
        }
    }
}
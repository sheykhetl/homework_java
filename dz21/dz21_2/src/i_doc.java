import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public interface i_doc {
    public default void createGUI() {
        Frame frame = new JFrame("test frame");
        ((JFrame) frame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("verdana", Font.PLAIN, 11);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("file");
        fileMenu.setFont(font);

        JMenu newMenu = new JMenu("new");
        newMenu.setFont(font);
        fileMenu.add(newMenu);

        JMenuItem txtFileItem = new JMenuItem("text file");
        txtFileItem.setFont(font);
        newMenu.add(txtFileItem);

        txtFileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                create_text_doc createTextDocument = new create_text_doc();
                createTextDocument.CreateNew();
                JOptionPane.showConfirmDialog(frame, "вы успешно создали текстовый файл!", "внимание!", JOptionPane.DEFAULT_OPTION);
            }
        });

        JMenuItem imgFileItem = new JMenuItem("image file");
        imgFileItem.setFont(font);
        newMenu.add(imgFileItem);

        imgFileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "вы успешно создали графический файл!", "Внимание!", JOptionPane.DEFAULT_OPTION);
            }
        });

        JMenuItem musiicItem = new JMenuItem("music File");
        musiicItem.setFont(font);
        newMenu.add(musiicItem);

        musiicItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "вы успешно создали музыкальный файл!", "Внимание!", JOptionPane.DEFAULT_OPTION);
            }
        });

        JMenu openMenu = new JMenu("open");
        openMenu.setFont(font);
        fileMenu.add(openMenu);

        JMenuItem txtFileItem2 = new JMenuItem("text file");
        txtFileItem2.setFont(font);
        openMenu.add(txtFileItem2);

        txtFileItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                create_text_doc createTextDocument = new create_text_doc();
                createTextDocument.CreateOpen();
                JOptionPane.showConfirmDialog(frame, "вы успешно создали текстовый файл!", "Внимание!", JOptionPane.DEFAULT_OPTION);
            }
        });

        JMenuItem imgFileItem2 = new JMenuItem("image file");
        imgFileItem2.setFont(font);
        openMenu.add(imgFileItem2);

        imgFileItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "вы успешно создали графический файл!", "Внимание!", JOptionPane.DEFAULT_OPTION);
            }
        });

        JMenuItem musiicItem2 = new JMenuItem("music file");
        musiicItem2.setFont(font);
        openMenu.add(musiicItem2);

        musiicItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "вы успешно создали музыкальный файл!", "Внимание!", JOptionPane.DEFAULT_OPTION);
            }
        });

        JMenuItem saveItem = new JMenuItem("save");
        saveItem.setFont(font);
        fileMenu.add(saveItem);


        fileMenu.addSeparator();

        JMenuItem exitItem = new JMenuItem("exit");
        exitItem.setFont(font);
        fileMenu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(fileMenu);

        ((JFrame) frame).setJMenuBar(menuBar);

        frame.setPreferredSize(new Dimension(270, 225));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
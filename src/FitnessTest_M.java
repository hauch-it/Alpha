import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FitnessTest_M extends JFrame {
    JFrame frame = null;
    JPanel panel_1 = null;
    JButton button_1 = null;
    JTextField field_1 = null;
    JMenuItem menuItem_1 = null;
    JMenuBar menuBar = null;
    JMenu menu = null;
    JLabel height_label = null;
    JTextField height_tf = null;
    JLabel weight_label = null;
    JTextField weight_tf = null;
    JLabel height_ungueltig = null;
    JLabel weight_ungueltig = null;

    public FitnessTest_M() {
        frame = new JFrame("Fitness Test");
        frame.setSize(1920, 1080);

        panel_1 = new JPanel();
        frame.setContentPane(panel_1);

        menu = new JMenu("Option");
        menuItem_1 = new JMenuItem("Exit");
        panel_1.add(menuItem_1);

        menuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                if(a.getSource() == menuItem_1) {
                    System.exit(0);
                }
            }
        });

        menu.add(menuItem_1);

        menuBar = new JMenuBar();
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

        height_ungueltig = new JLabel();
        height_ungueltig.setForeground(Color.red);
        panel_1.add(height_ungueltig);

        height_label = new JLabel("Geben sie hier ihre Koerpergroesse ein (in Meter)");
        panel_1.add(height_label);
        height_tf = new JTextField(40);
        height_tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                try {
                    float height = Float.parseFloat(height_tf.getText());
                    height_ungueltig.setText("");
                } catch (NumberFormatException e1) {
                    height_ungueltig.setText("Ungueltige Nummer");
                }
            }
        });
        panel_1.add(height_tf);

        weight_ungueltig = new JLabel();
        weight_ungueltig.setForeground(Color.red);
        panel_1.add(weight_ungueltig);

        weight_label = new JLabel("Geben sie hier ihr Gewicht ein (in Kilogramm)");
        panel_1.add(weight_label);
        weight_tf = new JTextField(40);
        weight_tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent w) {
                try {
                    float weight = Float.parseFloat(weight_tf.getText());
                    weight_ungueltig.setText("");
                } catch (NumberFormatException w1) {
                    weight_ungueltig.setText("Ungueltige Nummer");
                }
            }
        });
        panel_1.add(weight_tf);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        FitnessTest_M M = new FitnessTest_M();
    }
}


import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
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
    JButton bmi_rechnen = null;

    public FitnessTest_M() {
        frame = new JFrame("Fitness Test");
        frame.setLayout(null);
        frame.setSize(1920, 1080);

        //  panel_1 = new JPanel(new BorderLayout());
        //  frame.setContentPane(panel_1);

        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        menu = new JMenu("Option");
        menuItem_1 = new JMenuItem("Exit");
        menuBar.add(menu);
        menu.add(menuItem_1);

        menuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                if(a.getSource() == menuItem_1) {
                    System.exit(0);
                }
            }
        });



        height_ungueltig = new JLabel();
        height_ungueltig.setForeground(Color.red);


        height_label = new JLabel("Geben sie hier ihre Koerpergroesse ein (in Meter)");
        height_label.setBounds(10, 10, 280, 30);
        //panel_1.add(height_label);
        height_tf = new JTextField(40);
        height_tf.setBounds(10, 40, 280, 30);
        height_tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                try {
                    float height = Float.parseFloat(height_tf.getText());
                    height_ungueltig.setText("");
                } catch (NumberFormatException e1) {
                    height_ungueltig.setText("Ungueltige Nummer");
                    height_ungueltig.setBounds(10, 70, 280, 20);
                }
            }
        });
        //  panel_1.add(height_tf);

        weight_ungueltig = new JLabel();
        weight_ungueltig.setForeground(Color.red);


        weight_label = new JLabel("Geben sie hier ihr Gewicht ein (in Kilogramm)");
        weight_label.setBounds(320, 10, 300, 30);
        //  panel_1.add(weight_label);
        weight_tf = new JTextField(40);
        weight_tf.setBounds(320, 40, 300, 30);
        weight_tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent w) {
                try {
                    float weight = Float.parseFloat(weight_tf.getText());
                    weight_ungueltig.setText("");
                } catch (NumberFormatException w1) {
                    weight_ungueltig.setText("Ungueltige Nummer");
                    weight_ungueltig.setBounds(320, 70, 300, 20);
                }
            }
        });
        // panel_1.add(weight_tf);

        frame.add(height_label);
        frame.add(height_tf);
        frame.add(height_ungueltig);
        frame.add(weight_label);
        frame.add(weight_tf);
        frame.add(weight_ungueltig);

        bmi_rechnen = new JButton("BMI berechnen");
        bmi_rechnen.setBounds(200, 90, 200, 30);
        bmi_rechnen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent b) {
                if(b.getSource() == bmi_rechnen) {
                    float height = Float.parseFloat(height_tf.getText());
                    float weight = Float.parseFloat(weight_tf.getText());
                    int bmi = calculateBmi(height, weight);
                    if(bmi < 19) {
                        JOptionPane.showMessageDialog(null,
                                "Ihr BMI: " + bmi + " \nUntergewicht!",
                                "Ergebnis",
                                JOptionPane.WARNING_MESSAGE);
                    }
                    if(bmi >= 19 && bmi <= 25) {
                        JOptionPane.showMessageDialog(null,
                                "Ihr BMI: " + bmi + " \nNormalgewicht!",
                                "Ergebnis",
                                JOptionPane.WARNING_MESSAGE);
                    }
                    if(bmi > 26 && bmi <= 30) {
                        JOptionPane.showMessageDialog(null,
                                "Ihr BMI: " + bmi + " \nLeichtes Übergewicht!",
                                "Ergebnis",
                                JOptionPane.WARNING_MESSAGE);
                    }
                    if(bmi >= 31) {
                        JOptionPane.showMessageDialog(null,
                                "Ihr BMI: " + bmi + " \nÜbergewicht!",
                                "Ergebnis",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });

        frame.add(bmi_rechnen);


        frame.setVisible(true);
    }

    public static void main(String[] args) {
        FitnessTest_M M = new FitnessTest_M();
    }

    public int calculateBmi(float height, float weight) {
        return (int) (weight / (height*height));
    }
}


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
    JMenuItem menuItem_1 = null;
    JMenuItem menuItem_2 = null;
    JMenuBar menuBar = null;
    JMenu menu = null;
    JLabel height_label = null;
    JTextField height_tf = null;
    JLabel weight_label = null;
    JTextField weight_tf = null;
    JLabel height_ungueltig = null;
    JLabel weight_ungueltig = null;
    JButton bmi_rechnen = null;
    JLabel question_label1 = null;
    JLabel question_label2 = null;
    JLabel question_label3 = null;
    JLabel question_label4 = null;
    JTextField question_tf1 = null;
    JTextField question_tf2 = null;
    JTextField question_tf3 = null;
    JTextField question_tf4 = null;
    JButton bmi_confirm = null;
    JButton question1_confirm = null;
    JButton question2_confirm = null;
    JButton question3_confirm = null;
    JButton question4_confirm = null;
    JButton totalscore_submit = null;

    int points1;
    int points2;
    int points3;
    int points4;
    int points5;


    public FitnessTest_M() {
        frame = new JFrame("Fitness Test");
        frame.setLayout(null);
        frame.setSize(1920, 1080);

        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        menu = new JMenu("Option");
        menuItem_1 = new JMenuItem("Exit");
        menuItem_2 = new JMenuItem("Hauptprogramm");
        menuBar.add(menu);
        menu.add(menuItem_2);

        menuItem_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                try {
                    JOptionPane.showMessageDialog(frame, "Wir wechseln zum Hauptprogramm");
                    Main mn = new Main();
                    frame.setVisible((false));
                    mn.fr.setVisible(true);
                    //System.exit(0);

                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Fehler");
                }
            }
        });

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

        weight_ungueltig = new JLabel();
        weight_ungueltig.setForeground(Color.red);


        weight_label = new JLabel("Geben sie hier ihr Gewicht ein (in Kilogramm)");
        weight_label.setBounds(320, 10, 300, 30);
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

        question_label1 = new JLabel("Trainieren sie: \n A: Regelmässig B: Ab und zu C: Gar nicht");
        question_label1.setBounds(660, 10, 500, 60);
        question_label2 = new JLabel("Essen sie: \n A: 1-2 mal am Tag B: 3-4 mal am Tag C: 5+ mal am Tag");
        question_label2.setBounds(1170, 10, 500, 60);
        question_label3 = new JLabel("Rauchen sie?: \n A: Sehr oft B: Ab und zu C: Nie");
        question_label3.setBounds(510, 150, 500, 60);
        question_label4 = new JLabel("Trinken sie regelmässig Alkohol?: \n A: Sehr oft B: Ab und zu C: Nie");
        question_label4.setBounds(10, 150, 500, 60);

        question_tf1 = new JTextField(10);
        question_tf1.setBounds(660, 70, 500, 30);
        question_tf2 = new JTextField(10);
        question_tf2.setBounds(1170, 70, 500, 30);
        question_tf3 = new JTextField(10);
        question_tf3.setBounds(520, 210, 500, 30);
        question_tf4 = new JTextField(10);
        question_tf4.setBounds(10, 210, 500, 30);



        question1_confirm = new JButton("Bestätigen");
        question1_confirm.setBounds(660, 100, 150, 30);
        question1_confirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == question1_confirm) {
                    if(question_tf1.getText().startsWith("A") || question_tf1.getText().startsWith("a")) {
                        points1 = 10;
                    }
                    if(question_tf1.getText().startsWith("B") || question_tf1.getText().startsWith("b")) {
                        points1 = 5;
                    }
                    if(question_tf1.getText().startsWith("C") || question_tf1.getText().startsWith("c")) {
                        points1 = 0;
                    }
                }
            }
        });

        question2_confirm = new JButton("Bestätigen");
        question2_confirm.setBounds(1170, 100, 150, 30);
        question2_confirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == question2_confirm) {
                    if(question_tf2.getText().startsWith("A") || question_tf2.getText().startsWith("a")) {
                        points2 = 10;
                    }
                    if(question_tf2.getText().startsWith("B") || question_tf2.getText().startsWith("b")) {
                        points2 = 5;
                    }
                    if(question_tf2.getText().startsWith("C") || question_tf2.getText().startsWith("c")) {
                        points2 = 0;
                    }
                }
            }
        });

        question3_confirm = new JButton("Bestätigen");
        question3_confirm.setBounds(520, 240, 150, 30);
        question3_confirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == question3_confirm) {
                    if(question_tf3.getText().startsWith("A") || question_tf3.getText().startsWith("a")) {
                        points3 = 0;
                    }
                    if(question_tf3.getText().startsWith("B") || question_tf3.getText().startsWith("b")) {
                        points3 = 4;
                    }
                    if(question_tf3.getText().startsWith("C") || question_tf3.getText().startsWith("c")) {
                        points3 = 10;
                    }
                }
            }
        });

        question4_confirm = new JButton("Bestätigen");
        question4_confirm.setBounds(10, 240, 150, 30);
        question4_confirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == question4_confirm) {
                    if(question_tf4.getText().startsWith("A") || question_tf4.getText().startsWith("a")) {
                        points4 = 0;
                    }
                    if(question_tf4.getText().startsWith("B") || question_tf4.getText().startsWith("b")) {
                        points4 = 4;
                    }
                    if(question_tf4.getText().startsWith("C") || question_tf4.getText().startsWith("c")) {
                        points4 = 10;
                    }
                }
            }
        });


        frame.add(height_label);
        frame.add(height_tf);
        frame.add(height_ungueltig);
        frame.add(weight_label);
        frame.add(weight_tf);
        frame.add(weight_ungueltig);
        frame.add(question_label1);
        frame.add(question_label2);
        frame.add(question_label3);
        frame.add(question_label4);
        frame.add(question_tf1);
        frame.add(question_tf2);
        frame.add(question_tf3);
        frame.add(question_tf4);
        frame.add(question1_confirm);
        frame.add(question2_confirm);
        frame.add(question3_confirm);
        frame.add(question4_confirm);

        bmi_rechnen = new JButton("BMI Berechnen");
        bmi_rechnen.setBounds(100, 90, 150, 30);
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

        bmi_confirm = new JButton("BMI Bestätigen");
        bmi_confirm.setBounds(400, 90, 150, 30);
        bmi_confirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bmi_confirm) {
                    float height = Float.parseFloat(height_tf.getText());
                    float weight = Float.parseFloat(weight_tf.getText());
                    int bmi = calculateBmi(height, weight);
                    if(bmi <= 15) points5 = 0;
                    if(bmi == 16) points5 = 1;
                    if(bmi == 17) points5 = 2;
                    if(bmi == 18) points5 = 3;
                    if(bmi == 19) points5 = 6;
                    if(bmi == 20) points5 = 8;
                    if(bmi == 21) points5 = 9;
                    if(bmi == 22) points5 = 10;
                    if(bmi == 23) points5 = 10;
                    if(bmi == 24) points5 = 9;
                    if(bmi == 25) points5 = 8;
                    if(bmi == 26) points5 = 7;
                    if(bmi == 27) points5 = 6;
                    if(bmi == 28) points5 = 5;
                    if(bmi == 29) points5 = 4;
                    if(bmi == 30) points5 = 4;
                    if(bmi == 31) points5 = 3;
                    if(bmi == 32) points5 = 2;
                    if(bmi == 33) points5 = 1;
                    if(bmi >= 34) points5 = 0;
                }
            }
        });


        frame.add(bmi_rechnen);
        frame.add(bmi_confirm);

        totalscore_submit = new JButton("Gesammtergebnis");
        totalscore_submit.setBounds(1100, 200, 200, 150);
        totalscore_submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == totalscore_submit) {
                    float sum = (points1+points2+points3+points4+points5)/5;
                    JOptionPane.showMessageDialog(null,
                            "Ihre Gesammtfitnesspunktzahl betraegt:\n" + sum + "\n (Skala von 1-10)",
                            "Testergebnis",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
 //Fertig
        frame.add(totalscore_submit);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        FitnessTest_M M = new FitnessTest_M();
    }

    public int calculateBmi(float height, float weight) {
        return (int) (weight / (height*height));
    }
}


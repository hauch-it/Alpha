import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Quiz_Spiel extends JFrame {
    JLabel label_1;
    JTextArea textarea_1;
    JScrollPane sp_textarea_1;
    JLabel label_2;
    JLabel label_3;
    JLabel label_4;
    JLabel label_5;
    JLabel label_6;
    JLabel label_7;
    JTextArea textarea_2;
    JScrollPane sp_textarea_2;
    JTextArea textarea_3;
    JScrollPane sp_textarea_3;
    JTextArea textarea_4;
    JScrollPane sp_textarea_4;
    JTextArea textarea_5;
    JScrollPane sp_textarea_5;
    JTextArea textarea_6;
    JScrollPane sp_textarea_6;
    JLabel label_8;
    JLabel label_9;
    JTextField textfield_4;
    JButton button_1;
    JTextField textfield_5;
    JButton button_2;
    JLabel label_10;
    JTextField textfield_7;
    JButton button_3;
    JLabel label_11;
    JLabel label_12;
    JTextField textfield_8;
    JTextField textfield_9;
    JButton button_4;
    JButton button_5;
    JTextField textfield_10;
    JLabel label_13;

    public Quiz_Spiel() {
        Quiz_SpielLayout customLayout = new Quiz_SpielLayout();

        getContentPane().setFont(new Font("Helvetica", Font.PLAIN, 12));
        getContentPane().setLayout(customLayout);

        label_1 = new JLabel("Herzlich Willkommen zu unserem Quiz!");
        getContentPane().add(label_1);

        textarea_1 = new JTextArea("Beantworten Sie uns 5 kurze Fragen und gewinnen Sie 10000 Euro!");
        sp_textarea_1 = new JScrollPane(textarea_1);
        getContentPane().add(sp_textarea_1);

        label_2 = new JLabel("Frage 1:");
        getContentPane().add(label_2);

        label_3 = new JLabel("Komlovski Eugen");
        getContentPane().add(label_3);

        label_4 = new JLabel("Frage 5:");
        getContentPane().add(label_4);

        label_5 = new JLabel("Frage 4:");
        getContentPane().add(label_5);

        label_6 = new JLabel("Frage 3:");
        getContentPane().add(label_6);

        label_7 = new JLabel("Frage 2:");
        getContentPane().add(label_7);

        textarea_2 = new JTextArea("Was gehört nicht zum Test Driven Developement?");
        sp_textarea_2 = new JScrollPane(textarea_2);
        getContentPane().add(sp_textarea_2);

        textarea_3 = new JTextArea("Was ist JUnit?");
        sp_textarea_3 = new JScrollPane(textarea_3);
        getContentPane().add(sp_textarea_3);

        textarea_4 = new JTextArea("Was macht  git status?");
        sp_textarea_4 = new JScrollPane(textarea_4);
        getContentPane().add(sp_textarea_4);

        textarea_5 = new JTextArea("Welche Programmiersprache existiert nicht?");
        sp_textarea_5 = new JScrollPane(textarea_5);
        getContentPane().add(sp_textarea_5);

        textarea_6 = new JTextArea("Wie wird ein infizierter Programmcode bezeichnet?");
        sp_textarea_6 = new JScrollPane(textarea_6);
        getContentPane().add(sp_textarea_6);

        label_8 = new JLabel("A: Refactoring  B: Transformation   C: Clean Code");
        getContentPane().add(label_8);

        label_9 = new JLabel("A: Sprache   B: Framework   C: Methode");
        getContentPane().add(label_9);

        textfield_4 = new JTextField("");
        getContentPane().add(textfield_4);

        button_1 = new JButton("Prüfen");
        getContentPane().add(button_1);
        button_1.addActionListener(new CloseListener2());


        textfield_5 = new JTextField("");
        getContentPane().add(textfield_5);

        button_2 = new JButton("Prüfen");
        getContentPane().add(button_2);
        button_2.addActionListener(new CloseListener());

        label_10 = new JLabel("A: Senden  B: Speichern  C: Änderungen anzeigen ");
        getContentPane().add(label_10);

        textfield_7 = new JTextField("");
        getContentPane().add(textfield_7);

        button_3 = new JButton("Prüfen");
        getContentPane().add(button_3);
        button_3.addActionListener(new CloseListener1());

        label_11 = new JLabel("A: C**        B: C++       C: C# ");
        getContentPane().add(label_11);

        label_12 = new JLabel("A: Zecke      B: Schlange      C: Wurm");
        getContentPane().add(label_12);

        textfield_8 = new JTextField("");
        getContentPane().add(textfield_8);

        textfield_9 = new JTextField("");              //Hier
        getContentPane().add(textfield_9);

        button_4 = new JButton("Prüfen");
        getContentPane().add(button_4);
        button_4.addActionListener(new CloseListener3());

        button_5 = new JButton("Prüfen");
        getContentPane().add(button_5);
        button_5.addActionListener(new CloseListener4());

        textfield_10 = new JTextField("textfield_10");
        getContentPane().add(textfield_10);

        label_13 = new JLabel("Gewinn:");
        getContentPane().add(label_13);

        setSize(getPreferredSize());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });







    }

    public static void main(String args[]) {
        Quiz_Spiel window = new Quiz_Spiel();

        window.setTitle("Quiz_Spiel");
        window.pack();
        window.show();
    }

    class CloseListener2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent a) {

            if(textfield_4.getText().startsWith("C")  || textfield_4.getText().startsWith("c") ) {
                System.out.println("ja");
                textfield_4.setText("Richtig !  Gewinn 1000 Euro");
                JOptionPane.showMessageDialog(null,
                    "Herzlichen Glückwunsch , Sie sind nicht so dumm, wie ich dachte !",
                    "Eine Nachricht",
                    JOptionPane.WARNING_MESSAGE);


            }else{
                System.out.println("nein");
                textfield_4.setText("Falsch geantwortet! ");
            }



        }

    }

    class CloseListener4 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent a) {

            if(textfield_9.getText().startsWith("C")  || textfield_9.getText().startsWith("c") ) {
                System.out.println("ja");
                textfield_9.setText("Richtig !  Gewinn 1000 Euro");
                JOptionPane.showMessageDialog(null,
                    "Herzlichen Glückwunsch, Sie haben 10000 Euro gewonnen!",
                    "Eine Nachricht",
                    JOptionPane.WARNING_MESSAGE);


            }else{
                System.out.println("nein");
                textfield_9.setText("Falsch geantwortet! ");
            }



        }

    }

    class CloseListener3 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent a) {

            if(textfield_8.getText().startsWith("A")  || textfield_8.getText().startsWith("a") ) {
                System.out.println("ja");
                textfield_8.setText("Richtig !  Gewinn 1000 Euro");
                JOptionPane.showMessageDialog(null,
                    "Gut gemacht, Egal wie leer du bist - es gibt Menschen die sind Lehrer!",
                    "Eine Nachricht",
                    JOptionPane.WARNING_MESSAGE);


            }else{
                System.out.println("nein");
                textfield_8.setText("Falsch geantwortet! ");
            }



        }

    }

    class CloseListener1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent a) {

            if(textfield_7.getText().startsWith("C")  || textfield_7.getText().startsWith("c") ) {
                System.out.println("ja");
                textfield_7.setText("Richtig !  Gewinn 1000 Euro");
                JOptionPane.showMessageDialog(null,
                    "HA, gut geraten! Wo ist der beste Ort um eine Leiche zu verstecken? Seite 2 auf Google ",
                    "Eine Nachricht",
                    JOptionPane.WARNING_MESSAGE);


            }else{
                System.out.println("nein");
                textfield_7.setText("Falsch geantwortet! ");
            }



        }

    }


    class CloseListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent a) {

            if(textfield_5.getText().startsWith("B")  || textfield_5.getText().startsWith("b") ) {
                System.out.println("ja");
                textfield_5.setText("Richtig !  Gewinn 1000 Euro");
                JOptionPane.showMessageDialog(null,
                    "Wie viele Windows-Anwender braucht man, um eine Glühbirne zu wechseln? – 100. Einer schraubt und 99 klicken die Fehlermeldungen weg.",
                    "Eine Nachricht",
                    JOptionPane.WARNING_MESSAGE);


            }else{
                System.out.println("nein");
                textfield_5.setText("Falsch geantwortet! ");
            }



        }

    }


}

class Quiz_SpielLayout implements LayoutManager {

    public Quiz_SpielLayout() {
    }

    public void addLayoutComponent(String name, Component comp) {
    }

    public void removeLayoutComponent(Component comp) {
    }

    public Dimension preferredLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);

        Insets insets = parent.getInsets();
        dim.width = 1050 + insets.left + insets.right;
        dim.height = 629 + insets.top + insets.bottom;

        return dim;
    }

    public Dimension minimumLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);
        return dim;
    }

    public void layoutContainer(Container parent) {
        Insets insets = parent.getInsets();

        Component c;
        c = parent.getComponent(0);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+8,360,32);}
        c = parent.getComponent(1);
        if (c.isVisible()) {c.setBounds(insets.left+256,insets.top+56,544,40);}
        c = parent.getComponent(2);
        if (c.isVisible()) {c.setBounds(insets.left+120,insets.top+120,136,32);}
        c = parent.getComponent(3);
        if (c.isVisible()) {c.setBounds(insets.left+840,insets.top+568,184,32);}
        c = parent.getComponent(4);
        if (c.isVisible()) {c.setBounds(insets.left+640,insets.top+344,136,32);}
        c = parent.getComponent(5);
        if (c.isVisible()) {c.setBounds(insets.left+280,insets.top+344,136,32);}
        c = parent.getComponent(6);
        if (c.isVisible()) {c.setBounds(insets.left+800,insets.top+120,136,32);}
        c = parent.getComponent(7);
        if (c.isVisible()) {c.setBounds(insets.left+456,insets.top+120,136,32);}
        c = parent.getComponent(8);
        if (c.isVisible()) {c.setBounds(insets.left+48,insets.top+168,288,40);}
        c = parent.getComponent(9);
        if (c.isVisible()) {c.setBounds(insets.left+384,insets.top+168,288,40);}
        c = parent.getComponent(10);
        if (c.isVisible()) {c.setBounds(insets.left+736,insets.top+168,288,40);}
        c = parent.getComponent(11);
        if (c.isVisible()) {c.setBounds(insets.left+200,insets.top+392,288,40);}
        c = parent.getComponent(12);
        if (c.isVisible()) {c.setBounds(insets.left+560,insets.top+392,288,40);}
        c = parent.getComponent(13);
        if (c.isVisible()) {c.setBounds(insets.left+48,insets.top+224,288,32);}
        c = parent.getComponent(14);
        if (c.isVisible()) {c.setBounds(insets.left+384,insets.top+224,288,32);}
        c = parent.getComponent(15);
        if (c.isVisible()) {c.setBounds(insets.left+48,insets.top+264,200,32);}
        c = parent.getComponent(16);
        if (c.isVisible()) {c.setBounds(insets.left+256,insets.top+264,80,32);}
        c = parent.getComponent(17);
        if (c.isVisible()) {c.setBounds(insets.left+384,insets.top+264,200,32);}
        c = parent.getComponent(18);
        if (c.isVisible()) {c.setBounds(insets.left+592,insets.top+264,80,32);}
        c = parent.getComponent(19);
        if (c.isVisible()) {c.setBounds(insets.left+736,insets.top+224,288,32);}
        c = parent.getComponent(20);
        if (c.isVisible()) {c.setBounds(insets.left+736,insets.top+264,200,32);}
        c = parent.getComponent(21);
        if (c.isVisible()) {c.setBounds(insets.left+944,insets.top+264,80,32);}
        c = parent.getComponent(22);
        if (c.isVisible()) {c.setBounds(insets.left+200,insets.top+448,288,32);}
        c = parent.getComponent(23);
        if (c.isVisible()) {c.setBounds(insets.left+560,insets.top+448,288,32);}
        c = parent.getComponent(24);
        if (c.isVisible()) {c.setBounds(insets.left+200,insets.top+488,200,32);}
        c = parent.getComponent(25);
        if (c.isVisible()) {c.setBounds(insets.left+560,insets.top+488,200,32);}
        c = parent.getComponent(26);
        if (c.isVisible()) {c.setBounds(insets.left+408,insets.top+488,80,32);}
        c = parent.getComponent(27);
        if (c.isVisible()) {c.setBounds(insets.left+768,insets.top+488,80,32);}
        c = parent.getComponent(28);
        if (c.isVisible()) {c.setBounds(insets.left+16,insets.top+560,128,48);}
        c = parent.getComponent(29);
        if (c.isVisible()) {c.setBounds(insets.left+16,insets.top+528,128,24);}
    }
}

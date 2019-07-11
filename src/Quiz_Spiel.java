import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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

        label_1 = new JLabel("label_1");
        getContentPane().add(label_1);

        textarea_1 = new JTextArea("textarea_1");
        sp_textarea_1 = new JScrollPane(textarea_1);
        getContentPane().add(sp_textarea_1);

        label_2 = new JLabel("label_2");
        getContentPane().add(label_2);

        label_3 = new JLabel("label_3");
        getContentPane().add(label_3);

        label_4 = new JLabel("label_4");
        getContentPane().add(label_4);

        label_5 = new JLabel("label_5");
        getContentPane().add(label_5);

        label_6 = new JLabel("label_6");
        getContentPane().add(label_6);

        label_7 = new JLabel("label_7");
        getContentPane().add(label_7);

        textarea_2 = new JTextArea("textarea_2");
        sp_textarea_2 = new JScrollPane(textarea_2);
        getContentPane().add(sp_textarea_2);

        textarea_3 = new JTextArea("textarea_3");
        sp_textarea_3 = new JScrollPane(textarea_3);
        getContentPane().add(sp_textarea_3);

        textarea_4 = new JTextArea("textarea_4");
        sp_textarea_4 = new JScrollPane(textarea_4);
        getContentPane().add(sp_textarea_4);

        textarea_5 = new JTextArea("textarea_5");
        sp_textarea_5 = new JScrollPane(textarea_5);
        getContentPane().add(sp_textarea_5);

        textarea_6 = new JTextArea("textarea_6");
        sp_textarea_6 = new JScrollPane(textarea_6);
        getContentPane().add(sp_textarea_6);

        label_8 = new JLabel("label_8");
        getContentPane().add(label_8);

        label_9 = new JLabel("label_9");
        getContentPane().add(label_9);

        textfield_4 = new JTextField("textfield_4");
        getContentPane().add(textfield_4);

        button_1 = new JButton("button_1");
        getContentPane().add(button_1);

        textfield_5 = new JTextField("textfield_5");
        getContentPane().add(textfield_5);

        button_2 = new JButton("button_2");
        getContentPane().add(button_2);

        label_10 = new JLabel("label_10");
        getContentPane().add(label_10);

        textfield_7 = new JTextField("textfield_7");
        getContentPane().add(textfield_7);

        button_3 = new JButton("button_3");
        getContentPane().add(button_3);

        label_11 = new JLabel("label_11");
        getContentPane().add(label_11);

        label_12 = new JLabel("label_12");
        getContentPane().add(label_12);

        textfield_8 = new JTextField("textfield_8");
        getContentPane().add(textfield_8);

        textfield_9 = new JTextField("textfield_9");
        getContentPane().add(textfield_9);

        button_4 = new JButton("button_4");
        getContentPane().add(button_4);

        button_5 = new JButton("button_5");
        getContentPane().add(button_5);

        textfield_10 = new JTextField("textfield_10");
        getContentPane().add(textfield_10);

        label_13 = new JLabel("label_13");
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

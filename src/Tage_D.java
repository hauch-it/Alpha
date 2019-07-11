import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;
public class Tage_D extends JFrame {

    JFrame fr = null;
    JPanel Panele = null;
    JButton button1 = null;
    JLabel label1 = null;
    JLabel label2 = null;
    JLabel label3 = null;
    JLabel label4 = null;
    JLabel label5 = null;
    JLabel label6 = null;
    JLabel label7 = null;
    JLabel label8 = null;
    JLabel label9 = null;
    JLabel labe20 = null;
    JTextField j1 = null;
    JTextField j2 = null;
    JTextField j3 = null;
    JTextField j4 = null;
    JTextField j5 = null;

    JMenuItem menuItem1 = null;
    JMenuItem menuItem2 = null;
    JOptionPane opane = null;
    JMenuBar bar =null;
    JMenu mF= null;
    JMenu mH = null;

    int button1warsovielmalgedrückt = 0;

    public Tage_D() {

        fr = new JFrame("GUI");
        fr.setSize(350, 700);
        fr.setLayout(new FlowLayout());

        Panele = new JPanel();
        fr.setContentPane(Panele);

        bar = new JMenuBar();
        fr.setJMenuBar(bar);
        mF = new JMenu("File");
        mH = new JMenu("Help");
        bar.add(mF);
        bar.add(mH);

        menuItem1  = new JMenuItem("Exit");    mF.add(menuItem1);
        menuItem2 = new JMenuItem("Info"); mH.add(menuItem2);

        j1 = new JTextField("Ein Tool der CI"); j1.setEditable(false);   j1.setSize(450,30); ;   Panele.add(j1);
        j2 = new JTextField("Tools von Daniel Hauch");   j2.setEditable(false); Panele.add(j2); j2.setSize(450,30);   Panele.add(j2);
        j3 = new JTextField("Wie ist Ihr Name?");   j3.setEditable(true); Panele.add(j2); j3.setSize(450,30);   Panele.add(j3);

        button1 = new JButton("Erfahren"); Panele.add(button1);

        j4 = new JTextField("Sie sterben in ___ Jahren!"); Panele.add(j4);


        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton hzeit = new JRadioButton("Hochzeit");
        hzeit.setBounds(100, 170, 100, 20);
        buttonGroup.add(hzeit); this.Panele.add(hzeit);
        JRadioButton gtag = new JRadioButton("Geburtstag");
        gtag.setBounds(250, 170, 100, 20);
        buttonGroup.add(gtag);  this.Panele.add(gtag);

        JLabel auswahl = new JLabel("Ihre Auswahl:");
        auswahl.setBounds(10, 200, 100, 20);
        this.Panele.add(auswahl);
        final JTextField text1 = new JTextField();
        text1.setBounds(100, 200, 300, 20);
        this.Panele.add(text1);

        hzeit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                text1.setText("MALE");
            }
        });

        gtag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                text1.setText("FEMALE");
            }
        });


        gtag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                text1.setText("FEMALE");
            }
        });

        this.fr.setVisible(true);
        this.fr.setAlwaysOnTop(true);


    }

    public static void main(String[] args) {

        Tage_D gb = new Tage_D();


    }
}


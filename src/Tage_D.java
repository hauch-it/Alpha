import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;
public class Tage_D {

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

    JMenuItem menuItem1 = null;
    JMenuItem menuItem2 = null;
    JOptionPane opane = null;
    JMenuBar bar =null;
    JMenu mF= null;
    JMenu mH = null;

    int button1warsovielmalgedrückt = 0;

    public Tage_D() {

        this.fr = new JFrame("GUI");
        this.fr.setSize(300, 900);

        this.Panele = new JPanel();
        this.fr.setContentPane(this.Panele);

        this.bar = new JMenuBar();
        this.fr.setJMenuBar(bar);
        this.mF = new JMenu("File");
        this.mH = new JMenu("Help");
        this.bar.add(mF);
        this.bar.add(mH);

        this.menuItem1  = new JMenuItem("Exit");    this.mF.add(menuItem1);
        this.menuItem2 = new JMenuItem("Info"); this.mH.add(menuItem2);

        this.label4= new JLabel("Ein Tool der CI!.");        this.Panele.add(label4);
        this.label5= new JLabel("Wollen Sie erfahren, Wie viel Zeit bleibt dir in deinem Leben noch?");
        this.Panele.add(label5);
        this.label1 = new JLabel("Wie ist Ihr Name?");  this.Panele.add(label1);

        this.j1 = new JTextField("", 20);
        this.Panele.add(j1);
        this.j1.setSize(160,20);;
        this.label2 = new JLabel("Wie alt sind Sie?");
        this.Panele.add(label2);
        this.j2 = new JTextField("", 20);
        this.Panele.add(j2);
        this.j2.setSize(160,20);

        this.label3 = new JLabel("Was machen Sie beruflich?");
        this.Panele.add(label3);
        this.j3 = new JTextField("", 20);
        this.Panele.add(j3);

        this.button1 = new JButton("Erfahren");
        this.Panele.add(button1);

        this.j4 = new JTextField("Sie sterben in ___ Jahren!");
        this.Panele.add(j4);

        this.label6 = new JLabel("Die Wahrheit ist schwer zu ertragen.");
        this.Panele.add(label6);

        this.label7 = new JLabel("ich hab eine Lösung für dich!");
        this.Panele.add(label7);

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton hzeit = new JRadioButton("Hochzeit");
        hzeit.setBounds(100, 170, 100, 20);
        buttonGroup.add(hzeit);
        this.Panele.add(hzeit);
        JRadioButton gtag = new JRadioButton("Geburtstag");
        gtag.setBounds(250, 170, 100, 20);
        buttonGroup.add(gtag);
        this.Panele.add(gtag);

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


    this.fr.setVisible(true);



    }

// Action Listener
        private class ActionListener1 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        }

    public static void main(String[] args) {

        Tage_D gb = new Tage_D();


    }
}


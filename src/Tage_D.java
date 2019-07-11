import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.ThreadLocalRandom;

public class Tage_D extends JFrame {

    JFrame fr = null;
    JPanel Panele = null;
    JButton button1 = null;
    JTextField j1 = null;
    JTextField j2 = null;
    JTextField j3 = null;
    JTextField j4 = null;


    JMenuItem menuItem1 = null;
    JMenuItem menuItem2 = null;
    JMenuBar bar =null;
    JMenu mF= null;
    JMenu mH = null;
    JMenu mI = null;


    public Tage_D() {

        fr = new JFrame("Coutinius Integration SS 2019");
        fr.setSize(600,800);
        fr.setFont(new Font("Helvetica", Font.PLAIN, 12));
        fr.setLayout(new FlowLayout());

        Panele = new JPanel();

        fr.setContentPane(Panele);

        bar = new JMenuBar();
        fr.setJMenuBar(bar);
        mF = new JMenu("File");
        mH = new JMenu("Help");
        mI = new JMenu("Info");
        bar.add(mF);
        bar.add(mH);
        bar.add(mI);

        menuItem1  = new JMenuItem("Exit");    mF.add(menuItem1);
        menuItem2  = new JMenuItem("Über");    mI.add(menuItem2);


        menuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                try {
                    JOptionPane.showMessageDialog(fr, "Tools entwickelt für CI 2019 Copyright by DEM Consulting");

                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Fehler");
                }

            }
        });

        this.fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(-1);
            }
        });

        fr.setContentPane(Panele);

        j1 = new JTextField("Tools von Daniel Hauch"); j1.setEditable(false);   j1.setSize(450,30); ;   Panele.add(j1);
        j2 = new JTextField("Wie ist Ihr Name?");   j2.setEditable(false); Panele.add(j2); j2.setSize(450,30);   Panele.add(j2);
        j3 = new JTextField("");   j3.setEditable(true); Panele.add(j2); j3.setSize(450,30);   Panele.add(j3);

        button1 = new JButton("Erfahren"); Panele.add(button1);

        j4 = new JTextField("Sie sterben in ___ Jahren!"); Panele.add(j4);


        ButtonGroup buttonGroup = new ButtonGroup();
        JButton szeit= new JButton("Sterbezeitpunkt");
        szeit.setBounds(100, 170, 100, 20);
        buttonGroup.add(szeit); Panele.add(szeit);
        JButton gtag = new JButton("zufällige Alter ausrechnen");
        gtag.setBounds(250, 170, 100, 20);
        buttonGroup.add(gtag);  Panele.add(gtag);

        JLabel auswahl = new JLabel("Ihre Auswahl:");
        auswahl.setBounds(10, 200, 100, 20);
        Panele.add(auswahl);
        final JTextField text1 = new JTextField("");
        text1.setBounds(100, 200, 300, 20);
        Panele.add(text1);

        szeit.addActionListener(new ActionListener() {
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

        fr.setVisible(true);
        fr.setAlwaysOnTop(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}



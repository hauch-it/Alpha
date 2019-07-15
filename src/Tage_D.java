import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.Date;

public class Tage_D extends JFrame {

    Icon icon1,icon2,icon3;
    JLabel bild1,bild2,bild3;

    JFrame fr = null;
    JPanel Panele = null;
    JTextField j1 = null;
    JTextField j2 = null;
    JTextField j3 = null;
    JTextField j4 = null;
    JMenuItem menuItem1 = null;
    JMenuItem menuItem2 = null;
    JMenuItem menuItem3 = null;
    JMenuBar bar =null;
    JMenu mF= null;
    JMenu mH = null;
    JMenu mI = null;

    public Tage_D() {

        fr = new JFrame("Coutinius Integration SS 2019");
        fr.setSize(1920,1080);
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

        menuItem1  = new JMenuItem("Hauptprogramm");    mF.add(menuItem1);
        menuItem2  = new JMenuItem("Exit");    mF.add(menuItem2);
        menuItem3  = new JMenuItem("Über");    mI.add(menuItem3);

        menuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                try {
                    JOptionPane.showMessageDialog(fr, "Wir wechseln zum Hauptprogramm");
                    Main mn = new Main();
                    fr.setVisible((false));
                    Panele.setVisible(false);
                    mn.fr.setVisible(true);
                    //System.exit(0);

                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Fehler");
                }
            }
        });

        menuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {
                try {
                    System.exit(-1);

                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Fehler");
                }
            }
        });

        menuItem3.addActionListener(new ActionListener() {
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

        Date datum=new Date();

        int year=datum.getYear() + 1900;
        j1 = new JTextField("Tools von Daniel Hauch",10); j1.setEditable(false);   j1.setSize(450,30); ;   bar.add(j1);
        j2 = new JTextField("Geben Sie hier jeweils nach Auswahl: Geburtsjahr, Hohchzeitsjahr, aktuelles Jahr ein! Bsp. 1969",50);   j2.setEditable(false); Panele.add(j2); j2.setSize(450,30);   Panele.add(j2);
        j3 = new JTextField("1969",10);   j3.setEditable(true); Panele.add(j2); j3.setSize(450,30);   Panele.add(j3);

        ButtonGroup buttonGroup = new ButtonGroup();
        JButton szeit= new JButton("Sterbezeitpunkt Erfahren");
        szeit.setBounds(100, 170, 100, 20);
        buttonGroup.add(szeit); Panele.add(szeit);

        szeit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {

                int ergebnis, zufall, zahl, i;
                zahl =  Integer.parseInt(j3.getText());
                zufall= gibZufall(zahl);

                while(zufall<=year){
                  //  System.out.println(zufall);

                    zufall = gibZufall(zahl);
                }
                    String resultat = new String("Sie werden im Jahre "+zufall+" möglicherweise sterben!");
                    j4.setText(resultat);
            }
        });


        JButton htag = new JButton("Silber-Gold-Diamant ausrechnen");
        htag.setBounds(250, 170, 100, 20);
        buttonGroup.add(htag);  Panele.add(htag);

        htag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ie) {

                int diamant, gold, silber, zufall, zahl, i;
                zahl =  Integer.parseInt(j3.getText());
                diamant=zahl+60;
                gold=zahl+50;
                silber=zahl+25;
                String resultat = new String("Sie werden im Jahr "+silber+" Ihre Silberhochzeit, im Jahr "+gold+" Ihre Goldene Hochzeit und im Jahr "+diamant+" Diamanten Hochzeit feiern.");
                j4.setText(resultat);
            }
        });

        j4 = new JTextField("Hier erfahren Sie Ergebnisse aus Ihrer Auswahl",8 0); Panele.add(j4);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Methode gibt eine ganze Zahl (int) zurück
    public static int gibZufall (int zahl) {

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(115) + 1;

        int zufall = zahl + randomInt;

        return zufall;
    }
}